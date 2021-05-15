package DataStructure.LinkedList.Exercise1;

public class Animal implements  Item {

    int id;
    String name;
    String color;
    Node node;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animal(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    public String getInformation() {
        return "This " + getName() + " is " + getColor() + ".";
    }
}
