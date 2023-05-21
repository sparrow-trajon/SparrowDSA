package main.solids.single.responsibility;

public class Product {

    int id;
    String description;
    String modelNo;
    int price;


    public Product(int id, String description, String modelNo, int price) {
        this.id = id;
        this.description = description;
        this.modelNo = modelNo;
        this.price = price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", price=" + price +
                '}';
    }
}
