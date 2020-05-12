package virtualpet;

public class VirtualPet {
    public int hunger;
    private int thirst;
    private int boredom;
    private int tiredness;

    public VirtualPet(int hunger, int thirst, int boredom, int tiredness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tiredness = tiredness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void tickHungerDecrease(int hungerAmount) {

        if (hunger > hungerAmount) {
            hunger -= hungerAmount;
        } else {
            hunger -= hunger;
        }
    }

    public void tickHungerIncrease(int hungerAmount) {
        hunger += hungerAmount;
    }

    public void tickThirstDecrease(int thirstAmount) {

        if (thirst > thirstAmount) {
            thirst -= thirstAmount;
        } else {
            thirst -= thirst;
        }
    }

    public void tickThirstIncrease(int thirstAmount) {
        thirst += thirstAmount;
    }


    public void tickBoredomDecrease(int boredomAmount) {

        if (boredom > boredomAmount) {
            boredom -= boredomAmount;
        } else {
            boredom -= boredomAmount;
        }
    }

    public void tickBoredomIncrease(int boredomAmount) {
        boredom += boredomAmount;
    }

    public void tickTirednessDecrease(int tirednessAmount) {

        if (tiredness > tirednessAmount) {
            tiredness -= tirednessAmount;
        } else {
            tiredness -= tirednessAmount;
        }
    }

    public void tickTirednessIncrease(int tirednessAmount) {
        tiredness += tirednessAmount;
    }

}