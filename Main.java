/*
Name-> Shwet Gaur
PRN-> 23070126126
Branch-> AIML B2
*/

package lab.assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while(continueCalc) 
    {
            try{
                //displaying Menu
                System.out.println("\n----- Calculator Menu -----");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Square Root");
                System.out.println("8. Exit");
                System.out.print("Choose an operation: ");
                
                int choice = sc.nextInt();
                double num1, num2, result;

                switch (choice) 
            {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = Addition.add(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = Subtraction.subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = Multiplication.multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = Division.divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        result = Square.square(num1);
                        System.out.println("Result: " + result);
                        break;

                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        result = Cube.cube(num1);
                        System.out.println("Result: " + result);
                        break;

                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = sc.nextDouble();
                        result = Sqroot.squareRoot(num1);
                        System.out.println("Result: " + result);
                        break;

                    case 8:
                        continueCalc = false;
                        System.out.println("Exiting Calculator. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select between 1 and 8.");
                }

            } 
            
            catch(InputMismatchException e){
                //handling invalid input type from user
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next();  //clear buffer
            } 
            
            catch(ArithmeticException e){
                //handling specific arithmetic errors
                System.out.println("Error: " + e.getMessage());
            } 
            
            catch(Exception e){
                //generic exception handling
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }

        sc.close();
    }
}
