package basic.main;

import java.util.Scanner;

  public class bai3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int a = scanner.nextInt();
        System.out.println(" a  =  " + a );
        int b = scanner.nextInt();
        System.out.println(" b = " + b);
        int c = scanner.nextInt();
        System.out.println(" c = " + c);
        float denta = ( b * b - 4 * a * c);
        float x ;
        float x1 ;
        float x2 ;
        if (denta < 0)
        {
            System.out.println("The above equation has no solution: ");
        }
            if (denta == 0)
            {
                System.out.println("The above equation has a solution : x = " +(-b/(2*a)) );
            }
        if(denta>0)
        {
            System.out.println("The above equation has two solutions : x1 = " + ((- b + Math.sqrt(denta))/(2*a)));
            System.out.println("The above equation has two solutions : x2 = " + ((- b - Math.sqrt(denta))/(2*a)));
        }

        }
    }