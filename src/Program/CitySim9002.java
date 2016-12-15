/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Random;


/**
 *
 * @author Linzi Zhang
 */
public class CitySim9002 {
    private static int VISITOR_num = 4;
    private static int LOCATION_num = 5;
    public static String errMsg1 = "Please enter one integer argument, seed";
    
    
    public static void main(String[] args) {
        //to determine if the input is only one integer
        if (!new Validator().Validate(args)) {
            System.out.println(errMsg1);
            System.exit(0);
        }
        //set the seed
        int seed = Integer.parseInt(args[0]);
        System.out.println("Welcome to CitySim!  Your seed is " +seed+ " .");	
	Visitor visitors = new Visitor();	
		String nextVisitor = "";
		
		Locations locations = new Locations();
		String nextLocation = "";
		
		Getrandom visGenerator = new Getrandom(seed, VISITOR_num);
		String[] visitorList = visitors.visitor(visGenerator);
		
		Random generator = new Random(seed);
		
		for(int i=1; i<=5; i++) {
			//1. generate a visitor
			nextVisitor = visitorList[i-1];		
			System.out.println("Visitor " + i + " is a " + nextVisitor);
			
			//2. visit location
			nextLocation = locations.getLocation(generator.nextInt(LOCATION_num) + 1);
			
			//when it's the first vist, the visitor cannot leave.
			while(nextLocation.compareTo("left") == 0) {
				nextLocation = locations.getLocation(generator.nextInt(LOCATION_num) + 1);
			}
			
			while(nextLocation.compareTo("left") != 0) {
				System.out.println("Visitor " + i + " is going to " + nextLocation + "!");
				if(visitors.likeLocation(nextVisitor, nextLocation))
					System.out.println("Visitor " + i + " did like " + nextLocation + ".");
				else
					System.out.println("Visitor " + i + " did not like " + nextLocation + ".");
				nextLocation = locations.getLocation(generator.nextInt(LOCATION_num) + 1);
			}
			
			System.out.println("Visitor " + i + " has left the city.");
			System.out.println("***");
		}
	}
	
	
	
    }

