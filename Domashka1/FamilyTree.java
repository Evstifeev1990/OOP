package Domashka1;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class FamilyTree implements Serializable {
    ArrayList<Human> humans;

    public FamilyTree(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public void add(String name, String sex, int age, Human father, Human mother, ArrayList<Human> children) {
        Human human = new Human(name, sex, age, father, mother, children);
        humans.add(human);
    }

    public void add(Human human) {
        humans.add(human);
    }

    public ArrayList<Human> getHumansName(String name) {
        ArrayList<Human> res = new ArrayList<>();
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                res.add(human);       
            }                 
        }
        return res;    
    }

    public ArrayList<String> getName() {
        ArrayList<String> res = new ArrayList<>();
        for (Human human : humans) {
                res.add(human.getName());
        }
        return res;
    }

        
}

