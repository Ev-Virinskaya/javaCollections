package collections.optionalTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EighthTaskEnglishWords {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader
                (new FileReader(new Scanner(System.in).nextLine()))) {
            Set<String> uniqueWords = new HashSet<>();

            while (reader.ready()) {
                uniqueWords.addAll(Arrays.asList(reader.readLine().toLowerCase().split(" ")));
            }
            uniqueWords.forEach(System.out::println);


        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
