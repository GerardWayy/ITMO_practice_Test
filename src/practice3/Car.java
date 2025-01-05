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

    public void printAll(){
        System.out.println(color);
    }
    public static void main(String[] args) {

    }
}
