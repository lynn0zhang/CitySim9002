/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Random;

/**
 *
 * @author zhanglinzi
 */

public class Getrandom {
    private int seed;
    private int type;
    
    public Getrandom(int s, int t){
        this.seed = s;
        this.type = t;
    }
    
    //generate random number
    public int generator(){
        int r;
        Random random = new Random(this.seed);
        r = random.nextInt(this.type);
        return r;
    }
    
    public int[] generateVisitor() {
		int[] vList = new int[5];
		
		Random generator = new Random(seed);
		for(int i=1; i<=5; i++) {
			vList[i-1] = generator.nextInt(type);
		}		
		return vList;
	}


}
