package repos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HouseData {
	
	String path = "D:\\Learn Java\\Hackerrank\\Review-java-core\\src\\sources\\house.txt";
	
	FileReader reader;
    BufferedReader bufferedReader;
	
	public void showAllHousesInResort() {
		try {
			reader = new FileReader(path);
			bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		HouseData villas = new HouseData();
		villas.showAllHousesInResort();
	}

}
