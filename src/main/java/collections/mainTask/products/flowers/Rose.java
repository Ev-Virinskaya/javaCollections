package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.types.RoseVariety;

import java.time.LocalDateTime;

public class Rose extends Flower{
    private RoseVariety roseVariety;

    public Rose(double cost,  int stemLength, LocalDateTime dateManufacture, String color, RoseVariety roseVariety) {
        super(cost, stemLength, dateManufacture, color);
        this.roseVariety = roseVariety;
    }

    public RoseVariety getRoseVariety() {
        return roseVariety;
    }
}
