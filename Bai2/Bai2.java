package javaClass.Bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập Mã Số SV theo Bxxxxxxx vs x là các số từ 1-9");
        String a = sc.next();
        boolean matches = a.matches("^B+[0-9]{7}");
        if (matches){
            System.out.println("ĐÚNG"+ a);
        }else {
            System.out.println("SAI");
        }
    }
}
