package DataStructure.LinkedList.Exercise1;

import java.util.LinkedList;

public class Exercise1 {

    public static void main(String[] args) {
        Animal dog = new Animal(1, "dog", "brown");
        Animal cat = new Animal(2, "cat", "white");
        Animal fish = new Animal(3, "fish", "yellow");
        System.out.println(dog.getInformation());
        System.out.println(cat.getInformation());
        System.out.println(fish.getInformation());
        System.out.println("---");
        Node node1 = new Node(dog);
        Node node2 = new Node(cat);
        Node node3 = new Node(fish);
        node1.next = node2;
        node2.next = node3;
        node2.previous = node1;
        System.out.println(node2.previous.item.getInformation());
        //Animal animal1 = (Animal) node1.next.item;
        //System.out.println(animal1.getInformation());
        System.out.println(node1.next.item.getInformation());
        System.out.println(node2.next.item.getInformation());

        System.out.println("---");
        LinkedList<Animal> list = new LinkedList<>();
        list.add(dog);
        list.add(cat);
        list.add(fish);

        System.out.println(list.get(1).getInformation());
        list.push(fish);
        System.out.println(list.get(1));
        System.out.println();

        Student student1 = new Student(1, "tina", 28);
        Student student2 = new Student (2, "Donda", 37);
        Student student3 = new Student(3, "ryan", 39);

        Node node4 = new Node(student1);
        Node node5 = new Node(student2);
        Node node6 = new Node(student3);

        node4.next = node5;
        node5.next = node6;
        System.out.println(student1.getInformation());
        System.out.println(node4.next.item.getInformation());
        System.out.println(node4.item.getInformation());

    }
}
