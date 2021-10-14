package collections.optionalTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SixthTaskSortedList {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader
                        (new FileReader(new Scanner(System.in).nextLine()))) {
            List<String> poem = new ArrayList<>();
            while (reader.ready()) {
                poem.add(reader.readLine());
            }
            Collections.sort(poem);
            poem.forEach(System.out::println);

        } catch (IOException e){
            e.getStackTrace();
        }
    }
}