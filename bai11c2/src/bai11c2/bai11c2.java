package bai11c2;

import java.util.Scanner;

public class bai11c2 {
	public static void main(String[] args) {
	    int n, sum = 0, tempSort;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("nhap so phan tu cua mang: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	         
	    
	    int array[] = new int[n];
	         
	    System.out.println("nhap cac phan tu cau mang: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("nhap phan tu thu " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	         
	    
	    System.out.println("\nmang ban dau: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    
	    for (int i = 0; i < n; i++) {
	        sum += array[i];
	    }
	    System.out.println("\ntong phan tu trong mang = " + sum);
	         
	    
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j <= n - 1; j++) {
	            if (array[i] > array[j]) {
	                tempSort = array[i];
	                array[i] = array[j];
	                array[j] = tempSort;
	            }
	        }
	    }
	    System.out.println("mang sau khi sap xep: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    
	    
	}
}