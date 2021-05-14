package bai7_abstract_class_interface.thuc_hanh.animal_class_interface.animal;


import bai7_abstract_class_interface.thuc_hanh.animal_class_interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}