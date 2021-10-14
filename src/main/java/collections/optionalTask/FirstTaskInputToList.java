package collections.optionalTask;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstTaskInputToList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Path.of(scanner.nextLine()));
            list.forEach(System.out::println);
            List<String> outputList = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                outputList.add(list.get(i));
            }
            Files.write(Path.of(scanner.nextLine()), outputList);
        } catch (Exception e) {
            System.out.println("Error " + e);

        }
    }
}
