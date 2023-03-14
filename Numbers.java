import java.util.Scanner;

import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("Plz enter a number:");
		num=scan.nextInt();
		if(num>99 && num<1000) {
			//here it check the digits of the number : which is only 3 digits (if it is an Armstrong number or no)
			int firstDigit=(int) Math.pow(num%10, 3);
			int secondDigit=(int) Math.pow((num/10)%10, 3);
			int thirdDigit=(int) Math.pow((num/100), 3);
			
			
			if(firstDigit+secondDigit+thirdDigit==num) {
				System.out.println("the number "+num+" is an Armstrong number");
			}
			
			else {
			    System.out.println("the number "+num+" is NOT an Armstrong number");
			}

	}
		else if(num>999 && num<10000) {
			//here it check the digits of the number : which is 4 digits
			int firstDigit=(num%10);
			int secondDigit=(num/10)%10;
			int thirdDigit=(num/100)%10;
			int forthDigit=num/1000;
			
			if(firstDigit==forthDigit && secondDigit==forthDigit) {
				System.out.println("the number "+num+" is a polindrome number");
		}
		else {
			System.out.println("the number "+num+" is a polindrome number");
		               }
		}
		
		else if(num>9999 && num<100000) {
			//here it check the digits of the number : which is 5 digits
			int firstDigit=(num%10);
			int secondDigit=(num/10)%10;
			int thirdDigit=(num/100)%10;
			int forthDigit=(num/1000)%10;
			int fifthDigit=num/10000;
			
			if(firstDigit==fifthDigit && secondDigit==forthDigit) {
				System.out.println("the number "+num+" is a polindrome number");
		}
		else {
			System.out.println("the number "+num+" is NOT a polindrome number");
		}
		}
else {
	//here any other digits it write invaild number
				System.out.println("invalid number");
			}
	}
			
}
