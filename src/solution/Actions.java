package solution;

import models.BeachHouse;
import models.Villa;

public class Actions {
	private static BeachHouse beachHouse;
	private static Villa villa;


	public static float getBill(Object obj, int num) {
		if(obj instanceof Villa) {
			return villa.getPrice() * num;  
		}else
			if(obj instanceof BeachHouse) {
				return beachHouse.getPrice() * num;
			}
		return 0;
	}
	
	
}
