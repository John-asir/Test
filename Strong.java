package org.am;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner s = new Scanner (System.in);
	int number = s.nextInt();
	int num = number;
	int temp;
	int check = 0;
	while (num>0) {
		temp = num%10;
		check= check+(temp*temp*temp);
		num=num/10;
	}
	
if (number==check) {
	System.out.println("its a amstrong number!!!");
}
else {
	System.out.println("****its not  amstrong number****");
}
	}

}
