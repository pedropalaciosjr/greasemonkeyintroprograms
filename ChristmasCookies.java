import java.util.Scanner;

public class ChristmasCookies {
    public static void main(String[] args) {
        // Declare and initialize variables for each cookie
        String firstCookieType = "Christmas Tree";
        int firstNumOfCookies = 6;
        double firstCostPerCookie = 1.55; // Declare as a double since it's storing a decimal number
        
        String secondCookieType = "Gingerbread";
        int secondNumOfCookies = 3;
        double secondCostPerCookie = 0.99;
        
        String thirdCookieType = "Snowman";
        int thirdNumOfCookies = 4;
        double thirdCostPerCookie = 1.25;
        
        double moneyEarned = 0; // Start off with 0
        
        // Display cookie options
        System.out.println("Merry Christmas! We're selling the following cookies:");
        System.out.println(firstCookieType + " for $" + firstCostPerCookie);
        System.out.println(secondCookieType + " for $" + secondCostPerCookie);
        System.out.println(thirdCookieType + " for $" + thirdCostPerCookie);
        
        // Instantiate (create an instance) of Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which cookie would you like to buy?");
        String choice = scanner.nextLine(); // Get their input
        
        // Repeat as long as they don't enter "None"
        while (!choice.equalsIgnoreCase("None")) {
            System.out.println("How many?");
            int numChoice = scanner.nextInt(); // Assume they enter only positive integers
            scanner.nextLine();
            
            if (!choice.equalsIgnoreCase(firstCookieType) && !choice.equalsIgnoreCase(secondCookieType) && !choice.equalsIgnoreCase(thirdCookieType)) {
                // Will run if the the user's choice doesn't match any of the cookie options
                System.out.println("Sorry, but we don't have that cookie!");
            }
            else if (choice.equalsIgnoreCase(firstCookieType) && numChoice <= firstNumOfCookies) {
                // Will run if the previous condition is false and
                // their choice matches "Christmas Tree" regardless of capitalization/case
                System.out.println("Sure thing! Here's " + numChoice + " " + firstCookieType + " cookie(s)!");
                firstNumOfCookies = firstNumOfCookies - numChoice;
                moneyEarned = moneyEarned + (firstCostPerCookie * numChoice);
            }
            else if (choice.equalsIgnoreCase(secondCookieType) && numChoice <= secondNumOfCookies) {
                System.out.println(numChoice + " " + secondCookieType + " cookie(s) coming up!");
                secondNumOfCookies = secondNumOfCookies - numChoice;
                moneyEarned = moneyEarned + (secondCostPerCookie * numChoice);
            }
            else if (choice.equalsIgnoreCase(thirdCookieType) && numChoice <= thirdNumOfCookies) {
                System.out.println("Here's " + numChoice + " " + thirdCookieType + " cookie(s)!");
                secondNumOfCookies = secondNumOfCookies - numChoice;
                moneyEarned = moneyEarned + (thirdCostPerCookie * numChoice);
            }
            else {
                // Will run if they chose a valid cookie, but their requested number of cookies is too large
                System.out.println("Sorry, but we don't have that many cookies of that type!");
            }
            
            System.out.println("Which cookie would you like to buy?");
            choice = scanner.nextLine(); // Get their input again and then re-evaluate the while condition
        }
        
        // Display total money earned from cookie sales
        System.out.println("We earned $" + moneyEarned + "!");
    }
    
}