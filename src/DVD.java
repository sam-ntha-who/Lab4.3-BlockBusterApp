import java.util.ArrayList;

import java.util.Scanner;

public class DVD extends Movie {
	
	public DVD (String title, int runTime, ArrayList<String> scenes) {
		super.setTitle(title);
		super.setRunTime(runTime);
		super.setScenes(scenes);
	}



	@Override
	public void play() {
		
		
		
		System.out.println("Which scene would you like to watch?");
		System.out.println(getScenes());
		System.out.println("Please choose a scene (by number):");
		Scanner scnr = new Scanner(System.in);
		int sceneSelection = scnr.nextInt()-1;
		System.out.println(getScenes().get(sceneSelection));
		
		boolean yesOrNo = true;
		System.out.println("Would you like to watch another scene? y/n");
	
		do {
			
			String response = scnr.nextLine();
	
		if (response.equalsIgnoreCase("y")) {
			yesOrNo = true;
		
		System.out.println("Enter the next scene number you would like to see:");
		sceneSelection = scnr.nextInt() - 1;
		if (sceneSelection > 5 || sceneSelection < 0) {
			System.out.println("Scene does not exist. Goodbye.");
		}
		System.out.println(getScenes().get(sceneSelection));
		System.out.println("Would you like to watch another scene? y/n");
		
		
		} 
		} while (yesOrNo == true);
	
	}
		
}
