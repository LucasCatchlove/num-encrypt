// importing foreign classes
/* 
 --------------------------------------------------------
  Assignment 2
  Written by: Lucas Catchlove id: 27145640
  For COMP 248 Section EE – Fall 2016

   ** Number Encrypt **

  This program receives a 4-digit number from the user
  and applies a mathematical alrogithm to encrypt it. 
  
 --------------------------------------------------------
 */

 // importing class for user input
import java.util.Scanner; 


public class NumEncrypt {


	public static void main(String[] args) { // Main method. 


		System.out.println("---------------------------------------------\n" 		// Welcome message.
							+ "            ** Number Encrypt **\n" 
							+ "---------------------------------------------");

		Scanner kbinput = new Scanner(System.in);
		int num1, num2, num3, num4; 
		int tempnum1, tempnum2, tempnum3, tempnum4;

		System.out.print("Please enter the four digit number you wish to encrypt: \n"); // Receives input from user.
		int FourDigNum = kbinput.nextInt();

		// If statement only functions if the input is 4 digits long.

		if (FourDigNum < 1000 || FourDigNum > 9999) {

			System.out.println("Sorry, but your number is not a four-digit number. "
								+ "The program will now end.\n");
		    }

			else  {

				// mathematical way of spliting the input int into 4 sperate integers. 

				num4 = FourDigNum % 10;
				FourDigNum = FourDigNum / 10;

				num3 = FourDigNum % 10;
				FourDigNum = FourDigNum / 10;

				num2 = FourDigNum % 10;
				FourDigNum = FourDigNum / 10;

				num1 = FourDigNum % 10;
				FourDigNum = FourDigNum / 10;

				// Encryption alrgorithm. 
				num4 = (num4 + 7) % 10; 
				num3 = (num3 + 7) % 10; 
				num2 = (num2 + 7) % 10; 
				num1 = (num1 + 7) % 10; 
				
				// Output that displays the encrytpted version of the input number
				System.out.println("The encrypted verion of your number is: " + num3 +  num4 + num1 +  num2); 

				System.out.println("Thanks for using Number Encrypt! Bye now.");

			}

		


	}
}