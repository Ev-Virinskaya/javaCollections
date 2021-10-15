package collections.mainTask;

import collections.mainTask.products.Product;
import collections.mainTask.products.flowers.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Bouquet {

    List<Product> bouquet;

    public Bouquet(List<Product> bouquet) {
        this.bouquet = bouquet;
    }

    public Bouquet() {
    }

    public void getPriceBouquet() {
        double priceBouquet = 0;
        for (Product product : bouquet) {
            priceBouquet += product.getCost();
        }
        System.out.println("Цена букета: " + priceBouquet + " денег");
    }

    public void sortFlowersByFresh() {
        List<Flower> sortedFlowersByFresh = new ArrayList<>();
        for (Product flower : bouquet) {
            if (flower instanceof Flower) {
                sortedFlowersByFresh.add((Flower) flower);
            }
        }
        sortedFlowersByFresh.sort((flowerOne, flowerTwo) -> (int) flowerOne.findFresh() - (int) flowerTwo.findFresh());
        for (Flower flower : sortedFlowersByFresh) {
            System.out.println(flower.findFresh() + " часов с момента поставки: " + flower.getName() + " (" + flower.getDateManufacture() + ")");

        }
    }


    public void findFlowerByStemLength(int bottomLengthRang, int topLengthRange) {

        List<Product> flowersSortedByStemLength = bouquet.stream().filter(product -> product instanceof Flower)
                .filter(product -> ((Flower) product).getStemLength() >= bottomLengthRang
                        && ((Flower) product).getStemLength() <= topLengthRange).collect(Collectors.toList());

        if (flowersSortedByStemLength.size() == 0) {
            System.out.println("Цветов с такой длинной стебля нет в каталоге. \nЧтобы найти цветы с другим размером стебля снова нажмите 3");
        } else {
            for (Product flower : flowersSortedByStemLength) {
                System.out.println(flower.getName() + " - " + ((Flower) flower).getStemLength() + " см");
            }
        }
    }

    public List<Product> getBouquet() {
        return bouquet;
    }


    public void setBouquet(List<Product> bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet bouquet1)) return false;
        return Objects.equals(getBouquet(), bouquet1.getBouquet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBouquet());
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + bouquet +
                '}';
    }
}
