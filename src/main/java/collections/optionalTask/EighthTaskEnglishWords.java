package collections.optionalTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EighthTaskEnglishWords {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader
                        (new FileReader(new Scanner(System.in).nextLine()))) {



        }catch (IOException e) {
            e.getStackTrace();
        }
    }
}
