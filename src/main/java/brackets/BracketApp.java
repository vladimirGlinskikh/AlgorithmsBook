package brackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    private static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
