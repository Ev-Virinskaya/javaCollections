package collections.mainTask.products.flowers;

import collections.mainTask.products.Product;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Flower extends Product {

    private int stemLength;
    private LocalDateTime dateManufacture;
    private String color;

    public Flower(double cost, int stemLength,
                  LocalDateTime dateManufacture, String color) {
        super(cost);

        this.stemLength = stemLength;
        this.dateManufacture = dateManufacture;
        this.color = color;
    }



    public int getStemLength() {
        return stemLength;
    }

    public LocalDateTime getDateManufacture() {
        return dateManufacture;
    }

    public String getColor() {
        return color;
    }

    public long findFresh() {
       Duration duration = Duration.between(LocalDateTime.now(), dateManufacture);
       long dur = duration.toMinutes();
        return 0;
    }

}
