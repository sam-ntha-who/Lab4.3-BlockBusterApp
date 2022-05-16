import java.util.ArrayList;
import java.util.HashMap;

public class VHS extends Movie {
	
	
//	A field called currentTime this will start at 0 and match up with the indexes of 
//	the arraylist of scenes 
	private int currentTime = 0;
//	An override of play() that "plays" (prints out) the scene at the current time and 
//  then increments currentTime. 
	
	public VHS (String title, int runTime, ArrayList<String> scenes) {
	
		super.setTitle(title);
		super.setRunTime(runTime);
		super.setScenes(scenes);
		
	
	}
	

	
//
//	public VHS(String title, int runTime, ArrayList<String> freeSoloSceneList) {
//		// TODO Auto-generated constructor stub
//	}



	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
//  If currentTime is greater than the max index of the array list, call rewind()
	@Override
	public void play() {
		
		for (int i = 0; i < getScenes().size(); i++) {
		System.out.println(getScenes().get(getCurrentTime()));
		currentTime++;
			
		if (getScenes().size() < currentTime +1) {
			rewind();
		}
		}
		
		
			
		
		
		
	}
//	A method called rewind() that returns nothing and sets currentTime to 0. 
	public void rewind() {
		setCurrentTime(0);
		System.out.println("\nBe Kind, Rewind");
		
	}
}
