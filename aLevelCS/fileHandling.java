package aLevelCS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandling { 
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		readData();
		
		System.out.print("Please enter the colour of the frame here: ");
		String fcIn = userInput.nextLine();
		String frameColourIn = fcIn.toLowerCase();
		
		System.out.print("Please enter the maximum height here: ");
		String hIn = userInput.nextLine();
		int maxHeightIn = Integer.parseInt(hIn);
		
		System.out.print("Please enter the maximum width here: ");
		String wIn = userInput.nextLine();
		int maxWidthIn = Integer.parseInt(wIn);
		
		for (int i = 0; i < 21; i++) {
			
			String picFC = pictureArray[i].getFrameColour();
			int picHeight = pictureArray[i].getHeight();
			int picWidth = pictureArray[i].getWidth();
			String picDesc = pictureArray[i].getDescription();
			
			if ((frameColourIn.equals(picFC)) && (maxHeightIn > picHeight) && (maxWidthIn > picWidth)) {
				System.out.println(picDesc + " " + picWidth + " " + picHeight);
			}
		}
		
	}
	
	static Picture[] pictureArray = new Picture[100];
	
	public static int readData() {
		int pictureCount = 0;
		try {
			String filePath = "C:\\Users\\shrey\\OneDrive\\Desktop\\Pictures.txt";
			File pictureFile = new File(filePath);
			Scanner fileReader = new Scanner(pictureFile);
			
			while (fileReader.hasNext()) {
				String descriptionRead = fileReader.nextLine();
				String heightRead = fileReader.nextLine();
				String widthRead = fileReader.nextLine();
				String colourRead = fileReader.nextLine();
				pictureArray[pictureCount] = new Picture(descriptionRead, Integer.parseInt(heightRead), Integer.parseInt(widthRead), colourRead);
				pictureCount++;
			}
		} catch (FileNotFoundException e1) {
			System.out.println("File not found.");
		} return pictureCount;
	}	
}

class Picture {
	String description;
	int width, height;
	String frameColour;
	
	public Picture(String descriptionX, int widthX, int heightX, String frameColourX) {
		this.description = descriptionX;
		this.width = widthX;
		this.height = heightX;
		this.frameColour = frameColourX;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getFrameColour() {
		return frameColour;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}