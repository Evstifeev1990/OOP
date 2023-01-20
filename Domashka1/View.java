package Domashka1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    List<Option> comandList;
    FamilyTree familyTree;
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

        // ArrayList<String> name = familyTree.getName();
        // System.out.println(name);
        // ArrayList<Human> name1 = familyTree.getHumansName("Саша");
        // System.out.println(name1);



        View view = new View();
        view.comandList = new ArrayList<>();
        view.comandList.add(new ComandAdd(view));
        view.comandList.add(new ComandHumanName(view));

        for(int i = 0; i < view.comandList.size(); i++) {
            System.out.println(i + ": " + view.comandList.get(i).description());
        }
    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Выберите номер команды: ");
            try {
                int number = sc.nextInt();
                view.comandList.get(number).execute();
            } catch (Exception e) {
                errorMessage(e);
            }
            

            
        }


    
    }

    private static void errorMessage(Exception e) {
    }

    public void comandAdd() {
        
    }

    public void comandHumanName() {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Выберите имя: ");
            try {
                String name = iScanner.nextLine();
                ArrayList<Human> name1 = familyTree.getHumansName(name);
                System.out.println(name1);
                
            } catch (Exception e) {
                errorMessage(e);
            }    
        }
    }
}
