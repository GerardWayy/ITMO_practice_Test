package practice3;

public class Tree {

    private int age;
    private boolean live;
    private String name;



    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean live) {
        this.age = age;
        this.name = name;
        this.live = live;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(13, "Doob");
        Tree tree2 = new Tree(10, "bereza", true);

      
    }


}
