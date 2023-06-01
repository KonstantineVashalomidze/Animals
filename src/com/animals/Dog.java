package com.animals;

public class Dog extends Animal {

    public Dog(AnimalType type, double weight, int age, Gender gender){
        super(type, weight, age, gender);
    }


    @Override
    public String eat(String food){
        return "Dog eating " + food + " :3";
    }

    @Override
    public String makeSound(){
        return "Auf :3";
    }
}
