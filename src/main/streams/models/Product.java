package models;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Product {

    private Long id;

    private String name;
    private String category;
    private Double price;
    private Set<Order> orders;


    public static void main(String[] args) {
        List<Product> products= new ArrayList<>();

        getBookWithPrice(100);
    }

    private static void getBookWithPrice(int i) {

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", orders=" + orders +
                '}';
    }
}