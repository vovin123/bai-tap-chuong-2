package bai8c2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai8c2
{

    public static void main(String[] args) 
    {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
         
       
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("nhap vao bao nhieu so nguyen: ");
        n = scanner.nextInt();
         
       
        for (int count = 1; count <=n; count++) 
        {
            System.out.println(" nhap so thu " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("TB cong = " + decimalFormat.format(avgNumber));
    }
}