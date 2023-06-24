package bt03;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputData() {
        System.out.print("Nhập tên: ");
        this.name = InputMethos.getString();
        System.out.print("Nhập giá: ");
        this.price = InputMethos.getDouble();
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price=" + price;
    }
}
