package collections.mainTask.products;

import java.util.Objects;

public abstract class Product {
    private double cost;
    private String name;


    public Product(String name,double cost) {
        this.cost = cost;
        this.name = name;

    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getCost(), getCost()) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
