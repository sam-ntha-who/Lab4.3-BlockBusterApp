import java.util.ArrayList;

public abstract class Movie {

//	A field for title that’s a string

	private String title;

//	An field for runTime (in minutes) 

	private int runTime;

//	An array list of string called scenes

	private ArrayList<String> scenes = new ArrayList<>();
	
//  Getters & Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

//	A method called printInfo() that prints all properties in the class to the 
//	console except for the scenes.

	public String printInfo() {

		
		return getTitle() + ", Runtime of: " + getRunTime() + " minutes";
	}

//	A method called printScenes() that prints all the scenes in the list along with their index. 
	public ArrayList<String> printScenes() {
		scenes = getScenes();
		for (int i = 0; i < getScenes().size(); i++) {
			System.out.println("Scene " + (i+1) + ": " + getScenes().get(i));
		}
		
		return null;
	}

//	An abstract method with no return type called play() 
	
	public abstract void play(); 
		
	

}
