package week04;

import java.util.*;
import java.lang.*;


public class CodingAssignment {

	public static void main(String[] args) {
		
		//This is  a array of Integers.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// I here will change the valued at the index of ages.length() -1.
		ages[ages.length -1] -= ages[0];
		
		// This enhanced for loop iterates through the array ages and prints out the element age at each index. 
		for(int age : ages){
			System.out.println(age);
		}
		
		// This is an array of integers with an index of 9.
		int[] ages2 = {14, 1, 38, 87, 34, 16, 6, 55, 44};
		
		//I set the value of the last element to equal itself minus the first element.
		ages2[ages2.length - 1] -= ages2[0];
		
		// This enhanced for loop iterates through the array ages2 and prints out the element age at each index. 
		for(int age : ages2){
		System.out.println(age);
		}
				
		//This int will be the become the value of the average ages of the array ages.
		int averageAge = 0;
				
		//This for loop iterates over the array and calculates the average of the ages.		
		for(int age : ages){
			averageAge += age;
		}
				
		System.out.println("The average age is: " + (averageAge / ages.length));
				
		//This int will be the become the value of the average ages2 of the array ages2.
		int averageAge2 = 0;
				
		//This for loop iterates over the array and calculates the average of the ages.		
		for(int age : ages2){
			averageAge2 += age;
		}
				
		System.out.println("The average age is: " + (averageAge2 / ages2.length));
				
		//This is an array of string
		String[] names = new String[] {"Sam", "Tom", "Tim", "Sally","Buck", "Bob"};
				
		//This integer will hold the value of the average number of letters in names.
		int averageLetterCount = 0;
				
		//This it has four Loop iterates through the String array and calculates the average number of letters in each namer.
		for(String letter : names) {
			averageLetterCount += letter.length();
		}
		System.out.println("The average letter count for each namer is: " + (averageLetterCount / names.length));
		
		//This string will hold the Concatenated values of the string names.
		String concatNames= "";
		
		//This loop will iterate through the array, and concatenate the names together, separated by a space in comma.
		for (String name : names) {
				concatNames += name + ", ";
		}
		System.out.println(concatNames);
		
		/* 3. You access the last element in an array by calling it with the 
		array.length property - 1 as the index you are looking for..*/
		System.out.println("This is the last element of array names: " + names[names.length - 1]);
		
		/* 4. You access the first element in an array by using the base 0 numbering system
		 *For example; names[0]
		 */
		System.out.println("This is the first ellement of array names: " + names[0]);
		
		// This an array of int that will hold the value of the length of each element in the array.
		int[] nameLengths = new int[names.length];
		
		/*This for loop iterates over the names array and counts the number 
		 * of letters in each element and assigns it to Corresponding value of the names of array.
		 */
		int i = 0;
		for (String name : names) {
			nameLengths[i] = name.length();
			System.out.println("Name: " + name + ", Length of name: " + nameLengths[i]);
			i++;
		}
		
		//This for loop calculates the sum of all the elements in the array nameLengths.
		int sum = 0;
		for (int value : nameLengths) {
			sum += value;
		}
		System.out.println("The total sum of the nameLenghts variable is: " + sum);
		
		
		//This method will return a word
		 System.out.println(wrdConcat("Jordan", 5));
		 
		 
		 //This method takes two strings firsName and lastName and returns the full name.
		 System.out.println(fullName("Jordan", "Denton"));
		 
		//This method returns true if the sum of all the numbers in the array are greater than 100.
		 int [] numList = new int[] {6,56,87,9};
		 
		 System.out.println(arrayTotal(numList));
		
		//This method takes an array of double and returns the average of all the values.
		double[] dblArray = new double[10];
		
		//This for loop generates the values of the elements of the array.
		for(int j = 0; j < dblArray.length; j++) {
			double num; 
			num = (double)(Math.random() * 100 +1);
			dblArray[j] = num;
		}
		for (double element : dblArray) {
			System.out.print(element + " , ");
		}
		System.out.println("\nThe average of the elements of this array is: " + doubleArrayAverage(dblArray));
		
		//This method takes two double arrays and returns true if the first arrays average is greater than the second.
		double[] dblArray1 = new double[20]; 
		double[] dblArray2 = new double[20];
		
		//This loop populates the elements in dblArray1 with random.
		for(int k = 0; k < dblArray1.length; k++) {
			double num1; 
			num1 = (double)(Math.random() * 10 + 1);
			dblArray1[k] = num1;
			System.out.println(dblArray1[k]);
		}
		
		
		//This loop populates the elements of dblArray2 with random numbers.
		for(int k = 0; k < dblArray2.length; k++) {
			double num2; 
			num2 = (double)(Math.random() * 10 + 1);
			dblArray2[k] = num2;
			System.out.println(dblArray2[k]);
		}
		
		System.out.println(compareAverages(dblArray1, dblArray2));
		
		//This method compares two boolean variables and returns true if both variables are true.
		boolean isHotOutside, hasMoneyInPocket;
		
		/*
		 * These random numbers will generate a number between 1 and 10
		 */
		int randomNumber1 = (int)(Math.random() * 10 + 1);
		int randomNumber2 = (int)(Math.random() * 10 + 1);
		
		//This if statement randomly generates the boolean statement for isHotOutside.
		if(randomNumber1 < 5) {
			isHotOutside = true;
		} else {
			isHotOutside = false;
		}
		
		//This if statement randomly generates the boolean statement for hasMoneyInPocket.
		if(randomNumber2 > 5) {
			hasMoneyInPocket = true;
		} else {
			hasMoneyInPocket = false;
		}
		
		System.out.println("Is it hot outside: " + isHotOutside + " " + " Have money in pocket: " + hasMoneyInPocket);
		System.out.println("Will buy a dirnk: "  + willBuyDrink(isHotOutside, hasMoneyInPocket));
		
		//This method simulates the roll of two dice in the game of craps.
		int die1, die2;
		
		//Generate number between 1 and 6 for die 1.
		die1 = (int)(Math.random()* 6 + 1);
		//Generate number between 1 and 6 for die 1.
		die2 = (int)(Math.random()* 6 + 1);
		
		System.out.println(rollOfDie(die1, die2));
			
	}//End of Main
	
	
		//This method simulates the roll of two dice in a game of craps.
		public static String rollOfDie(int die1, int die2) {
			
			//This string holds the value of the dice.
			String rolled = "" + (die1 + die2);
			String hand = "You rolled a: " + rolled + " roll again!" + "\nDie 1 = " + die1 + " Die 2 = " + die2;
			String prefix = " Die 1 = " + die1 + " Die 2 = " + die2;
			int rollTotal = (die1 + die2);
			
			if (die1 == die2) {
				return hand = "Doubles, roll again! Die 1: " + prefix;
			}else if(die1 == 1 && die2 == 1) {
				return hand = "Snake Eyes! "+ prefix;
			} else if(die1 + die2 == 7) {
				return hand = "Seven, you lose! " + prefix;
			} else if(die1 == 2 && die2 == 2 || die1 == 2 && die2 == 2) {
				return hand = "Double duce, roll again!";
			} else if(rollTotal == 4 && die1 != 2 && die2 != 2) {
				return hand;
			} else if(rollTotal == 5 &&  die1 != 5 || die2 != 5) {
				return hand;
			} else if(rollTotal == 6 && die1 == 3 || die2 == 3) {
				return hand;
			} else if(rollTotal == 8 && die1 == 4 || die2 == 4) {
				return hand;		
			} else if(rollTotal == 10 && die1 != 5 || die2 != 5) {
				return hand;
			} else
			return hand;  
		}

	public static boolean willBuyDrink(boolean isHotOutside, boolean hasMoneyInPocket) {
		boolean results;
		
		if(isHotOutside && hasMoneyInPocket) {
			results = true;
		} else { 
			results = false;
		}
		return results;
		
	}

	//This method compares the averages between two double arrays and returns true if the first on is greater then the second.
		public static Boolean compareAverages(double[] array1, double[] array2) {
			double average1 = 0.0;
			double average2 = 0.0;
			
			//This for loop calculates the average of array1.
			for(double element : array1) {
				average1 += element;
			}
			//This for loop calculates the average of array2.
			for (double element : array2) {
				average2+= element;
			}
			//This if statement compares the averages of thre two arrays and returns true if array1 is larger than array2.
			if (average1 < average2) {
				return true;
			} else {
				return false;
			}
		}
	
		//This method takes the doubleArray elements and returns the average.
		public static double doubleArrayAverage(double[] array) {
			double results = 0.0d;
			for (double element : array) {
				results += element;
			}
			
			return results / array.length;
		}
		//This method takes an array of int and returns the true if the some total is greater than 100.
		public static Boolean arrayTotal(int[] intArray) {
			int total = 0;
			
			for (int value : intArray) {
				total += value;
			}
			if(total > 100) {
				return true;
			} else {
				return false;
			}
			
		}
		
		//This method takes two strings representing first name and last name and returns full name.
		public static String fullName(String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		
		return fullName;
		}

		
		//This method takes a string wrd and concatanates it to itself by the int times.
		public static String wrdConcat(String wrd, int times) {
		String result ="";
		
		for (int i = 0; i < times; i++) {
			result += wrd;
		}
		
		return result;
		}
}
