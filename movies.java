import java.util.Arrays;

class Movies {
	public static void main(String[] args) {
		String title[] = {
			"Indiana Jones and the Kingdom of the Crystal Skull", 
			"Indiana Jones and the Last Crusade", 
			"Indiana Jones and the Temple of Doom"
		};
		String actor[][] = {
			{"Harrison Ford", "Cate Blanchett", "Karen Allen"},
			{"Harrison Ford", "Sean Connery", "Denholm Elliott"},
			{"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}
		};
		for (int i = 0; i < title.length; i++) {
			System.out.println("Dans le film " + title[i] + "les principaux acteurs sont : ")
		   for(int j  = 0; j < title.length; j++) {
              System.out.println( actor[i][j] ); 
		   }
        }
	}	
}


