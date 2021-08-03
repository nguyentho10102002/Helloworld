package basic.main;

import java.awt.*;
import java.util.Scanner;

public class thodtr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("enter value :");
        int a = scanner.nextInt();
        System.out.println("a = " + a);
        int b = scanner.nextInt();
        System.out.println("b = " + b);
        int dt = a*b ;
        System.out.println("dt = " + dt);
        int cv = (a+b)*2;
        System.out.println("cv = " + cv);


    }
}
