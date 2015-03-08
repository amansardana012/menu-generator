package menuformatter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import readerpackage.Fooditem;

public class Plaintext implements Imenuformatter {


	@Override
	public void generatemenuoutput(List<Fooditem> list) {
		try {
			PrintWriter writer = new PrintWriter ("menu.txt");
		
		ArrayList<String> menu_order= new ArrayList();
		Fooditem item = new Fooditem();
		String category = list.get(0).getCategory();
		currency obj = new currency();
		String currency=obj.currency(list.get(0).getCountry().toString());
		writer.println("Menu");
		writer.println();
	writer.println(category);
	writer.println();
		for(int i=0; i<list.size(); i++)
		{
			String name;
			if(category.equals(list.get(i).getCategory()))
			{
				
				 name=String.format("%1$-" + 70 + "s", list.get(i).getName());
				writer.println(name + currency+" "+list.get(i).getPrice());
		writer.println(list.get(i).getDescription());	
		writer.println();
		}
			else
			{
			   category =list.get(i).getCategory();
				writer.println(list.get(i).getCategory());
				writer.println();
				name=String.format("%1$-" + 70 + "s", list.get(i).getName());
				writer.println(name+ currency+" "+list.get(i).getPrice());
				writer.println(list.get(i).getDescription());	
				writer.println();
			}
			
	}
		writer.close();
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}