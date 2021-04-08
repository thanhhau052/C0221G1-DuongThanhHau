package bai7_abstract_class_interface.thuc_hanh.animal_class_interface;

import bai7_abstract_class_interface.thuc_hanh.animal_class_interface.animal.Animal;
import bai7_abstract_class_interface.thuc_hanh.animal_class_interface.animal.Chicken;
import bai7_abstract_class_interface.thuc_hanh.animal_class_interface.animal.Tiger;
import bai7_abstract_class_interface.thuc_hanh.animal_class_interface.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}