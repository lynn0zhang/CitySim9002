package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Visitor {
	
	private List<String> studentL;
	private List<String> professorL;
	private List<String> businessL;
	private List<String> bloggerL;
	
	private static HashMap<String, List<String>> visitorInfo;
	private List<String> visitorTypes;
	
        //initialize the prefenrence of all types visitors
	public Visitor() {
		
		visitorInfo = new HashMap<String, List<String>>();
		//Student information
		studentL = new ArrayList<String>();
		studentL.add("Squirrel Hill");
		studentL.add("Downtown");
		studentL.add("The Point");
		//System.out.println(studentLikes.get(0) + studentLikes.get(1));
		visitorInfo.put("Student", studentL);
		
		//Professor information
		professorL = new ArrayList<String>();
		professorL.add("The Cathedral of Learning");
		professorL.add("Squirrel Hill");
		professorL.add("Downtown");
		professorL.add("The Point");
		visitorInfo.put("Professor", professorL);
		
		//Business Person information
		businessL = new ArrayList<String>();
		businessL.add("Squirrel Hill");
		businessL.add("Downtown");
		visitorInfo.put("Business Person", businessL);
		
		//Blogger information
		bloggerL = new ArrayList<String>();
		visitorInfo.put("Blogger", bloggerL);
		
		visitorTypes = new ArrayList<String>();
		visitorTypes.add("Student");
		visitorTypes.add("Professor");
		visitorTypes.add("Business Person");
		visitorTypes.add("Blogger");
	}
	
	
	
	 // Generate the next visitor
	public String nextVisitor(Getrandom generator) {
		String selected = visitorTypes.get(generator.generator());
		return selected;
	}
	
	public String[] visitor(Getrandom generator) {
		String[] visitor = new String[5];
		int[] visitorIndex = generator.generateVisitor();
		
		for(int i =0; i<5; i++) {
			visitor[i] = visitorTypes.get(visitorIndex[i]);
		}
		return visitor;
	}
	
	
	 // Detemine whether the visitor likes this location
	 // @param visitor
	 // @param location
	 // @return true - like ; false - not like
	
	public static boolean likeLocation(String visitor, String location) {
		return visitorInfo.get(visitor).contains(location);
	}
	
}