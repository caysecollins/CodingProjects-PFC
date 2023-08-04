package week4project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stepswk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Coding Steps
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		 
//			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			 	System.out.println(ages[ages.length - 1] - ages[0]); //index location always starts with 0 , not 1, so you must make sure to point to 0 to find the first element.
			

//			b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			 int[] agesNew = { 3, 9, 23, 64, 2, 8, 28, 93, 100 };
			 	System.out.println(agesNew[agesNew.length - 1] - agesNew[0]); //as index location starts with 0 you must -1 from the total length of the array to find the last element.
			 

//			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			 double sum = 0;
				for (int number : agesNew) {
					sum += number; //creates a loop that will start at 0 and add each element of the array to the one before until it reaches the end of the array
				}
			 double average = sum / agesNew.length; //divide that sum of the array elements by the length of the array
			 	System.out.println(average);
		 

//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 

//			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				double sumLetters = 0;
					for (String name : names) {
						sumLetters += name.length();
					}
				double averageNames = sumLetters / names.length; //divide that sum of the array elements by the length of the array
					System.out.println(averageNames);
					

//			b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				StringBuilder result = new StringBuilder();
					for (String string : names) {
						result.append(string + " ");
					}
					System.out.println(result);		
			

//		3. How do you access the last element of any array?
		 //point to arrayName[arrayName.length-1] as Java always starts with 0 as the first location, so the last location will be the number of elements - 1 (0=1, etc...)			
				
					
//		4. How do you access the first element of any array?
		//point to arrayName[0] as Java always starts with 0 as the first location.					
				
					
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
					int[] nameLengths = new int [names.length];
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length(); //this was my missing link the entire time I was working this problem. I kept adding this to my sysout thinking that would cover it, but I wasn't calculating before sysouting, so once I did that it was like DUH
						System.out.println(names[i] + " " + nameLengths[i]);
					 } // omg this one was SUPER HARD FOR NO REASON I felt insane, and it took me hours to figure out.
					
					 
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
					int questionSix = 0;
					for (int nameLength : nameLengths ) {
						questionSix += nameLength;
					}
					System.out.println(questionSix);
	
	}

//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		public static String method7(String word, int n) {
			String helloTimesN = "";
			for (int i = 1; i <= n; i++) {
				helloTimesN += word;
			}
			return helloTimesN;	
		}
			
					
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String method8(String firstName, String lastName) {
			return firstName + " " + lastName;
		}

					
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		public 	static int[] method9(int sum) {
			int[] array100 = new int[sum];
			for ( int i = 0; i <= 100; i++ ) {
				array100[i] = i;
			}
			return array100;
		}
					
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		public static void method10(double sum) {
			double[] array = new double[(int) sum];
			for (double i = 0; i > sum; i++) {
				array[(int) i] = i;
			}
			double average = sum / array.length;
			System.out.println(average);
		}// cannot figure out what I'm doing wrong here! 
					
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.


					
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.


					
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

		
}