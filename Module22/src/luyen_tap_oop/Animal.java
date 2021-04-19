package luyen_tap_oop;

import java.util.Scanner;

public abstract class Animal {
   protected String name;
   protected int age;
   protected String description;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String display() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
    public void input(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter name Animal : ");
        name= scanner.nextLine();
        System.out.println("Enter age Animal : ");
        age= scanner.nextInt();
        System.out.println("Enter Description : ");
        description =scanner.nextLine();


}
    public  abstract  void showSound();

}
