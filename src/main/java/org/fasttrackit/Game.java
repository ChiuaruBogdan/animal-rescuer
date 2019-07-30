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
        requireFeeding();
        requireActivity();
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


    // M-am dat batut la metoda asta si am
//    introdus una mai simpla jos

//    private void nameAnimal() {
//        System.out.println("Please select a name for the animal");
//        try {
//            Scanner scanner = new Scanner(System.in);
//            String animalName = scanner.nextLine();
//            dog.setName(animalName);
//            cat.setName(animalName);
//            if (animalName.equals("dog")) {
//                System.out.println("The name you have selected for your dog is " + dog.getName());
//            } else {
//                System.out.println("The name you have selected for your cat is " + cat.getName());
//            }
//        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | java.lang.NullPointerException e) {
//            System.out.println("Please try selecting a name again.");
//            nameAnimal();
//        }
//    }


    private void nameAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a name for your pet: ");
        String animalName = scanner.next();
        System.out.println("The name you have selected for your pet is : " + animalName);

    }

    private void requireFeeding(){
        System.out.println("Please pick a food type to feed your pet from the list or type in your favorite food.");

        displayFood();
        Scanner scanner = new Scanner(System.in);
        String userInputFood = scanner.nextLine();

            if (userInputFood.equals("Crenwurst")){
                System.out.println("You have picked a delicious Crenwurst");
            }
            if (userInputFood.equals("Dominos")){
                System.out.println("You have picked Pizza from Domnios");
            }
            else{
                AnimalFood AnimalFood = new AnimalFood();
                displayFood();
                AnimalFood.setName(userInputFood);
                availableFood.add(AnimalFood);
                System.out.println("You have picked: " + userInputFood);
            }
        }

        private void requireActivity(){
        displayActivities();
            System.out.println("Please pick an activity to play with your pet.");
            Scanner scanner = new Scanner(System.in);
            String userInputActivity = scanner.nextLine();
            try {
                if (userInputActivity.equals("Alergare")) {
                    System.out.println("You have picked to run with your pet.");
                }
                if (userInputActivity.equals("somn")) {
                    System.out.println("You have picked to sleep and relax with your pet.");
                } else {
                    Activity activity = new Activity();
                    displayActivities();
                    activity.setName(userInputActivity);
                    availableActivities[2] = new Activity();
                    availableActivities[2] = activity;
                    System.out.println("You will " + activity.getName() + "with your pet.");
                }
            }
            catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("You have entered an invalid name. Please try again");
                requireActivity();
            }
            }
        }















