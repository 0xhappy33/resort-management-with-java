package solution;

import models.BeachHouse;
import models.Villa;

public class Actions {
	private static BeachHouse beachHouse;
	private static Villa villa;


	public static float getBill(Object obj, int num) {
		if(obj instanceof Villa) {
			return villa.getmPrice() * num;  
		}else
			if(obj instanceof BeachHouse) {
				return beachHouse.getmPrice() * num;
			}
		return 0;
	}
	
	
}
