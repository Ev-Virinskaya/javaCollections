package collections.mainTask.products.accessories;

import collections.mainTask.products.Product;
import collections.mainTask.products.accessories.types.ShapeBox;
import collections.mainTask.products.accessories.types.SizeWrap;

public class Box extends Product {
    private ShapeBox shapeBox;
    private SizeWrap sizeWrap;
    private String color;

    public Box(double cost, ShapeBox shapeBox, SizeWrap sizeWrap, String color) {
        super(cost);
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
}
