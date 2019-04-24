package warmup;

import java.util.ArrayList;
import java.util.Random;

public class warmup {

	public static void main(String[] args){ 



		ArrayList<Integer> meineListe = new ArrayList<Integer>();
		Random generator = new Random();        
		do {
			int x = generator.nextInt(11);
			if (!meineListe.contains(x)) {
				meineListe.add(x);
				System.out.println(x);
			}
		} while (meineListe.size() < 5);
		
		int x;
		Random ran = new Random();
		for(int i = 0; i <1000; i++) {
			x = ran.nextInt(900) +1;
			System.out.println(x+" "+i);
		}
	
	}

}
