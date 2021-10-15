package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.types.RoseVariety;

import java.time.LocalDateTime;
import java.util.Objects;

public class Rose extends Flower{
    private RoseVariety roseVariety;

    public Rose(String name, double cost,  int stemLength, LocalDateTime dateManufacture, String color, RoseVariety roseVariety) {
        super(name,cost, stemLength, dateManufacture, color);
        this.roseVariety = roseVariety;
    }

    public Rose(RoseVariety roseVariety) {
        this.roseVariety = roseVariety;
    }

    public Rose() {
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public int getStemLength() {
        return super.getStemLength();
    }

    @Override
    public LocalDateTime getDateManufacture() {
        return super.getDateManufacture();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public long findFresh() {
        return super.findFresh();
    }

    public RoseVariety getRoseVariety() {
        return roseVariety;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "roseVariety=" + roseVariety +
                "} " + super.toString();
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
