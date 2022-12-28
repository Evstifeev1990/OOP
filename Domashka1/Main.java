package Domashka1;
import java.util.ArrayList;
import java.util.List;
// import Domashka1.Human;
// import Domashka1.FamilyTree;


public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human Victor = new Human("Виктор", "Муж", 63, null, null, null);
        Human Olga = new Human("Ольга", "Жен", 63, null, null, null);
        Human Yaroslav = new Human("Ярослав", "Муж", 32, Victor, Olga, null);
        Human Anna = new Human("Анна", "Жен", 42, Victor, Olga, null);
        Human Vity = new Human("Витя", "Муж", 7, Yaroslav, null, null);
        Human Sasha = new Human("Саша", "Муж", 20, null, Anna, null);

        familyTree.add(Victor);
        familyTree.add(Olga);
        familyTree.add(Yaroslav);
        familyTree.add(Anna);
        familyTree.add(Vity);
        familyTree.add(Sasha);

        ArrayList<Human> humans = familyTree.getHumansName("Виктор");
        System.out.println(humans);
    }
}
