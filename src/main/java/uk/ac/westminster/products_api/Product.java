package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}


    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
// if there are no get methode for a field, it is never called hence the field is skipped

    public Long getId() { return id;}

    public String getName() { return name; }

    public double getPrice() { return price; }

}
