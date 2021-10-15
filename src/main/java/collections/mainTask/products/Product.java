package collections.mainTask.products;

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

}
