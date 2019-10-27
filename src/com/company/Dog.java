package com.company;

public interface Dog extends DogGuide {
    String name = "Pes";
    boolean isVaccinated = true;
    boolean isTrained = true;

    void voiceOfDog();
}
