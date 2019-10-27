package com.company;

public class Animal implements Cat,Crocodile,Fish,Dog,Hamster,Lion,Wolf,Girraffe {
    int id;
    int age;
    float weight;
    String color;

    public Animal(int id, int age, float weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void voicen() {
        System.out.println("and I am angry");

    }

    @Override
    public void voiceOfFish() {
        System.out.println(".....");

    }

    @Override
    public void voiceOfDog() {
        System.out.println("woof I can take you home");
    }

    @Override
    public void voiceOfHamster() {
        System.out.println("phphphph");
    }

    @Override
    public void viceOfLion() {
        System.out.println("rrrrr");

    }

    @Override
    public void voiceOfWolf() {
        System.out.println("yyyyyy");
    }

    @Override
    public void voiceOfDogGuide() {
        System.out.println("woof");
    }
}

