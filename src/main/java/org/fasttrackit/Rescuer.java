package org.fasttrackit;

//inheritance or "is-a" relationship cu Person

public class Rescuer extends Person {

    private String nickname;
    Rescuer rescuer;


    public Rescuer(String name, int money, String job, Rescuer rescuer) {
        super(name, money, job);
        this.rescuer = rescuer;
    }

    public Rescuer(String name, int money, String job, String gender) {
        this.getName();
        this.getMoney();
        this.getJob();
        this.getGender();
    }

    public Rescuer(String nickname) {
        this.nickname = nickname;
    }

    public Rescuer() {

    }


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println(pet.getName() + "'s current hunger level is " + pet.getHungerLevel());
        if (pet.getFavouriteFood().equals(animalFood.getName())) {
            pet.happinessLevel ++;
            System.out.println(" Now the mood level is: " + pet.getHappinessLevel());
        }
        else {
            System.out.println("The pet wants his favorite food");

//        System.out.println(pet.getName() + "'s initial hunger level is: " + pet.getHungerLevel());
            pet.hungerLevel--;
            System.out.println(getName() + " just gave some " + animalFood.getName() + " to " + pet.getName() +
                    " and the hunger level is now: " + pet.getHungerLevel());
        }

    }


    public void recreation(Pet pet, Activity activity) {
        System.out.println("The animal's happiness level is " + pet.getHappinessLevel());

        if (pet.getFavouriteActivity().equals(getFavoriteActivity())) {
            pet.happinessLevel++;
            System.out.println(getName() + " is playing with " + pet.getName() + " by doing " + activity.getName());
            System.out.println("THe animal's happiness level is now " + pet.getHappinessLevel());
        }
        else {
            System.out.println("The animal feels like doing his favorite activity");
//        System.out.println(pet.getName() + "'s initial happiness level is " + pet.getHappinessLevel());
            pet.happinessLevel =+ 3;
            System.out.println(getName() + " just took " + pet.getName() + " to " + pet.getFavouriteActivity() +
                    " and the happiness level is now " + pet.getHappinessLevel());
        }
    }

    }






