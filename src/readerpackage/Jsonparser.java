package readerpackage;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Jsonparser implements Ireader {

	@Override
	public List<Fooditem> Readfile(String filename) {
		
		
		ObjectMapper mapper = new ObjectMapper();
		 
		try {		
			Fooditemdata item = mapper.readValue(new File(filename), Fooditemdata.class);
			List<Fooditem> fooditem = item.FoodItemData;
			
			return fooditem;
		}
		catch (JsonGenerationException e) {
			 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
			
			System.out.println("Oops something went wrong, Check the filepath & Try again");
			e.printStackTrace();
	 System.exit(0);
		}
		return null;
		
	}

}
