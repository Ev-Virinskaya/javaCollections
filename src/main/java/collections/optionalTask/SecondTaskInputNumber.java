package collections.optionalTask;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class SecondTaskInputNumber {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader
                (new FileReader(new Scanner(System.in).nextLine()))) {
            Stack<Character> stack = new Stack<>();
            while (reader.ready()) {
                stack.add((char) reader.read());
            }
            StringBuilder number = new StringBuilder();
            while (!stack.empty()) {
                number.append(stack.pop());
            }
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
