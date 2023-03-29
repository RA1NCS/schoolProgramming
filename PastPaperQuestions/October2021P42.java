package PastPaperQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class October2021P42 { 
	
	public static void main(String[] args) {
		
		Picture[] pictureArray = new Picture[100]; // Part d
		int numOfPictures = Picture.ReadData(pictureArray); // Part f
		
		// Part g
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the colour of the frame you want: ");
		String frameInput = (userInput.next()).toLowerCase();
		
		System.out.print("Please enter the maximum width of the frame you want: ");
		int maxWidthInput = userInput.nextInt();
		
		System.out.print("Please enter the maximum height of the frame you want: ");
		int maxHeightInput = userInput.nextInt();
		
		for (int i = 0; i < numOfPictures; i++) {
			
			String arrayFrameColour = pictureArray[i].GetFrameColour();
			int arrayHeight = pictureArray[i].GetHeight();
			int arrayWidth = pictureArray[i].GetWidth();
			String arrayDescription = pictureArray[i].GetDescription();
			
			if ((arrayFrameColour.equals(frameInput)) && (arrayHeight <= maxHeightInput) && (arrayWidth <= maxWidthInput)) {
				System.out.println(arrayDescription + " " + arrayWidth + " " + arrayHeight);
			}
			
		}
		
	}
	
}

class Picture {
	// Part a
	private String Description;
	private int Width;
	private int Height;
	private String FrameColour;
	public Picture(String DescriptionX, int WidthX, int HeightX, String FrameColourX) {
	    Description = DescriptionX;
	    Width = WidthX;
	    Height = HeightX;
	    FrameColour = FrameColourX;
	}
	// Part b
	public String GetDescription() {
	    return Description;
	}
	public int GetWidth() {
	    return Width;
	}
	public int GetHeight() {
	    return Height;
	}
	public String GetFrameColour() {
	    return FrameColour;
	}
	// Part c
	public void SetDescription(String description) {
	    Description = description;
	}
	// Part e
	public static int ReadData(Picture[] pictureArray) {
	    
	    String filePath = "C:\\Users\\shrey\\OneDrive\\Desktop\\Pictures.txt";
	    File PicturesFile = new File (filePath);
	    int numberOfPictures = 0;
	    try {
	        Scanner scanReader = new Scanner(PicturesFile);
	        
	        while (scanReader.hasNextLine()) {
	            String readDescription = scanReader.nextLine();
	            String readWidth = scanReader.nextLine();
	            String readHeight = scanReader.nextLine();
	            String readColour = scanReader.nextLine();
	            
	            pictureArray[numberOfPictures] = new Picture(readDescription, Integer.parseInt(readWidth), Integer.parseInt(readHeight), readColour);
	            numberOfPictures++;
	        }
	        
	        scanReader.close();
	        
	    } catch (FileNotFoundException e1) {
	        System.out.println("File not found.");
	    }
	    
	    return numberOfPictures;
	}}