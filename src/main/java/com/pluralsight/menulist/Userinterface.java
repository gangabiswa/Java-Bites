package com.pluralsight.menulist;

import java.util.Scanner;

public class Userinterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Options;

        do {
            System.out.println("1) Home");
            System.out.println("0) Exit");
            Options = scanner.nextInt();
             scanner.nextLine();

             switch (Options){
                 case 1:
                     creatSandwich(scanner);
                     break;

             }
        }while (Options !=0);

    }
    public  static  void creatSandwich(Scanner scanner){
        System.out.println( "select break type");
        System.out.println("1) white");
        System.out.println("2) wheat");
        System.out.println("3) rye");
        System.out.println("4) wrap");
        String BreadType = "";
        switch (scanner.nextInt()) {
            case 1:
                BreadType = "White";
                break;
            case 2:
                BreadType = "Wheat";
                break;
            case 3:
                BreadType = "Rye";
                break;
            case 4:
                BreadType = "Wrap";
                break;
            default:
                BreadType = "white";
        }
        scanner.nextLine();
    }
}
