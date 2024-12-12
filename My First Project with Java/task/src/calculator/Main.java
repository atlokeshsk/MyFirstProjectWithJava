package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner =new Scanner(System.in);

        // Define individual earnings as integers
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;

        // Calculate total income as a double
        int totalIncome = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        // Print the earned amounts
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);

        // Print the total income
        System.out.println();
        System.out.printf("Income: $%d", totalIncome);

        System.out.println("Staff expenses:");
        int staffExpense = scanner.nextInt();
        totalIncome-=staffExpense;

        System.out.println("Other expenses:");
        int otherExpense = scanner.nextInt();
        totalIncome-=otherExpense;

        System.out.printf("Net income: $%d",totalIncome);
    }
}
