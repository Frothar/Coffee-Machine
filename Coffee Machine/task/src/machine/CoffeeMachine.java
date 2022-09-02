package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int loadedWater = 400;
    public static int loadedMilk = 540;
    public static int loadedBeans = 120;
    public static int loadedCups = 9;
    public static int amountOfMoney = 550;
    public static boolean exit = true;

    public static void main(String[] args) {

        do {
            chooseAction();
        } while (exit);
    }

    public static void checkStatus() {
        System.out.println("The coffee machine has: ");
        System.out.printf("%d ml of water \n", loadedWater);
        System.out.printf("%d ml of milk \n", loadedMilk);
        System.out.printf("%d g of coffee beans \n", loadedBeans);
        System.out.printf("%d disposable cups \n", loadedCups);
        System.out.printf("$%d of money \n", amountOfMoney);
    }

    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String numberOfCoffee = scanner.nextLine();

                switch (numberOfCoffee) {
                    case "1":
                        if (loadedWater >= 250 && loadedBeans >= 16 && loadedCups >= 1) {
                            loadedWater -= 250;
                            loadedBeans -= 16;
                            loadedCups -= 1;
                            amountOfMoney += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (loadedWater < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (loadedBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        break;
                    case "2":
                        if (loadedWater >= 350 && loadedMilk >= 75 && loadedBeans >= 20 && loadedCups >= 1) {
                            loadedWater -= 350;
                            loadedMilk -= 75;
                            loadedBeans -= 20;
                            loadedCups -= 1;
                            amountOfMoney += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (loadedWater < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (loadedMilk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (loadedBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        break;
                    case "3":
                        if (loadedWater >= 200 && loadedMilk >= 100 && loadedBeans >= 12 && loadedCups >= 1) {
                            loadedWater -= 200;
                            loadedMilk -= 100;
                            loadedBeans -= 12;
                            loadedCups -= 1;
                            amountOfMoney += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (loadedWater < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (loadedMilk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (loadedBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                        break;
                    case "back":
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add: ");
                int addedWater = scanner.nextInt();
                loadedWater += addedWater;

                System.out.println("Write how many ml of milk you want to add: ");
                int addedMilk = scanner.nextInt();
                loadedMilk += addedMilk;

                System.out.println("Write how many grams of coffee beans you want to add: ");
                int addedBeans = scanner.nextInt();
                loadedBeans += addedBeans;

                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int addedCups = scanner.nextInt();
                loadedCups += addedCups;
                break;
            case "take":
                System.out.printf("I gave you $%d", amountOfMoney);
                amountOfMoney = 0;
                break;
            case "remaining":
                checkStatus();
                System.out.println(" ");
                break;
            case "exit":
                exit = false;
            default:
                System.out.println(" ");
                break;
        }
    }
}
