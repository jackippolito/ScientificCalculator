import java.util.Scanner;
import java.text.DecimalFormat;

//citing my sources: https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
//this website showed me how to get my decimal place down to two for when averaging the calculations

public class SciCalculator {
    public static void main (String[] args) {

// lines 12-33 are for declaring all the variables I use and this prints the menu
// for the first time
        double result = 0.0;
        int choice;
        double o1, o2;
        Scanner myScanner = new Scanner(System.in);
        int noc = 0;
        double soc = 0.0;

        System.out.println("Current Result: " + result);
        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println();
        System.out.print("Enter Menu Selection: ");
        choice = myScanner.nextInt();

// I had to use this if statement after realizing a message needs to be printed when quitting
        if (choice == 0) {
            System.out.println("Thanks for using this calculator. Goodbye!");
        }

// this giant while loop keeps the program running unless I quit by choosing zero
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
                    result = (o1 + o2);
                    System.out.println("Current Result: " + result);
                    soc += result; //adds the results to the sum so I can add up my results the entire time
                    System.out.println();
                    noc++; //increments number of calculations
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt(); // lets me pick from the menu again
                    break;
                case 2:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
                    result = (o1 - o2);
                    System.out.println("Current Result: " + result);
                    soc += result;
                    System.out.println();
                    noc++;
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
                    result = (o1 * o2);
                    System.out.println("Current Result: " + result);
                    soc += result;
                    System.out.println();
                    noc++;
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                case 4:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
                    result = (o1 / o2);
                    System.out.println("Current Result: " + result);
                    soc += result;
                    System.out.println();
                    noc++;
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                    //cases 1-4 are very similar and do just about the same things but with different calculations
                case 5:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
                    result = (Math.pow(o1, o2)); // this is a math function where the first is raised to the second
                    System.out.println("Current Result: " + result);
                    soc += result;
                    System.out.println();
                    noc++;
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                case 6:
                    System.out.print("Enter first operand: ");
                    o1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    o2 = myScanner.nextDouble();
                    System.out.println();
     // this equation allows us to use a base in logarithm function because everything is standard at base 10
                    result = (Math.log(o2) / Math.log(o1));
                    System.out.println("Current Result: " + result);
                    soc += result;
                    System.out.println();
                    noc++;
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                case 7:
                    System.out.println();
                    if (noc == 0) { //the if statement is for if the user picks 7 before anything else
                        System.out.println("Error: No calculations yet to average!");
                        System.out.println();
                    }
                    else {
                        System.out.println("Sum of calculations: " + soc);
                        System.out.println("Number of calculations: " + noc);
                        double aoc = (soc / noc);
                        DecimalFormat df2 = new DecimalFormat("#.##");
                        System.out.println("Average of calculations: " + df2.format(aoc));
                        System.out.println();
                    }
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
                default:
                    System.out.println();
                    System.out.println("Error: Invalid selection!");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    choice = myScanner.nextInt();
                    break;
            }
            if (choice == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
            }
        }
    }
}

// test!!!!!!!!!!
