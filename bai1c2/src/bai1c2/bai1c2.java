package bai1c2;

	import java.text.DecimalFormat;
	import java.util.Scanner;
	 
	public class bai1c2 {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	        System.out.println("nhap vao so dau tien: ");
	        int a = scanner.nextInt();
	        System.out.println("nhap cao so thu 2: ");
	        int b = scanner.nextInt();
	         
	       
	        int tong = a + b;
	        System.out.println(a + " + " + b + " = " + tong);
	         
	        int hieu = a - b;
	        System.out.println(a + " - " + b + " = " + hieu);
	         
	        int tich = a * b;
	        System.out.println(a + " * " + b + " = " + tich);
	         
	        float thuong = (float) a / b;
	        System.out.println(a + " / " + b + " = " + 
	                decimalFormat.format(thuong));  
	         
	        int phanDu = a % b;
	        System.out.println(a + " % " + b + " = " + phanDu);
	        
	        System.out.println("a=b " + a + " và " + 
	                b + " : " + (a == b));
	        System.out.println("a khac b " + a + " và " + 
	                b + " : " + (a != b));
	        System.out.println("a > b " + a + " và " + 
	                b + " : " + (a > b));
	        System.out.println("a>=b " + a + " và " + 
	                b + " : " + (a >= b));
	        System.out.println("a<b " + a + " và " + 
	                b + " : " + (a < b));
	        System.out.println("a<=b " + a + " và " + 
	                b + " : " + (a <= b));
}
	}

