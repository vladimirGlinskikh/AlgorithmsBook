package infix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString(); // чтение строки с клавиатуры
            if (input.equals("")) // выход, если нажата клавиша [Enter]
                break;

            // создание объекта-преобразователя
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans(); // преобразование
            System.out.println("Postfix is " + output + '\n');
        }
    }

    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }
}
