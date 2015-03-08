package menugenerator;

import java.util.ArrayList;
import java.util.List;

import readerpackage.Fooditem;

public class Eveningonlymenu implements Imenugenerator {

	@Override
		public List<Fooditem> getmenu(List<Fooditem> fooditem ,String countryname) {
			
			String country = countryname;
			ArrayList<String> Eve_list= new ArrayList();
			
			Eve_list.add("Appetizer");
			Eve_list.add("Dinner");
			Eve_list.add("Dessert");
			Eve_list.add("Side Dish");
			// TODO Auto-generated method stub
			List<Fooditem> generated_menu = new ArrayList();
			for(int j=0;j<Eve_list.size();j++)
			{
		 for(int i=0; i<fooditem.size() ; i++)
		 {
			 if((fooditem.get(i).getCountry().equalsIgnoreCase(country))&& Eve_list.get(j).equals(fooditem.get(i).getCategory()) )
			 {
				 generated_menu.add(fooditem.get(i));
			 }
		 }
		}
		 //Collections.sort(generated_menu, new Fooditem());
		return generated_menu;
		}

	

	

}
