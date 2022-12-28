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
        getFather().getChildren().add(this);
        this.mother = mother;
        getMother().getChildren().add(this);
        this.children = children;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
        "Пол: " + sex + "\n" +
        "Возраст: " + age + "\n" +
        "Отец: " + father + "\n" +
        "Мама: " + mother + "\n" +
        "Дети: " + children + "\n" + "\n";
    }
}
