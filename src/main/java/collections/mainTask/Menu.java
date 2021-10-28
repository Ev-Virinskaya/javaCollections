package collections.mainTask;

import collections.mainTask.products.*;
import collections.mainTask.products.accessories.*;
import collections.mainTask.products.accessories.types.*;
import collections.mainTask.products.flowers.*;
import collections.mainTask.products.flowers.types.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static List<Product> catalog = Arrays.asList(
            new Peony("Красные кустистые пеоны", 2, 10,
                    LocalDateTime.of(2021, 10, 14, 17, 0),
                    "red", PeonyVariety.PEONY_BUSH),
            new Peony("Розовые мохровые пионы", 2.3, 8,
                    LocalDateTime.of(2021, 10, 10, 10, 0),
                    "pink", PeonyVariety.TERRY_PEONY),
            new Peony("Белые японские пионы", 3, 12,
                    LocalDateTime.of(2021, 10, 12, 16, 20),
                    "white", PeonyVariety.PEONY_JAPANESE),
            new Rose("Розовые пионовидные розы", 4, 8,
                    LocalDateTime.of(2021, 10, 13, 17, 10),
                    "pink", RoseVariety.PEONY_ROSE),
            new Rose("Красные садовые розы", 1, 5,
                    LocalDateTime.of(2021, 10, 12, 13, 40),
                    "red", RoseVariety.GARDEN_ROSE),
            new Gerbera("Красные герберы обычные", 1.2, 6,
                    LocalDateTime.of(2021, 10, 14, 15, 40),
                    "red", GerberaVariety.GERBERA_COMMON),
            new Gerbera("Голубые герберы Мини", 2, 10,
                    LocalDateTime.of(2021, 10, 14, 17, 40),
                    "blue", GerberaVariety.GERBERA_MINI),
            new Wrap("Голубая органза", 5, TypeWrap.TEXTILE, SizeWrap.BIG, "blue"),
            new Wrap("Черная оберточная бумага", 4, TypeWrap.PAPER, SizeWrap.MIDDLE, "black"),
            new Box("Желтая коробка большая", 7, ShapeBox.CIRCLE, SizeWrap.LARGE, "yellow"));

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(catalog);

        message();
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        while (!choose.equals("0")) {
            if (choose.equals("1")) {
                bouquet.getPriceBouquet();
            } else if (choose.equals("2")) {
                bouquet.sortFlowersByFresh();
            } else if (choose.equals("3")) {
                subMenuChooseStemLength(scanner, bouquet);
            } else if (choose.isEmpty()) {
                System.out.println();
            } else {
                System.out.println("Введено неверное значение");
                message();
            }

            choose = scanner.nextLine();
        }
    }

    public static void subMenuChooseStemLength(Scanner scanner, Bouquet bouquet) {

        System.out.println("Введите минимальную длинну в цифрах (1 = 1см): ");
        int bottom = scanner.nextInt();
        System.out.println("Введите максимальную длинну в цифрах (1 = 1см): ");
        int top = scanner.nextInt();
        if (bottom <= top) {
            bouquet.findFlowerByStemLength(bottom, top);
        } else {
            System.out.println("Нижняя граница не может быть больше верхней." +
                    "Выберите другие значения");
            subMenuChooseStemLength(scanner, bouquet);
        }
    }

    public static void message() {
        System.out.println("""
                Чтобы узнать стоимость букета нажмите : 1\s
                Чтобы отсортировать цветы по их свежести нажмите : 2\s
                Чтобы найти цветы с длинной в указаном диапозоне нажмите : 3\s
                Для выхода из программы нажмите : 0\s
                """);
    }
}
