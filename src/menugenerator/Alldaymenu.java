package menugenerator;

import java.util.ArrayList;
import java.util.List;

import readerpackage.Fooditem;

public class Alldaymenu implements Imenugenerator {

	
	@Override
	public List<Fooditem> getmenu(List<Fooditem> fooditem ,String countryname) {
		
		String country = countryname;
	
		ArrayList<String> Allday_list= new ArrayList();
		Allday_list.add("Breakfast");
		Allday_list.add("Snack");
		Allday_list.add("Appetizer");
		Allday_list.add("Lunch");
		Allday_list.add("Dinner");
		Allday_list.add("Dessert");
		Allday_list.add("Side Dish");
		// TODO Auto-generated method stub
		List<Fooditem> generated_menu = new ArrayList();
		for(int j=0;j<Allday_list.size();j++)
		{
	 for(int i=0; i<fooditem.size() ; i++)
	 {
		 if((fooditem.get(i).getCountry().equalsIgnoreCase(country))&& Allday_list.get(j).equals(fooditem.get(i).getCategory()) )
		 {
			 generated_menu.add(fooditem.get(i));
		 }
	 }
	}
	 //Collections.sort(generated_menu, new Fooditem());
	return generated_menu;
	}
}
