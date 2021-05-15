package DataStructure.LinkedList.Exercise1;

public class Student implements Item {
    int id;
    String name;
    int age;
    Node node;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Node getNode() {
        return node;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String studentInformation() {
        return "This " + getName() + " is " + getAge() + " years old.";
    }

    @Override
    public String getInformation() {
        return getName() + " is " + getAge() + " years old.";
    }
}
