package collections.mainTask.products.flowers;

import collections.mainTask.products.Product;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Flower extends Product {

    private int stemLength;
    private LocalDateTime dateManufacture;
    private String color;


    public Flower(double cost, int stemLength, LocalDateTime dateManufacture, String color) {
        super(cost);
        this.stemLength = stemLength;
        this.dateManufacture = dateManufacture;
        this.color = color;

    }

    public Flower() {
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
        Duration duration = Duration.between(dateManufacture, LocalDateTime.now());
        return duration.toHours();
    }

    @Override
    public String toString() {
        return "Flower{" +
                "stemLength=" + stemLength +
                ", dateManufacture=" + dateManufacture +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower flower)) return false;
        if (!super.equals(o)) return false;
        return getStemLength() == flower.getStemLength() && Objects.equals(getDateManufacture(), flower.getDateManufacture()) && Objects.equals(getColor(), flower.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStemLength(), getDateManufacture(), getColor());
    }
}
