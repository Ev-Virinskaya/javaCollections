package collections.mainTask.products.flowers;

import collections.mainTask.products.flowers.Flower;
import collections.mainTask.products.flowers.types.GerberaVariety;

import java.time.LocalDateTime;

public class Gerbera extends Flower {
    private GerberaVariety gerberaVariety;

    public Gerbera(double cost, int stemLength, LocalDateTime dateManufacture,
                   String color, GerberaVariety gerberaVariety) {
        super(cost, stemLength, dateManufacture, color);
        this.gerberaVariety = gerberaVariety;
    }

    public GerberaVariety getGerberaVariety() {
        return gerberaVariety;
    }

    @Override
    public String toString() {
        return "Gerbera{" +
                "gerberaVariety=" + gerberaVariety +
                '}';
    }
}
