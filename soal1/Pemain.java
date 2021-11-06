package soal1;

public class Pemain {
    String name;
    int height;
    int power;

    public Pemain(String name, int height, int power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }

    public void print() {
        System.out.println(name + " ( " + height + ", " + power + ")");
    }
}
