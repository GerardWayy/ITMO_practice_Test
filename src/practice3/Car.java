package practice3;

public class Car {

    private String color;
    private int weight;
    private String name;

    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Car(int weight, String color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;

    }

    public void printAll() {
        System.out.println(this.color + " " + this.weight + " " + this.name);

    }

    public static void main(String[] args) {
        Car car = new Car(35, "red", "lad");
        Car car1 = new Car(35, "blue", "fer");
        car.printAll();
        car1.printAll();

    }
}
