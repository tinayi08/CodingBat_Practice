package DataStructure.LinkedList.Exercise1;

import java.util.LinkedList;

public class Exercise1 {

    public static void main(String[] args) {
        Animal dog = new Animal(1, "dog", "brown");
        Animal cat = new Animal(2, "cat", "white");
        Animal fish = new Animal(3, "fish", "yellow");
        System.out.println(dog.animalInformation());
        System.out.println(cat.animalInformation());
        System.out.println(fish.animalInformation());
        System.out.println("---");
        Node node1 = new Node(dog);
        Node node2 = new Node(cat);
        Node node3 = new Node(fish);
        node1.next = node2;
        node2.next = node3;
        node2.previous = node1;
        System.out.println(node2.previous.item.animalInformation());
        System.out.println(node1.next.item.animalInformation());
        System.out.println(node2.next.item.animalInformation());

        System.out.println("---");
        LinkedList<Animal> list = new LinkedList<>();
        list.add(dog);
        list.add(cat);
        list.add(fish);

        System.out.println(list.get(1).animalInformation());
        list.push(fish);
        System.out.println(list.get(1));
        System.out.println();
    }
}
