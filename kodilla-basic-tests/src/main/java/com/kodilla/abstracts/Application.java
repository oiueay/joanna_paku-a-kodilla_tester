package com.kodilla.com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(); //Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}

