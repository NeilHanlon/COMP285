//package NeilHanlon.COMP285.SimpleCalc;

import java.util.Scanner;

public class SimpleCalc
{
  public SimpleCalc()
  { 
  }
  public static void main(String args[])
  {
    int num1, num2;
    float result;
    String operator;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an Operator");

    operator = keyboard.next();
    char op = operator.charAt(0);

    System.out.println("Enter an integer: ");
    num1 = keyboard.nextInt();

    System.out.println("Enter an integer: ");
    num2 = keyboard.nextInt();

    if (op == '/' && (num2 == 0)){
      System.err.println("Cannnot divide by zero");
      System.exit( 0 );
    }

    switch(op){
      case '%':   result = num1 % num2;
                  break;
      case '+':   result = num1 + num2;
                  break;
      case '-':   result = num1 - num2;
                  break;
      case '/':   result = num1 / num2;
                  break;
      case '*':   result = num1 * num2;
                  break;
      default:    result = 0;
                  break;
    }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
