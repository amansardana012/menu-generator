package menugenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import readerpackage.Fooditem;

public class Dinermenu implements Imenugenerator{



	@Override
	public List<Fooditem> getmenu(List<Fooditem> fooditem ,String countryname) {
		
		String country = countryname;
		ArrayList<String> Diner_list= new ArrayList();
		Diner_list.add("Breakfast");
		Diner_list.add("Snack");
		Diner_list.add("Appetizer");
		Diner_list.add("Lunch");
		Diner_list.add("Dessert");
		// TODO Auto-generated method stub
		List<Fooditem> generated_menu = new ArrayList();
		for(int j=0;j<Diner_list.size();j++)
		{
	 for(int i=0; i<fooditem.size() ; i++)
	 {
		 if((fooditem.get(i).getCountry().equalsIgnoreCase(country))&& Diner_list.get(j).equals(fooditem.get(i).getCategory()) )
		 {
			 generated_menu.add(fooditem.get(i));
		 }
	 }
	}
	 //Collections.sort(generated_menu, new Fooditem());
	return generated_menu;
	}

	

}
