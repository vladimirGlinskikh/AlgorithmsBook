package infix;

//преобразование инфиксной записи в постфиксную
public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }

    //преобразование в постфиксную форму
    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.displayStack("For " + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1); // извлечение операторов
                    break; // приоритет 1
                case '*':
                case '/':
                    gotOper(ch, 2); // извлечение операторов
                    break; // приоритет 2
                case '(': // открывающая круглая скобка
                    theStack.push(ch); // занести в стек
                    break;
                case ')': // закрывающая круглая скобка
                    gotParen(ch); // извлечение операторов
                    break;
                default: // остается операнд
                    output += ch; // записать в выходную строку
                    break;
            }
        }
        // извлечение оставшихся операторов
        while (!theStack.isEmpty()) {
            theStack.displayStack("While ");// диагностика
            output += theStack.pop(); // write to output
        }
        theStack.displayStack("End  ");
        return output; // возвращение постфиксного выражения
    }

    // чтение оператора из входной строки
    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') { // если это '('
                theStack.push(opTop); // вернуть '('
                break;
            } else {
                int prec2; // приоритет нового оператора
                if (opTop == '+' || opTop == '-') // определение приоритета
                    prec2 = 1;
                else
                    prec2 = 2;
                // если приоритет нового оператора
                // меньше приоритета старого
                // сохранить новый оператор
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else // приоритет нового оператора меньше приоритета старого
                    output += opTop;
            }
        }
        theStack.push(opThis); // занесение в стек нового оператора
    }

    // прочитата закрывающая скобка
    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            // если извлечен элемент '('
            // прервать выполнение
            // если извлечен оператор
            // вывести в постфиксную строку
            if (chx == '(')
                break;
            else output += chx;
        }
    }
}
