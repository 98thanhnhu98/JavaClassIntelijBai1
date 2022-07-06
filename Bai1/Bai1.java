package javaClass.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void decToBinary(int n){
        if (n > 0)
        {
            decToBinary(n/2);
            System.out.printf("%d",n%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = sc.nextInt();
        decToBinary(n);
    }
}
