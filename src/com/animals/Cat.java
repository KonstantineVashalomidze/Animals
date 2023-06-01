package com.animals;

public class Cat extends Animal {
    public Cat(AnimalType type, double weight, int age, Gender gender){
        super(type, weight, age, gender);




    }


    @Override
    public String eat(String food){
        return "Cat eating " + food + " :3";
    }


    @Override
    public String makeSound(){
        return "Meow :3";
    }

}
