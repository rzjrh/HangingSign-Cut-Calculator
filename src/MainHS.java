import java.util.Scanner;

public class MainHS {

	public static double calcWOutside (double a, int code) {
		if (code == 1) {
			a = a+0.9;
		}
		if (code == 2) {
			a= a+1.0;
		}
		if (code == 3) {
			a= a+0.7;
		}
		else if (code !=1 && code!=2 && code !=3 ){
			System.out.println("ERROR\tChoose correct fabric code");
			a=0.00;
		}
		System.out.println("\n\n\nOUTSIDE CUT:\nThe outside width cut is: \t"+a);
		return a;
	}
	
	public static double calcHOutside (double a, int code) {
		if (code == 1) {
			a = a+0.4;
		}
		if (code == 2) {
			a= a+0.3;
		}
		if (code == 3) {
			a= a+0.3;
		}
		else if (code !=1 && code!=2 && code !=3 ){
			System.out.println("ERROR\tChoose correct fabric code");
			a=0.00;
		}
		System.out.println("The outside height cut is: \t"+a);
		return a;
	}
	
	public static double calcWInside (double a, int code, double diameter) {
		if (code == 1) {
			a = a+0.9-diameter;
		}
		if (code == 2) {
			a= a+0.1-diameter;
			System.out.println("****Note: Consider the stretch of fabric for calculating your zipper****");
		}
		if (code == 3) {
			a= a+0.7-diameter;
		}
		else if (code !=1 && code!=2 && code !=3 ){
			System.out.println("ERROR\tChoose correct fabric code");
			a=0.00;
		}
		System.out.println("\nINSIDE CUT:\nThe inside width cut is: \t"+a);
		return a;
	}
	
	public static double calcHInside (double a, int code) {
		if (code == 1) {
			a = a+0.4;
		}
		if (code == 2) {
			a= a+0.07;
		}
		if (code == 3) {
			a= a+0.3;
		}
		else if (code !=1 && code!=2 && code !=3 ){
			System.out.println("ERROR\tChoose correct fabric code");
			a=0.00;
		}
		System.out.println("The outside height cut is: \t"+a);
		return a;
	}
	
	public static void fabPrint (int fabCode) {
		if (fabCode == 1) {
			System.out.println("\n\n\nFabric: T340 Double side");
		}
		if (fabCode == 2) {
			System.out.println("\n\n\nFabric: T340 Single side and beawer or power stretch inside");
		}
		if (fabCode == 3) {
			System.out.println("\n\n\nFabric: Gray Back");
		}
		else if (fabCode !=1 && fabCode!=2 && fabCode !=3 ){
			System.out.println("\n\nERROR\tChoose correct fabric code");
			
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("WELCOME");
		System.out.println("This program is designed to calculate the Square Hanging Sign cut file");
		System.out.println("Reza Akhlaqi Feb 2020- HS-Square cut calculator v 1.0.0.6");
		System.out.println("Note: This program is not designed for other shapes of hanging signs");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\n\n\n\nPlease enter the frame Width (inches):");
		double width = sc.nextDouble();
		
		System.out.println("\nPlease enter the frame Height (inches):");
		double height = sc.nextDouble();
		
		System.out.println("\nPlease enter the tube diameter (inches):");
		double tDiameter = sc.nextDouble();
		
		System.out.println("\nPlease enter the fabric code: \n1=\tT340 with liner, double side graphic"
				+"\n2=\tT340 with liner, single side graphic, Beawer or PowerStretch inside"
				+"\n3=\tGreyBack");
		int fabricCode = sc.nextInt();
		sc.close();
		
		fabPrint(fabricCode);
		calcWOutside(width,fabricCode);
		calcHOutside(height,fabricCode);
		calcWInside(width,fabricCode, tDiameter);
		calcHInside(height,fabricCode);

	}

}
