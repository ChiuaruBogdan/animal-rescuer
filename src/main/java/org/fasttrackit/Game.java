package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Rescuer rescuer;
    Dog dog;
    Medic medic;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[2];


    public void start() throws Exception {
        initFood();
        displayFood();
        initActivities();
        displayActivities();
//        showAllFood();
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
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities != null) {
                System.out.println((i + 1) + ". " + availableActivities[i].getName());
            }
        }
    }

//    private void showAllFood() {
//
//        System.out.println("Here is all the available food: ");
//        for (int i = 0; i > availableFood.size(); i++) {
//            if (availableFood != null) {
//                System.out.println((i + 1) + " ." + availableFood.get(i).getName());
//
//            }
//        }
//    }

//    private void showAllActivities(){
////        System.out.println("Here are all the available activities: ");
////        for(int i = 0; i > availableActivities.length; i++){
////            if (availableActivities != null){
////                System.out.println(availableActivities.);
////            }
////        }
    }









