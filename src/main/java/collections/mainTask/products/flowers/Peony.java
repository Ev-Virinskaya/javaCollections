package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.types.PeonyVariety;

import java.time.LocalDateTime;
import java.util.Objects;

public class Peony extends Flower{
    private PeonyVariety peonyVariety;

    public Peony(String name, double cost, int stemLength, LocalDateTime dateManufacture, String color, PeonyVariety peonyVariety) {
        super(name,cost, stemLength, dateManufacture, color);
        this.peonyVariety = peonyVariety;
    }

    public PeonyVariety getPeonyVariety() {
        return peonyVariety;
    }

    public Peony() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Peony)) return false;
        if (!super.equals(o)) return false;
        Peony peony = (Peony) o;
        return getPeonyVariety() == peony.getPeonyVariety();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPeonyVariety());
    }

    @Override
    public String toString() {
        return "Peony{" +
                "peonyVariety=" + peonyVariety +
                "} " + super.toString();
    }
}
