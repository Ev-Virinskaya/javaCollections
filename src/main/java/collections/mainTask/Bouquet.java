package collections.mainTask;

import collections.mainTask.products.Product;
import collections.mainTask.products.flowers.Flower;

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

    public double getPriceBouquet () {
        double priceBouquet = 0;
        for (Product product: bouquet) {
            priceBouquet += product.getCost();
        }
        return priceBouquet;
    }

    public List<Flower> sortFlowersByFresh(){
        List<Flower> sortedFlowersByFresh = null;
        for (Product flower: bouquet) {
            if(flower instanceof Flower) {
                sortedFlowersByFresh.add((Flower)flower);
            }
        }
        sortedFlowersByFresh.sort((flowerOne, flowerTwo) -> (int) flowerOne.findFresh() - (int)flowerTwo.findFresh());
        return sortedFlowersByFresh;
    }

    public Product findFlowerByStemLength (int topLengthRange, int bottomLengthRang) throws NoSuchElementException {
        return bouquet.stream().filter(product -> product instanceof Flower)
                .filter(product -> ((Flower) product).getStemLength() >= bottomLengthRang
                        && ((Flower) product).getStemLength()<=topLengthRange).findFirst().get();
    }
}
