package DotComGame;

import java.util.ArrayList;

public class simpleDotCom {

	private ArrayList <String> location = new ArrayList <String> ();
		
	private  void setLocations(ArrayList <String> loc){
		location = loc;
	}
	public String checkGuess (String userGuess){
		
		String result =  "miss";
		int index = location.indexOf (userGuess);
		
		if (index>=0){
			location.remove(index);
			result = location.isEmpty () ? "kill" : "hit";
		}
		System.out.println (result);
		
		return result;
		
		
	}
	
}
