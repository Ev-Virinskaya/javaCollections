package collections.optionalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthTaskPoem {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String line = scanner.nextLine();
            List<String> poem = new ArrayList<>();
            while (!line.equals("")){
                poem.add(line);
                line = scanner.nextLine();
            }
            List<String> sortedPoem = poem.stream().sorted((s1,s2)-> Integer.compare(s1.length(), s2.length())).toList();
            poem.forEach(System.out::println);
            System.out.println();
            sortedPoem.forEach(System.out::println);
        }
    }
}
