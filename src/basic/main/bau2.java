package basic.main;

import java.util.Scanner;

public class bau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int leghth = scanner.nextInt();
        System.out.println("leghth = " + leghth);
        int width = scanner.nextInt();
        System.out.println("width = " + width  );
        int heigh = scanner.nextInt();
        System.out.println("heigh = " + heigh);
        int TT = caculateVolume (leghth, width  , heigh);
        System.out.println("TT = " + TT);
        int Sxq = scanner.nextInt();
        System.out.println("Sxq= (2*h)*(a+b)" + Sxq);
        int V = scanner.nextInt();
        System.out.println("V=a*b*h" + V);

    }

    public static int caculateVolume(int length, int width, int heigh)
    {
        return length * width * heigh;
    }
}

