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

    public double getPriceBouquet() {
        double priceBouquet = 0;
        for (Product product : bouquet) {
            priceBouquet += product.getCost();
        }
        return priceBouquet;
    }

    public void sortFlowersByFresh() {
        List<Flower> sortedFlowersByFresh = new ArrayList<>();
        for (Product flower : bouquet) {
            if (flower instanceof Flower) {
                sortedFlowersByFresh.add((Flower) flower);
            }
        }
        sortedFlowersByFresh.sort((flowerOne, flowerTwo) -> (int) flowerOne.findFresh() - (int) flowerTwo.findFresh());
        sortedFlowersByFresh.forEach(System.out::println);
    }

    public Product findFlowerByStemLength(int bottomLengthRang, int topLengthRange) {

        return bouquet.stream().filter(product -> product instanceof Flower)
                .filter(product -> ((Flower) product).getStemLength() >= bottomLengthRang
                        && ((Flower) product).getStemLength() <= topLengthRange).findFirst().get();
    }
}
