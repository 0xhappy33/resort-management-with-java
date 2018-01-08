package repos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VillaData {
	
	String path = "D:\\Learn Java\\Hackerrank\\Review-java-core\\src\\sources\\villa.txt";
	
	FileReader reader;
    BufferedReader bufferedReader;
	
	public void showAllVillaInResort() {
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
		VillaData villas = new VillaData();
		villas.showAllVillaInResort();
	}

}
