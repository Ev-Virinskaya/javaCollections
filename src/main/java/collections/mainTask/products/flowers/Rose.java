package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.types.RoseVariety;

import java.time.LocalDateTime;
import java.util.Objects;

public class Rose extends Flower{
    private RoseVariety roseVariety;

    public Rose(double cost,  int stemLength, LocalDateTime dateManufacture, String color, RoseVariety roseVariety) {
        super(cost, stemLength, dateManufacture, color);
        this.roseVariety = roseVariety;
    }

    public RoseVariety getRoseVariety() {
        return roseVariety;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "roseVariety=" + roseVariety +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        return getRoseVariety() == rose.getRoseVariety();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRoseVariety());
    }
}
