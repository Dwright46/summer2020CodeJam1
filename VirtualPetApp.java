package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        String petName = "Horace the Hippo";
        String petFirstName = "Horace";

        Scanner input = new Scanner(System.in);
        VirtualPet myVirtualPet = new VirtualPet(27, 5, 5, 50);
        System.out.println("Welcome to you Virtual Pet App");
        System.out.println("Your pet's name is: " + petName);
        System.out.println("Choose a option: ");
        System.out.println("Press 1 to increase Hunger");
        System.out.println("Press 2 to decrease Hunger");
        System.out.println("Press 3 to increase Thirst");
        System.out.println("Press 4 to decrease Thirst");
        System.out.println("Press 5 to increase Boredom");
        System.out.println("Press 6 to decrease Boredom");
        System.out.println("Press 7 to increase Tiredness");
        System.out.println("Press 8 to decrease Tiredness");
        System.out.println("Press 9 to exit");
        String menuOption = input.nextLine();

        while (!menuOption.equals("9")) {
            if (menuOption.equals("1")) {
                Scanner hungerInput = new Scanner(System.in);
                System.out.println("Enter hunger increase amount: ");
                int amountToIncreaseHunger = hungerInput.nextInt();
                myVirtualPet.tickHungerIncrease(amountToIncreaseHunger);
                System.out.println("... you fed " + petFirstName + " ....  press Enter to continue ");
                input.nextLine();

            } else if (menuOption.equals("2")) {
                Scanner hungerInput = new Scanner(System.in);
                System.out.println("Enter hunger decrease amount: ");
                int amountToDecreaseHunger = hungerInput.nextInt();
                myVirtualPet.tickHungerDecrease(amountToDecreaseHunger);
                System.out.println("... you need to feed " + petName + " ....  press Enter to continue ");
                input.nextLine();
            } else if (menuOption.equals("3")) {
                Scanner thirstInput = new Scanner(System.in);
                System.out.println("Enter thirst increase amount: ");
                int amountToIncreaseThirst = thirstInput.nextInt();
                myVirtualPet.tickThirstIncrease(amountToIncreaseThirst);
                System.out.println("... you watered " + petFirstName + " ....  press Enter to continue ");
                input.nextLine();

            } else if (menuOption.equals("4")) {
                Scanner thirstInput = new Scanner(System.in);
                System.out.println("Enter thirst decrease amount: ");
                int amountToDecreaseThirst = thirstInput.nextInt();
                myVirtualPet.tickThirstDecrease(amountToDecreaseThirst);
                System.out.println("... you need to water " + petFirstName + " ....  press Enter to continue ");
                input.nextLine();
            } else if (menuOption.equals("5")) {
                Scanner boredomInput = new Scanner(System.in);
                System.out.println("Enter boredom increase amount: ");
                int amountToIncreaseBoredom = boredomInput.nextInt();
                myVirtualPet.tickBoredomIncrease(amountToIncreaseBoredom);
                System.out.println("... you should with " + petFirstName + " ....  press Enter to continue ");
                input.nextLine();

            } else if (menuOption.equals("6")) {
                Scanner boredomInput = new Scanner(System.in);
                System.out.println("Enter boredom decrease amount: ");
                int amountToDecreaseBoredom = boredomInput.nextInt();
                myVirtualPet.tickBoredomDecrease(amountToDecreaseBoredom);
                System.out.println(petFirstName + " will need to rest ....  press Enter to continue ");
                System.out.println("....  press Enter to continue ");
                input.nextLine();

            } else if (menuOption.equals("7")) {
                Scanner tirednessInput = new Scanner(System.in);
                System.out.println("Enter tiredness increase amount: ");
                int amountToIncreaseTiredness = tirednessInput.nextInt();
                myVirtualPet.tickTirednessIncrease(amountToIncreaseTiredness);
                System.out.println(petFirstName + " is tired ....  press Enter to continue");
                input.nextLine();

            } else if (menuOption.equals("8")) {
                Scanner tirednessInput = new Scanner(System.in);
                System.out.println("Enter tiredness decrease amount: ");
                int amountToDecreaseTiredness = tirednessInput.nextInt();
                myVirtualPet.tickTirednessDecrease(amountToDecreaseTiredness);
                System.out.println(petFirstName + " has rested");
                System.out.println("....  press Enter to continue ");
                input.nextLine();
            } else {
                System.out.println("Do nothing with " + petFirstName);
                System.exit(0);
            }
            System.out.println("After " + petName + "'s activities :");
            System.out.println("Hunger is now " + myVirtualPet.getHunger());
            System.out.println("Thirst is now " + myVirtualPet.getThirst());
            System.out.println("Boredom is now " + myVirtualPet.getBoredom());
            System.out.println("Tiredness is now " + myVirtualPet.getTiredness());
            System.out.println(" ");
            System.out.println("Choose a option: ");
            System.out.println("Press 1 to increase Hunger");
            System.out.println("Press 2 to decrease Hunger");
            System.out.println("Press 3 to increase Thirst");
            System.out.println("Press 4 to decrease Thirst");
            System.out.println("Press 5 to increase Boredom");
            System.out.println("Press 6 to decrease Boredom");
            System.out.println("Press 7 to increase Tiredness");
            System.out.println("Press 8 to decrease Tiredness");
            System.out.println("Press 9 to exit");
            menuOption = input.nextLine();
        }

        input.close();
    }

}


