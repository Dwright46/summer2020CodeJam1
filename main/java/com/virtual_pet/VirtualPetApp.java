package com.virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet myPet = new VirtualPet("Horace the Hippo", 10, 10, 10, 10, 10, 10, 10, 10);

        myPet.petMenu();
        System.out.println();
        myPet.petMenuOptions();

        String menuOption = "";
        menuOption = input.nextLine();

        while (!menuOption.equals("7")) {

            if (menuOption.equals("1")) {
                myPet.feedPet();
                myPet.petMenu();
                myPet.continueOrExit();
                menuOption = input.nextLine();

            } else if (menuOption.equals("2")) {
                myPet.waterPet();
                myPet.petMenu();
                menuOption = input.nextLine();

            } else if (menuOption.equals("3")) {

                myPet.playWithPet();
                myPet.petMenu();
                menuOption = input.nextLine();

            } else if (menuOption.equals("4")) {
                myPet.restPet();
                myPet.petMenu();
                menuOption = input.nextLine();


            } else if (menuOption.equals("5")) {
                myPet.boredom();
                myPet.petMenu();
                menuOption = input.nextLine();


            } else if (menuOption.equals("6")) {
                myPet.petMenu();
                myPet.petMenu();
                menuOption = input.nextLine();

            } else
                System.out.println("Thank you for playing");
        }
        input.close();
    }

}









