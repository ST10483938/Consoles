import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    String[] cities = {"Cape Town", "Prt Elizabeth", "Pretoria"};
    String[] consoles = {"PS5", "XBOX", "SWITCH"};
    int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
    };
    int[] total = new int[cities.length];


    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("------------------------------");
    System.out.printf("", consoles[0], consoles[1], consoles[2]);
    int i;
    for (i = 0; i < cities.length; i++) ;
    System.out.printf("", cities[i]);
    int j;
    for (j = 0; j < consoles.length; j++) ;
    System.out.printf("", sales[i][j]);
    {

        System.out.println();
        {


            System.out.println("---------------------------------");
            System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
            System.out.println("---------------------------------");
            int maxIndex = 0;
            System.out.println(cities[i]);
            if (total[i] > total[maxIndex]) maxIndex = i;


            System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
            System.out.println("---------------------------------");
        }

    }

    System.out.println("Select the console type");
    System.out.println("1) PS5");
    System.out.println("2) XBOX");
    System.out.println("3) SWITCH");
    int choice = Integer.parseInt(scanner.nextLine());
    while(choice < 1 || choice > 3){
        
    }
}