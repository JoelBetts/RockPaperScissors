/* Joel Betts
 *
 * This program will use subroutines to preform multiple tasks on a number
 * input by the user.
 */
package myfirstsubroutine;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class MyFirstSubroutine {
    
    public static double sineAndRet (int num)
    {
    // Finds the sine of the number and returns it.    
        double sin = Math.sin(num);
        return (sin);
    }
    
    public static double cosineAndRet (int num)
    {
    // Finds the cosine of the number and returns it.     
        double cos = Math.cos(num);
        return (cos);
    }
    
    public static double tangentAndRet (int num)
    {
    // Finds the tangent of the number and returns it.    
        double tan = Math.tan(num);
        return (tan);
    }
    
    public static int multiAndRet (int num)
    {
    // Finde the product of the number multiplied by 2 and returns it.
        int product = num * 2;
        return (product);
    }
    
    public static void primeAndOut (int num)
    {
    // Determinds if the number is prime or not.    
        boolean flag = false;
        
        for (int i=2; i<=num/2; i++)
        {
            //condition for non prime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        
        if (!flag)
            System.out.println("It is a prime number.");
        
        else
            System.out.println("It is not a prime number");
        
    }
    
    public static void main(String[] args) {
        // Prompts the user to choose a subroutine.
        
        
        Scanner keyedInput = new Scanner (System.in);
        
        
        int number;
        
        System.out.println("Enter a number and we will find: ");
        System.out.println("");
        System.out.println("The Sine in radians");
        System.out.println("");
        System.out.println("The CoSine in radians");
        System.out.println("");
        System.out.println("The Tangent radians");
        System.out.println("");
        System.out.println("The product when multiplied by 2");
        System.out.println("");
        System.out.println("If it's a Prime Number");
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter your number: ");
        
        number = keyedInput.nextInt();
        
        System.out.println("The sine of " +number+ " is: " + sineAndRet(number));
        System.out.println("The cosine of " +number+ " is: " + cosineAndRet(number));
        System.out.println("The tangent of " +number+ " is: " + tangentAndRet(number));
        System.out.println("The product is " + multiAndRet(number));
        
        primeAndOut(number);
        
    } 
}
