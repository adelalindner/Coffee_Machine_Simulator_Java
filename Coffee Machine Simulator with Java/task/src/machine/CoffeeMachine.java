package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;  
        int cups = 9;
        int money = 550; 

        boolean exit = false;
        
        while (!exit) {
            System.out.println ("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine ();
            
            if (action.equals ("remaining")) {
                System.out.println ("The coffee machine has:");
                System.out.println (water + " ml of water");
                System.out.println (milk + " ml of milk");
                System.out.println (beans + " g of coffee beans");
                System.out.println (cups + " disposable cups");
                System.out.println ("$" + money + " of money");   
            } else if (action.equals ("exit")) {
                exit = true;
            } else if (action.equals ("buy")) {
                System.out.println ("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffee = scanner.nextLine ();
            
                switch (coffee) {
                    case "1":
                        if (water < 250) {
                            System.out.println ("Sorry, not enough water!");  
                        } else if (beans < 16) {
                            System.out.println ("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println ("Sorry, not enough cups!");
                        } else {
                            System.out.println ("I have enough resources, making you a coffee!"); 
                            water -= 250;
                            beans -= 16;
                            cups  -= 1;
                            money += 4;
                        }
                        break;
                    case "2":
                        if (water < 350) {
                            System.out.println ("Sorry, not enough water!");
                        } else if (milk < 75){
                            System.out.println ("Sorry, not enough milk!");
                        } else if (beans < 20) {
                            System.out.println ("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println ("Sorry, not enough cups!");
                        } else {
                            System.out.println ("I have enough resources, making you a coffee!"); 
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups  -= 1;
                            money += 7;
                        }
                        break;
                    case "3":
                        if (water < 200) {
                            System.out.println ("Sorry, not enough water!");
                        } else if (milk < 100) {
                            System.out.println ("Sorry, not enough milk!");
                        } else if (beans < 12) {
                            System.out.println ("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println ("Sorry, not enough cups!");
                        } else {
                            System.out.println ("I have enough resources, making you a coffee!"); 
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups  -= 1;
                            money += 6;
                        }
                        break;
                case "back":
                    break;
                }  
            } else if (action.equals ("fill")) {
                System.out.println ("Write how many ml of water you want to add:");
                int addwater = scanner.nextInt ();
                System.out.println ("Write how many ml of milk you want to add:");
                int addmilk = scanner.nextInt ();
                System.out.println ("Write how many grams of coffee beans you want to add:"); 
                int addbeans = scanner.nextInt ();
                System.out.println ("Write how many disposable cups you want to add:");
                int addcups = scanner.nextInt ();

                water += addwater;
                milk += addmilk;
                beans += addbeans;
                cups += addcups;
            } else if (action.equals ("take")) {
            System.out.println ("I gave you $" + money);
            money = 0;
            }
        }
    }
}

   
