

public class Laptop {
    private int ram; //озу оперативная память
    private int ssd;
    private String os;
    private double diagonal;
    private int price;

    public Laptop(int ram, int ssd, String os, double diagonal, int price) {
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.diagonal = diagonal;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ram + " " + ssd + " " + os + " " + diagonal + " " + price;
    }

}