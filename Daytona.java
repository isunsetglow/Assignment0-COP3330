/*
 * Maria Hernandez
 * Assignment 0
 * COP3330
 * Aug 27th, 2022
 */

import java.util.Scanner;

class Daytona {
  public static void main(String[] args) {
    int menu = 0;
    System.out.println("Where do you want to go? ");

    planMenu(menu);
  }

  public static void planMenu(int menu) {
    int time, distance = 0, feet, lap, FEET = 341;

    Scanner scan = new Scanner(System.in);

    while (menu < 4) {
      System.out.println("1. Visit the beach.");
      System.out.println("2. Play disc golf in Tuscawilla Park.");
      System.out.println("3. Visit the International Speedway.");
      System.out.println("4. Exit.");

      menu = scan.nextInt();

      switch (menu) {
        case 1:
          System.out.println("What time is it? (Military time)");
          time = scan.nextInt();
          if ((time >= 9) && (time <= 18)) {
            System.out.println("The beach is open. Enjoy your drive!");
          } else {
            System.out.println("Oh no! The beach is closed!");
          }
          break;
        case 2:
          System.out.println("Welcome to the park!");
          System.out.println("There's 347 feet left until your reach the basket.");
          System.out.println("How far did you throw?");
          feet = scan.nextInt();
          if(feet>FEET) {
            distance = (347 - feet)*-1;
          }
          else {
            distance = 347 - feet;
          }
          
          System.out.println("There's " + distance + " until the basket.");
          while (distance != 0) {
            System.out.println("How far did you throw?");
            feet = scan.nextInt();
            if(distance < 0) {
              distance -= (feet)*-1;
            }
            else {
              distance -= feet;
            }
            System.out.println("There's " + distance + " until the basket.");
          }
          System.out.println("You made it in!");
          break;
        case 3:
          System.out.println("How many laps are left?");
          lap = scan.nextInt();
          while (lap != 0) {
            System.out.println("There are " + lap + " laps left.");
            lap--;
          }
          System.out.println("Finished!");
          break;
        case 4:
          System.out.println("Goodbye!");
          break;
        default:
          break;
      }
    }
    scan.close();
  }
}
