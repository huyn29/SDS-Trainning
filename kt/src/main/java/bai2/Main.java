package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanVien nv1 = new kyThuat("so1","Huy nguyen","19/09/2000","Hanoi","it");
        System.out.println("Nhap ma nhan vien:");
        String mnv = sc.nextLine();
        System.out.println("Nhap ho va ten:");
        String ht = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        String ns = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String dc = sc.nextLine();
        System.out.println("Nhap chuyen nganh:");
        String cn = sc.nextLine();
        sc.close();
        nhanVien nv2 = new kyThuat(mnv,ht,ns,dc,cn);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
