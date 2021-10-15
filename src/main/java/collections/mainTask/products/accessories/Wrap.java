package collections.mainTask.products.accessories;

import collections.mainTask.products.Product;
import collections.mainTask.products.accessories.types.SizeWrap;
import collections.mainTask.products.accessories.types.TypeWrap;

import java.util.Objects;

public class Wrap extends Product {
    private TypeWrap typeWrap;
    private SizeWrap sizeWrap;
    private String color;

    public Wrap(String name,double cost, TypeWrap typeWrap, SizeWrap sizeWrap, String color) {
        super(name,cost);
        this.typeWrap = typeWrap;
        this.sizeWrap = sizeWrap;
        this.color = color;
    }

    public Wrap() {
    }

    public TypeWrap getTypeWrap() {
        return typeWrap;
    }

    public SizeWrap getSizeWrap() {
        return sizeWrap;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wrap)) return false;
        if (!super.equals(o)) return false;
        Wrap wrap = (Wrap) o;
        return getTypeWrap() == wrap.getTypeWrap() && getSizeWrap() == wrap.getSizeWrap() && Objects.equals(getColor(), wrap.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeWrap(), getSizeWrap(), getColor());
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "typeWrap=" + typeWrap +
                ", sizeWrap=" + sizeWrap +
                ", color='" + color + '\'' +
                '}';
    }
}
