package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban Kinh: ");
        double bk = sc.nextDouble();
        sc.close();
        circle h1 = new circle(bk);
        System.out.println("Dien tich la: "+h1.getArea());
        System.out.println("Chu vi la: "+ h1.getCircumference());
        System.out.println(h1.toString());
    }
}
