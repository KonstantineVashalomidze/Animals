package com.animals;

import java.util.Objects;

public abstract class Animal {
    protected AnimalType type;
    protected double weight;
    protected int age;
    protected Gender gender;

    public Animal(AnimalType type, double weight, int age, Gender gender) {
        this.type = type;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }


    public abstract String eat(String food);


    public abstract String makeSound();


    @Override
    public int hashCode(){
        return Objects.hash(this.type, this.weight, this.age, this.gender);
    }

}





