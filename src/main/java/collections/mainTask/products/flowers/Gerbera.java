package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.Flower;
import collections.mainTask.products.flowers.types.GerberaVariety;

import java.time.LocalDateTime;
import java.util.Objects;

public class Gerbera extends Flower {
    private GerberaVariety gerberaVariety;

    public Gerbera(String name, double cost, int stemLength, LocalDateTime dateManufacture,
                   String color, GerberaVariety gerberaVariety) {
        super(name,cost, stemLength, dateManufacture, color);
        this.gerberaVariety = gerberaVariety;
    }

    public Gerbera() {
    }

    public GerberaVariety getGerberaVariety() {
        return gerberaVariety;
    }

    public Gerbera(String name, double cost, int stemLength, LocalDateTime dateManufacture, String color) {
        super(name,cost, stemLength, dateManufacture, color);
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
    public double getCost() {
        return super.getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gerbera)) return false;
        if (!super.equals(o)) return false;
        Gerbera gerbera = (Gerbera) o;
        return getGerberaVariety() == gerbera.getGerberaVariety();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGerberaVariety());
    }

    @Override
    public String toString() {
        return "Gerbera{" +
                "gerberaVariety=" + gerberaVariety +
                "} " + super.toString();
    }
}
