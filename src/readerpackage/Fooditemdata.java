package readerpackage;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

public class Fooditemdata {
		@JsonProperty("FoodItemData") List<Fooditem> FoodItemData;

	    public List<Fooditem> getFoodItem ()
	    {
	        return FoodItemData;
	    }

	    public void setFoodItem ( List<Fooditem> FoodItemData)
	    {
	        this.FoodItemData = FoodItemData;
	    }
}
