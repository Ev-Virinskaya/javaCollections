package collections.mainTask;

import collections.mainTask.products.Product;
import collections.mainTask.products.flowers.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Bouquet {
    List<Product> bouquet;

    public Bouquet(List<Product> bouquet) {
        this.bouquet = bouquet;
    }

    public Bouquet() {
    }

    public List<Product> getBouquet() {
        return bouquet;
    }


    public void setBouquet(List<Product> bouquet) {
        this.bouquet = bouquet;
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
            System.out.println(flower.findFresh() + " часов с момента поставки: " + flower);

        }
    }

    public void findFlowerByStemLength(int bottomLengthRang, int topLengthRange) {

        List<Product> flowersSortedByStemLength =  bouquet.stream().filter(product -> product instanceof Flower)
                .filter(product -> ((Flower) product).getStemLength() >= bottomLengthRang
                        && ((Flower) product).getStemLength() <= topLengthRange).toList();

        if(flowersSortedByStemLength.size() == 0) {
            System.out.println("Цветов с такой длинной стебле нет в каталоге");
        }
        System.out.println(flowersSortedByStemLength.get(0));
    }
}
