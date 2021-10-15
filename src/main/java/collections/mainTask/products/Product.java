package collections.mainTask.products;

import java.util.Objects;

public abstract class Product {
    private double cost;


    public Product(double cost) {
        this.cost = cost;

    }

    public Product() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost());
    }
}
