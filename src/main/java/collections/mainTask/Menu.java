package collections.mainTask;

import collections.mainTask.products.*;
import collections.mainTask.products.accessories.*;
import collections.mainTask.products.accessories.types.*;
import collections.mainTask.products.flowers.*;
import collections.mainTask.products.flowers.types.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //switch ()
        Bouquet bouquet = new Bouquet(collectBouquet());
        bouquet.getPriceBouquet();
        bouquet.sortFlowersByFresh();
        System.out.println(bouquet.findFlowerByStemLength(7, 10));

    }

    public static List<Product> collectBouquet() {
        Product redPeonyBush = new Peony(2, 10,
                LocalDateTime.of(2021, 10, 14, 17, 0),
                "red", PeonyVariety.PEONY_BUSH);
        Product pinkTerryPeony = new Peony(2.3, 8,
                LocalDateTime.of(2021, 10, 10, 10, 0),
                "pink", PeonyVariety.TERRY_PEONY);
        Product whitePeonyJapanese = new Peony(3, 12,
                LocalDateTime.of(2021, 10, 12, 16, 20),
                "white", PeonyVariety.PEONY_JAPANESE);
        Product pinkPeonyRose = new Rose(4, 8,
                LocalDateTime.of(2021, 10, 13, 17, 10),
                "pink", RoseVariety.PEONY_ROSE);
        Product redGardenRose = new Rose(1, 5,
                LocalDateTime.of(2021, 10, 12, 13, 40),
                "red", RoseVariety.GARDEN_ROSE);
        Product redGerbera = new Gerbera(1.2, 6,
                LocalDateTime.of(2021, 10, 14, 15, 40),
                "red", GerberaVariety.GERBERA_COMMON);
        Product blueGerberaMini = new Gerbera(2, 10,
                LocalDateTime.of(2021, 10, 14, 17, 40),
                "blue", GerberaVariety.GERBERA_MINI);
        Product blueTextileWrap = new Wrap(5, TypeWrap.TEXTILE, SizeWrap.BIG, "blue");
        Product blackPaperWrap = new Wrap(4, TypeWrap.PAPER, SizeWrap.MIDDLE, "black");
        Product yellowCircleBox = new Box(7, ShapeBox.CIRCLE, SizeWrap.LARGE, "yellow");

        List<Product> bouquet = new ArrayList<>();


        System.out.println("""
                Собери свой букет:\s
                Чтобы добавить цветок или упаковку в букет введите соответствующие символы:\s
                Красный кустовой пион : 1\s
                Рoзовый мохровый пион: 2\s
                Белый японский пион: 3\s
                Розовая пионовидная роза: 4\s
                Красная содовая роза: 5\s
                Красная гербера: 6\s
                Синяя мини гербера: 7\s
                Голубая текстильная обертка: 8\s
                Черная упаковочная бумага: 9\s
                Желтая круглая коробка: 10\s
                """);
        System.out.println("Для завершения выбора нажмите: 0");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        while (!choose.equals("0")) {
            switch (choose) {
                case "1" -> bouquet.add(redPeonyBush);
                case "2" -> bouquet.add(pinkTerryPeony);
                case "3" -> bouquet.add(whitePeonyJapanese);
                case "4" -> bouquet.add(pinkPeonyRose);
                case "5" -> bouquet.add(redGardenRose);
                case "6" -> bouquet.add(redGerbera);
                case "7" -> bouquet.add(blueGerberaMini);
                case "8" -> bouquet.add(blueTextileWrap);
                case "9" -> bouquet.add(blackPaperWrap);
                case "10" -> bouquet.add(yellowCircleBox);
                default -> System.out.println("Недопустимое значение");
            }
            choose = scanner.nextLine();
        }
        return bouquet;
    }


}
