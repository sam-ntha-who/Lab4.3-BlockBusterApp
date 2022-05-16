import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {
// needs work

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean yesOrNo = true;
		int userSelection;
		String response;
		// movie arrayList
		ArrayList<Movie> movies = new ArrayList<>();
		// arrayList for scenes
		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		// title + runtime + scenes added to second arrayList
		movies.add(new VHS("Divine Secrets of the Ya-Ya Sisterhood", 116, divineSecretsOfTheYaYaSisterhoodSceneList));

		// arrayList for scenes copypasta
		ArrayList<String> EncantoSceneList = new ArrayList<String>(
				Arrays.asList("We meet the family Madrigal and how not special Mirabel is", "The magic is getting weak",
						"WE DON'T TALK ABOUT BRUNO", "We talk about Bruno", "The magic returns!"));
		// title + runtime + scenes added to second arrayList
		movies.add(new VHS("Encanto", 109, EncantoSceneList));

		// arrayList for scenes copypasta
		ArrayList<String> FreeSoloSceneList = new ArrayList<String>(Arrays.asList(
				"Alex considers climbing the big rock without ropes",
				"We look at Alex's brain to see why he's not afraid", "Everyone else talks about how scary this is",
				"False start, Alex quits part way up because it doesn't feel right",
				"Alex climbs El Capitan without ropes or gear"));
		// title + runtime + scenes added to second arrayList
		movies.add(new VHS("Free Solo", 100, FreeSoloSceneList));

		// arrayList for scenes copypasta
		ArrayList<String> AvatarSceneList = new ArrayList<String>(
				Arrays.asList("Jake's twin brother is killed and he decideds to take his place on Pandora",
						"Jake learns to pilot a big blue kitty person avatar",
						"Bad guys do bad guy stuff because money", "The baddest guy starts a war he can't finish",
						"Jake is now one of the big blue kitty people forever"));
		// title + runtime + scenes added to second arrayList
		movies.add(new DVD("Avatar", 160, AvatarSceneList));

		// arrayList for scenes copypasta
		ArrayList<String> SoulSceneList = new ArrayList<String>(
				Arrays.asList("Joe gets the gig of his life", "Joe accidentally dies",
						"Joe finds himself in the great before", "Joe and 22 accidentally wind up in the wrong bodies",
						"Joe helps 22 find purpose and grabs life by the horns"));
		// title + runtime + scenes added to second arrayList
		movies.add(new DVD("Soul", 100, SoulSceneList));

		// arrayList for scenes copypasta
		ArrayList<String> TheMatrixSceneList = new ArrayList<String>(Arrays.asList("Neo follows the white rabbit",
				"Red pill or blue pill", "Ope everything is bad, humanity is living in the matrix",
				"Neo learns everything", "Neo saves the day"));
		// title + runtime + scenes added to second arrayList
		movies.add(new DVD("The Matrix", 139, TheMatrixSceneList));

		System.out.println("Welcome to Sam's BlockBuster!");
		System.out.println("Our selection is unbeatable.");
		do {
		System.out.println("Please select a movie from the list:");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(i+1 + ". " + movies.get(i).printInfo());
			
		}
		System.out.println("Which Movie would like to watch? Select by number:");
		userSelection = scnr.nextInt();
		
		if (userSelection <= movies.size() && (userSelection != 0)) {
			System.out.println("Now Playing: " + movies.get(userSelection - 1).getTitle());
			movies.get(userSelection - 1).play();
			System.out.println("Would you like to watch another movie? y/n");
			response = scnr.next(); 
			if (response.equalsIgnoreCase("y")) {
				yesOrNo = true;
			} else {
				yesOrNo = false;
			}
			
			
			
		} else {
			System.out.println("That is not a valid selection, please try again.");
		}
		} while (userSelection > 6 || userSelection < 1 || yesOrNo == true);
}
}