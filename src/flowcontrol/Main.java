package flowcontrol;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Random;
//import java.util.Collections;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		
//		System.out.println("Numbers:");
//		AsciiChars.printNumbers();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();
		
		
		ArrayList<String> questions = new ArrayList<>();
		
		questions.add("Do you have a red car? (yes/no");
		questions.add("What's the name of your favorite pet?");
		questions.add("how old is your favorite pet?");
		questions.add("What is your lucky number?");
		questions.add("What is the jersey number wof your favorite quarterback?");
		questions.add("What is the two digit number of your car?");
		questions.add("What is the first name of your favorite actor?");
		questions.add("Enter a random number");
		
		ArrayList<String> answers = new ArrayList<>();
		ArrayList<Integer> lottonum = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you want to continue to the interactive portion? (y/n");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			
			for (String question : questions) {
				System.out.println(question);
				String resp = userInput.nextLine();
				answers.add(resp);				
			}
		
       } else {
    	System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
    	userInput.close();
    	System.exit(0);
    	}
		lottonum = genNumbers(answers);
		System.out.println("Your lottery numbers are:");
		
		for(Integer lottoNumber : lottonum) {
			if(lottonum.indexOf(lottoNumber) < lottonum.size()-1) {
				System.out.printf("%d,", lottoNumber);
			} else {
			}	System.out.printf("and the Magic Ball is: %d",  lottoNumber);
		}
	}
	private static  ArrayList<Integer> genNumbers(ArrayList<String> ansStrings) { 
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Random random = new Random();
		Integer randOne = random.nextInt(75)+1;
		Integer randTwo = random.nextInt(75)+1;
		Integer randThree =	random.nextInt(75)+1;
		
		Integer numZero = 0;
		if(ansStrings.get(0).length() > 2) {
			Character charZero = ansStrings.get(0).charAt(2);
			numZero = Character.getNumericValue(charZero);
		} else {
			Character charZero = ansStrings.get(0).charAt(0);
			numZero = Character.getNumericValue(charZero);
		}
		while(numZero < 1 || numZero > 65) {
			if(numZero< 1) {
				numZero += 23;
			} else if(numZero > 65) {
				numZero -= 17;
				
			numbers.add(numZero);
			
			Integer numOne = Integer.parseInt(ansStrings.get(1)) + Integer.parseInt(ansStrings.get(4));
			while(numOne > 65) {
				numOne -= 35;
				
				numbers.add(numOne);
				
			Integer numTwo = Integer.parseInt(ansStrings.get(5)) - randOne;
			while(numTwo < 1 || numTwo > 65) {
				numTwo += 10;
				
				numbers.add(numTwo);
				
			Integer numThree = Character.getNumericValue(ansStrings.get(6).charAt(0)) + Character.getNumericValue(ansStrings.get(6).charAt(ansStrings.get(3).length()-1));
			while(numThree < 65) {
				numThree -= 22;
				
				numbers.add(numThree);
			
			Integer numFour = Integer.parseInt(ansStrings.get(2)) + Integer.parseInt(ansStrings.get(5)) + Integer.parseInt(ansStrings.get(4)) + Integer.parseInt(ansStrings.get(2)) + Integer.parseInt(ansStrings.get(3)) - 42;
			while(numFour > 65) {
				numFour -= 33;
				
				Integer magicNum = Integer.parseInt(ansStrings.get(3)) * randOne; 
				while(magicNum > 75) {
					magicNum = magicNum - 75;
					
				}
				numbers.add(magicNum);
				
				return numbers;
				}
			}
		}
	}
	}
				
				
				
			}
		return numbers;
		}
		}
			
	
		
	


