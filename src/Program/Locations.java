/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.HashMap;

/**
 *
 * @author zhanglinzi
 */
public class Locations {
	
	private HashMap<Integer, String> locationMap;
	public Locations() {		
		locationMap = new HashMap<Integer, String>();
		
		//Four places and one left
                //to ensure the 20% to leave
		locationMap.put(1, "The Cathedral of Learning");
		locationMap.put(2, "Squirrel Hill");
		locationMap.put(3, "The Point");
		locationMap.put(4, "Downtown");
		locationMap.put(5, "left");
	}

	public String nextLocation(Getrandom Lrand) {
		String location = locationMap.get(Lrand.generator()+1);
		return location;
	}

	public String getLocation(int index) {
		return locationMap.get(index);
	}
}