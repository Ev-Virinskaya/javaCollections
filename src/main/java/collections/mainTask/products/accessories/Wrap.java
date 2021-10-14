package collections.mainTask.products.accessories;

import collections.mainTask.products.Product;
import collections.mainTask.products.accessories.types.SizeWrap;
import collections.mainTask.products.accessories.types.TypeWrap;

public class Wrap extends Product {
    private TypeWrap typeWrap;
    private SizeWrap sizeWrap;
    private String color;

    public Wrap(double cost, TypeWrap typeWrap, SizeWrap sizeWrap, String color) {
        super(cost);
        this.typeWrap = typeWrap;
        this.sizeWrap = sizeWrap;
        this.color = color;
    }
}
