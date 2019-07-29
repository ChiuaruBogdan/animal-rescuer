package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    Rescuer rescuer;
    Pet pet;
    Dog dog;
    Cat cat;
    Medic medic;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[2];


    public void start() throws Exception {
        initFood();
        displayFood();
        initActivities();
        displayActivities();
        initAnimal();
        initRescuer();
        nameAnimal();

    }

    private void initFood() {
        AnimalFood carnat = new AnimalFood();
        carnat.setName("Crenwurst");
        availableFood.add(0, carnat);


        AnimalFood pizza = new AnimalFood();
        pizza.setName("Dominos");
        availableFood.add(1, pizza);
    }

    private void displayFood() {
        System.out.println("Available food: ");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getName());
            }
        }
    }

    private void initActivities() {
        Activity sport = new Activity();
        sport.setName("Alergare");
        availableActivities[0] = sport;

        Activity fun = new Activity();
        fun.setName("Somn");
        availableActivities[1] = fun;
    }


    private void displayActivities() {
        for (Activity activity : availableActivities) {
            if (availableActivities != null) {
                System.out.println("Available activities: " + activity.getName());
            }
        }
    }


    private void initAnimal() {
        System.out.println("Please pick an animal to rescue: (Dog or Cat)");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String pickedAnimal = scanner.nextLine();
        if (pickedAnimal.equals("dog")) {
            System.out.println("You picked to rescue a: " + pickedAnimal);
        } else {
            if (pickedAnimal.equals("cat")) {
                System.out.println("You picked to rescue a: " + pickedAnimal);
            } else {
                System.out.println("Please try to pick a dog or cat!");
                initAnimal();
            }
        }
    }

    private void initRescuer() {
        System.out.println("Please pick a name for the rescuer.");
        try {
            Scanner scanner = new Scanner(System.in);
            String rescuerName = scanner.nextLine();
            System.out.println("You have selected: " + rescuerName);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered an invalid name. Please try again");
        }
    }


//    am introdus catch-try pentru nameAnimal fiindca imi dadea exceptie
    private void nameAnimal(){
        System.out.println("Please select a name for the animal");
        try {
            Scanner scanner = new Scanner(System.in);
            String animalName = scanner.nextLine();
            System.out.println("The name you have picked for your animal is " + pet.getName());
        }catch(InputMismatchException | ArrayIndexOutOfBoundsException | java.lang.NullPointerException e){
                    System.out.println("Please try selecting a name again.");
                    nameAnimal();
                }
            }



    }










