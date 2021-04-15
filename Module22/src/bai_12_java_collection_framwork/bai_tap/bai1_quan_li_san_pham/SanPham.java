package bai_12_java_collection_framwork.bai_tap.bai1_quan_li_san_pham;

public class SanPham {
    private String name;
    private int id;
    private double price;

    public SanPham(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SanPham| " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '|';
    }
}
