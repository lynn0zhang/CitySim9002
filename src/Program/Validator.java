/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author zhanglinzi
 */
public class Validator {
    //to ensure the input is a integer

    
	public static boolean Validate(String[] arg) {
		if(arg.length != 1) return false;
		
		try{
                    Integer.parseInt(arg[0]);
		} catch(NumberFormatException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}	
		return true;
	}
}
