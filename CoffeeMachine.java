//This program simulates communication with a coffee machine to make coffee for you!
//Class to create the object Coffee machine
import java.util.*;
class CoffeeMachineSuppliers{       
    private int currentWaterVolume;
    private int currentMilkVolume;
    private int currentCoffeeBeans;
    private int currentNumOfCups;
    private int currentAmountOfMoney;
//Default constructor
    public CoffeeMachineSuppliers()
    {
        currentWaterVolume = 400;
        currentMilkVolume = 540;
        currentCoffeeBeans = 120;
        currentNumOfCups = 9;
        currentAmountOfMoney = 550;
    }
//Method to set water volume    
    public void setCurrentWaterVolume(int waterVolume) {
        currentWaterVolume = waterVolume;
    }
//Method to set milk volume      
    public void setCurrentMilkVolume(int milkVolume) {
        currentMilkVolume = milkVolume;
    }
//Method to set amount of coffee beans  
    public void setCurrentCoffeeBeans(int coffeeBeans) {
        currentCoffeeBeans = coffeeBeans;
    }
//Method to set number of disposable cups      
    public void setCurrentNumberOfCups(int coffeeCups) {
        currentNumOfCups = coffeeCups;
    }
//Method to set amount of money      
    public void setCurrentAmountOfMoney(int amountOfMoney) {
        currentAmountOfMoney = amountOfMoney;
    }
//Method to get current water volume      
    public int getCurrentWaterVolume() {
        return currentWaterVolume;
    }
//Method to get current milk volume     
    public int getCurrentMilkVolume() {
        return currentMilkVolume;
    }
 //Method to get current amount of coffee beans 
    public int getCurrentCoffeeBeans() {
        return currentCoffeeBeans;
    }
 //Method to get current number of cups 
    public int getCurrentNumberOfCups() {
        return currentNumOfCups;
    }
 //Method to get current amount of money 
    public int getCurrentAmountOfMoney() {
        return currentAmountOfMoney;
    }
 //Method to use water to make coffee   
    public void useWaterFromCoffeeMachine(int usedWater) {
        currentWaterVolume -= usedWater;
    }
 //Method to use milk to make coffee   
    public void useMilkFromCoffeeMachine(int usedMilk) {
        currentMilkVolume -= usedMilk;
    }
 //Method to use coffee beans to make coffee   
    public void useCoffeeBeansFromCoffeeMachine(int usedCoffeeBeans) {
        currentCoffeeBeans -= usedCoffeeBeans;
    }
 //Method to use disposable cups to make coffee   
    public void useCupsFromCoffeeMachine(int usedCups) {
        currentNumOfCups -= usedCups;
    }
 //Method to pay to machine for make coffee   
    public void addMoneyToCoffeeMachine(int moneyPaid) {
        currentAmountOfMoney += moneyPaid;
    }
 //Method to fill coffee machine with water to make coffee   
    public void fillWaterToCoffeeMachine(int fillWaterVolume) {
        currentWaterVolume += fillWaterVolume;
    }
 //Method to fill coffee machine with milk to make coffee    
    public void fillMilkToCoffeeMachine(int fillMilkVolume) {
        currentMilkVolume += fillMilkVolume;
    }
 //Method to fill coffee machine with coffee beans to make coffee    
    public void fillCoffeeBeansToCoffeeMachine(int fillCoffeeBeans) {
        currentCoffeeBeans += fillCoffeeBeans;
    }
 //Method to fill coffee machine with disposable cups to make coffee    
    public void fillCupsToCoffeeMachine(int fillCups) {
        currentNumOfCups += fillCups;
    }
 //Method to take money from coffee machine    
    public void takeMoneyFromCoffeeMachine() {
        System.out.println("A gave you " + "$" + currentAmountOfMoney);
        currentAmountOfMoney = 0;
    }
 //Method to print current state of coffee machine    
    public void printCoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(getCurrentWaterVolume() + " ml of water");
        System.out.println(getCurrentMilkVolume() + " ml of milk");
        System.out.println(getCurrentCoffeeBeans() + " g of coffee beans");
        System.out.println(getCurrentNumberOfCups() + " of disposable cups");
        System.out.println("$" + getCurrentAmountOfMoney() + " of money");
    }
}
public class CoffeeMachine {
    static Scanner console = new Scanner(System.in);
// Method to buy coffee    
    public static void actionBuy(CoffeeMachineSuppliers coffeeMachine) {
        //Espresso constants
        final int waterVolumeForEspresso = 250;
        final int coffeeBeansForEspresso = 16;
        final int amountOfMoneyForEspresso = 4;
        //Latte constants
        final int waterVolumeForLatte = 350;
        final int milkVolumeForLatte = 75;
        final int coffeeBeansForLatte = 20;
        final int amountOfMoneyForLatte = 7;
        //Cappuccino constants
        final int waterVolumeForCappuccino = 200;
        final int milkVolumeForCappuccino = 100;
        final int coffeeBeansForCappuccino = 12;
        final int amountOfMoneyForCappuccino = 6;
        int requiredCups = 1;
        String choiсe;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        choiсe = console.next();
        switch (choiсe) {
            case "1":
                if(coffeeMachine.getCurrentWaterVolume() < waterVolumeForEspresso)
                {System.out.println("Sorry, not enough water!");}
                else if(coffeeMachine.getCurrentCoffeeBeans() < coffeeBeansForEspresso)
                {System.out.println("Sorry, not enough coffee beans!");}
                else if(coffeeMachine.getCurrentNumberOfCups() < requiredCups)
                {System.out.println("Sorry, not enough disposable cups!");}
                else
                {System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.useWaterFromCoffeeMachine(waterVolumeForEspresso);
                coffeeMachine.useCoffeeBeansFromCoffeeMachine(coffeeBeansForEspresso);
                coffeeMachine.addMoneyToCoffeeMachine(amountOfMoneyForEspresso);
                coffeeMachine.useCupsFromCoffeeMachine(requiredCups);}
                System.out.println();
                break;
            case "2":
                if(coffeeMachine.getCurrentWaterVolume() < waterVolumeForLatte)
                {System.out.println("Sorry, not enough water!");}
                else if(coffeeMachine.getCurrentMilkVolume() < milkVolumeForLatte)
                {System.out.println("Sorry, not enough coffee beans!");}
                else if(coffeeMachine.getCurrentCoffeeBeans() < coffeeBeansForLatte)
                {System.out.println("Sorry, not enough coffee beans!");}
                else if(coffeeMachine.getCurrentNumberOfCups() < requiredCups)
                {System.out.println("Sorry, not enough disposable cups!");}
                else
                {System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.useWaterFromCoffeeMachine(waterVolumeForLatte);
                coffeeMachine.useMilkFromCoffeeMachine(milkVolumeForLatte);
                coffeeMachine.useCoffeeBeansFromCoffeeMachine(coffeeBeansForLatte);
                coffeeMachine.useCupsFromCoffeeMachine(requiredCups);
                coffeeMachine.addMoneyToCoffeeMachine(amountOfMoneyForLatte);}
                System.out.println();
                 break;
            case "3":
                if(coffeeMachine.getCurrentWaterVolume() < waterVolumeForCappuccino)
                {System.out.println("Sorry, not enough water!");}
                else if(coffeeMachine.getCurrentMilkVolume() < milkVolumeForCappuccino)
                {System.out.println("Sorry, not enough coffee beans!");}
                else if(coffeeMachine.getCurrentCoffeeBeans() < coffeeBeansForCappuccino)
                {System.out.println("Sorry, not enough coffee beans!");}
                else if(coffeeMachine.getCurrentNumberOfCups() < requiredCups)
                {System.out.println("Sorry, not enough disposable cups!");}
                else
                {System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.useWaterFromCoffeeMachine(waterVolumeForCappuccino);
                coffeeMachine.useMilkFromCoffeeMachine(milkVolumeForCappuccino);
                coffeeMachine.useCoffeeBeansFromCoffeeMachine(coffeeBeansForCappuccino);
                coffeeMachine.useCupsFromCoffeeMachine(requiredCups);
                coffeeMachine.addMoneyToCoffeeMachine(amountOfMoneyForCappuccino);}
                System.out.println();
                break;
            case "back":
                break;
            default:
                System.out.println("Invalid choiсe. Try again!");
                break;
        }
    }
 // Method to fill coffee machine with suppliers    
    public static void actionFill(CoffeeMachineSuppliers coffeeMachine) {
        int addWaterVolume;
        int addMilkVolume;
        int addCoffeeBeans;
        int addNumOfCups;
        System.out.println("Write how many ml of water do you want to add:");
        addWaterVolume = console.nextInt();
        coffeeMachine.fillWaterToCoffeeMachine(addWaterVolume);
        System.out.println("Write how many ml of milk do you want to add:");
        addMilkVolume = console.nextInt();
        coffeeMachine.fillMilkToCoffeeMachine(addMilkVolume);
        System.out.println("Write how many grams of coffee beans do you want to add:");
        addCoffeeBeans = console.nextInt();
        coffeeMachine.fillCoffeeBeansToCoffeeMachine(addCoffeeBeans);
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        addNumOfCups = console.nextInt();
        coffeeMachine.fillCupsToCoffeeMachine(addNumOfCups);
        System.out.println();
    }

    public static void main(String[] args) {
        CoffeeMachineSuppliers myCoffeeMachine = new CoffeeMachineSuppliers();
        String userAction;
        //Print list of actions that the coffee machine can take
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        userAction = console.next();
        while (!userAction.equals("exit")) {
            switch (userAction) {
                case "buy":
                    actionBuy(myCoffeeMachine);
                    break;
                case "fill":
                    actionFill(myCoffeeMachine);
                    break;
                case "take":
                    myCoffeeMachine.takeMoneyFromCoffeeMachine();
                    break;
                case "remaining":
                    myCoffeeMachine.printCoffeeMachineState();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userAction = console.next();
        }
    }
}
