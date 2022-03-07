package bai6c2;
import java.util.Scanner;
public class bai6c2
{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n;
        int gt=1;
        System.out.print("Nhap so nguyen duong: ");
        n=scanner.nextInt();
        do{                              
           gt=gt*n;
           n--;                        
        }while(n>0);
        if(n<0)
            System.out.println("nhap so nguyen duong !");
        else
        System.out.println("Giai thua cua so do la: "+gt);   
    }}