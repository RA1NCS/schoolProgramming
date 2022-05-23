package PastPaperQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class May21P42Q2 {

	public static void main(String[] args) {
		
		treasureChest[] chestArray = new treasureChest[5];
		
		treasureChest.readData(chestArray);
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the question number between 1 and 5: ");
		int questionIn = userInput.nextInt();
		int attemptsCount;
		int treasureNumber = questionIn - 1;
		
		if (questionIn >= 1 && questionIn  <= 5) {
			
			System.out.println("Solve this to get your prize! " + (chestArray[treasureNumber].getQuestion())); // RETURNS QUESTION AT CHEST ARRAY NUMBER
			System.out.print("Answer: ");
			int answerIn = userInput.nextInt();
			attemptsCount = 1;
			
			
			while (!chestArray[treasureNumber].checkAnswer(answerIn)) { // WHILE ANSWER IS WRONG
				System.out.print("Your answer is wrong, please enter the answer again: ");
				answerIn = userInput.nextInt();
				attemptsCount++;
			}
			
			int pointsAwarded = (chestArray[treasureNumber].getPoints(attemptsCount)); // GET POINTS AT ARRAY VALUE OF TREASURENUMBER
			System.out.println("You scored " + pointsAwarded + " points, congratulations!");
		}
		
	}
	
}

class treasureChest {

	// Part A
	private String question;
	private int answer, points;

	public treasureChest(String questionX, int answerX, int pointsX) {
		this.question = questionX;
		this.answer = answerX;
		this.points = pointsX;
	}
	
	// Part B
	public static void readData	(treasureChest[] chestArray) {
	
		// MAIN STARTS HERE
	
		try { 
			String FilePath = "C:\\Users\\shrey\\OneDrive\\Desktop\\TreasureChestData.txt";
			File treasureFile = new File(FilePath);
			Scanner fileReader = new Scanner(treasureFile);
			
			int arrayCount = 0;
			
			while (fileReader.hasNext()) {
				
				String readQuestion = fileReader.nextLine();
				String readAnswer = fileReader.nextLine();
				String readPoints = fileReader.nextLine();
				
				chestArray[arrayCount] = new treasureChest(readQuestion, Integer.parseInt(readAnswer), Integer.parseInt(readPoints));
				arrayCount++;
				
			}
			
			fileReader.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("File not found.");
		} 
		
	}
	
	// Part C(i)
	public String getQuestion() {
		return question;
	}
	
	public int getAnswer() {
		return answer;
	}
	
	// Part C(ii)
	public boolean checkAnswer(int userAnswer) {
		Boolean output = (answer == userAnswer) ? true : false;
		return output;
	}
	
	// Part C(iii)
	public int getPoints(int AttemptCount) {
		if (AttemptCount == 1) return points;
		else if (AttemptCount == 2) return (points / 2);
		else if (AttemptCount == 3 || AttemptCount == 4) return (points / 4);
		else return 0;
	}
	
}