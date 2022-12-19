package edu.umsl;
import java.util.*;

interface Reproduction{
    String modeOfReproduction();
}
abstract class Creature{
    abstract String eatFood();
}



//Plant subclass
class Plant extends Creature implements Reproduction{

    private String name;
    public Plant(String name) {
        this.name= name;
    }

    public String eatFood() {
        return "sunlight (aka photosynthesis)";
    }

    public String modeOfReproduction() {
        return "Seeds";
    }

    public String toString() {
        return "Plant "+name+" using "+modeOfReproduction()+" mode of reproduction and it eat food as "+eatFood();
    }
}


//Animal subclass
class Animal extends Creature implements Reproduction{
    private String name;
    public Animal(String name) {
        this.name= name;
    }
    public String eatFood() {
        return "ingestion";
    }
    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }
    public String toString() {
        return "Animal "+name+" using "+modeOfReproduction()+" mode of reproduction and it eat food as "+eatFood();
    }
}


//Fungi subclass
class Fungi extends Creature implements Reproduction{
    private String name;
    public Fungi(String name) {
        this.name= name;
    }
    public String eatFood() {
        return "external digestion with hyphae";
    }
    public String modeOfReproduction() {
        return "Spores";
    }
    public String toString() {
        return "Fungi "+name+" using "+modeOfReproduction()+" mode of reproduction and it eat food as "+eatFood();
    }
}


public class CreatureTest {

    public static void main(String[] args) {
//Plant set
        Set<Plant> plants= new HashSet<>();
        plants.add(new Plant("Amaryllis"));
        plants.add(new Plant("Calla Lily"));
//Animal set
        Set<Animal> animals= new HashSet<>();
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));
//Fungi set
        Set<Fungi> fungi= new HashSet<>();
        fungi.add(new Fungi("Agaricus bernardii"));
        fungi.add(new Fungi("Bisporella citrina"));


//lamda expression to print set details
        System.out.println("Plants details:");
        plants.forEach (System.out::println);
        System.out.println();
        System.out.println("Animals details:");
        animals.forEach (System.out::println);
        System.out.println();
        System.out.println("Fungi details:");
        fungi.forEach (System.out::println);
        System.out.println();
    }

}