package se.lexicon;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
       Scanner scanner= new Scanner(System.in);

       boolean Loop=true;
       while (Loop){

           System.out.println("Enter first number");
           double number1 = scanner.nextDouble();

           System.out.println("Enter operator");
           char opr = scanner.next().charAt(0);

           System.out.println("Enter second number");
           double number2 = scanner.nextDouble();
           double result = 0;

           switch (opr) {
               case '+':
                   result = add(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               case '-':
                   result = sub(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               case '*':
                   result = mult(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;

               case '/':
                   result = div(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               default:
                   System.out.println(opr + "operator is not supported");
           }

           System.out.println("Press 1 to exit and 2 to continue");

           int input=scanner.nextInt();
         if (input ==1) {
             Loop = false;
         }
         else {
             continue;
         }

       }//End loop

    } // End of main

    public static double add(double number1, double number2 ){
        return number1+number2;
    }
    public static double sub(double number1, double number2 ){
        return number1-number2;
    }
    public static double mult(double number1, double number2 ){
        return number1*number2;
    }
    public static double div(double number1, double number2 ){
        return number1/number2;
    }

}


