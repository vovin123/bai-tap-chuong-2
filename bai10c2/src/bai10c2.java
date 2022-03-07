package bai10c2;

import java.util.Scanner;
public class ch2_bai10{
    public static void main(String[] args) {
    String chuoi;
    char kyTu;
    int dem= 0;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Nhap vao chuoi: ");
        chuoi = scanner.nextLine();
    } while (chuoi.length() > 80);         
    System.out.print("ky tu can dem: ");
    kyTu = scanner.next().charAt(0);
    for (int i = 0; i < chuoi.length(); i++) {
        if (kyTu == chuoi.charAt(i)) {
            dem++;
        }
    }     
    System.out.println("so lan xuat hien  " + kyTu +" trong chuoi " + chuoi + " = " + dem);
 }
}