package collections.optionalTask;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTaskCatalogList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path pathToCatalog = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> allElement = Files.newDirectoryStream(pathToCatalog)) {

            List<Path> listCatalog = new ArrayList<>();
            allElement.forEach(s -> listCatalog.add(s));
            listCatalog.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
