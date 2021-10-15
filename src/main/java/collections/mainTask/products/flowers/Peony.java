package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.types.PeonyVariety;

import java.time.LocalDateTime;

public class Peony extends Flower{
    private PeonyVariety peonyVariety;

    public Peony(double cost, int stemLength, LocalDateTime dateManufacture, String color, PeonyVariety peonyVariety) {
        super(cost, stemLength, dateManufacture, color);
        this.peonyVariety = peonyVariety;
    }

    public PeonyVariety getPeonyVariety() {
        return peonyVariety;
    }

    @Override
    public String toString() {
        return "Peony{" +
                "peonyVariety=" + peonyVariety +
                '}';
    }
}
