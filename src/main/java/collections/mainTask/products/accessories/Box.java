package collections.mainTask.products.accessories;

import collections.mainTask.products.Product;
import collections.mainTask.products.accessories.types.ShapeBox;
import collections.mainTask.products.accessories.types.SizeWrap;

import java.util.Objects;

public class Box extends Product {
    private ShapeBox shapeBox;
    private SizeWrap sizeWrap;
    private String color;

    public Box(String name, double cost, ShapeBox shapeBox, SizeWrap sizeWrap, String color) {
        super(name, cost);
        this.shapeBox = shapeBox;
        this.sizeWrap = sizeWrap;
        this.color = color;
    }

    public Box() {
    }

    public ShapeBox getShapeBox() {
        return shapeBox;
    }

    public SizeWrap getSizeWrap() {
        return sizeWrap;
    }

    public String getColor(){
        return color;
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return "Box{" +
                "shapeBox=" + shapeBox +
                ", sizeWrap=" + sizeWrap +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        if (!super.equals(o)) return false;
        Box box = (Box) o;
        return getShapeBox() == box.getShapeBox() && getSizeWrap() == box.getSizeWrap() && Objects.equals(getColor(), box.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShapeBox(), getSizeWrap(), getColor());
    }
}
