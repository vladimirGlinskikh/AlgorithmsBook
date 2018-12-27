package reverseWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString(); // чтение строки с клавиатуры
            if (input.equals(""))// завершение, если [Enter]
                break;

            Reverser theReverser = new Reverser(input); // создание объекта Reverser
            output = theReverser.doRev(); // использование
            System.out.println("Reversed: " + output);

        }
    }

    private static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
