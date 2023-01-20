package Domashka1;

import java.util.ArrayList;

public class Human {
    private String name, sex; 
    private Human father, mother;
    private int age;
    private ArrayList<Human> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Human (String name, String sex, int age, Human father, Human mother, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        setAddChildren(father, this);
        this.mother = mother;
        setAddChildren(mother, this);
        this.children = children;
    }

    public Human(Human name2, Human name3, int age2, Object father2, Object mother2, Object children2) {
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
        "Пол: " + sex + "\n" +
        "Возраст: " + age + "\n" +
        "Отец: " + getNameFatherMather(father) + "\n" +
        "Мама: " + getNameFatherMather(mother) + "\n" +
        "Дети: " + getNameChildren(children) + "\n";
    }

    public String getNameFatherMather(Human fatherMather) {
        String res;
        if (fatherMather != null) {
            res = fatherMather.getName();
        }
        else {
            res = "Имя отсутствует";
        }
        return res;
    }
    public ArrayList<String> getNameChildren(ArrayList<Human> children) {
        ArrayList<String> res = new ArrayList<>();       
        if (children != null) {           
            for (Human human:children) {
                res.add(human.getName());  
            }
        }
        else {
            res.add("Дети отсутствуют");
        }
        return res;
    }

    public void setAddChildren(Human fatherMather, Human name) {
        ArrayList<Human> child = new ArrayList<>();
        if (fatherMather != null) {
            
            if (fatherMather.getChildren() != null) {
                fatherMather.getChildren().add(name);
            }
            else {
                child.add(name);
                fatherMather.setChildren(child);
                // children = child;
                // System.out.println(getNameChildren(children));
            }

        }
        else {
            
        }
        
    }
    
}
