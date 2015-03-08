package menuformatter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import readerpackage.Fooditem;

public class Htmloutput implements Imenuformatter{

	@Override
	public void generatemenuoutput(List<Fooditem> list) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter("menu.html");
		
		ArrayList<String> menu_order= new ArrayList();
		Fooditem item = new Fooditem();
		String category = list.get(0).getCategory();
		
		currency obj = new currency();
		String currency=obj.currency(list.get(0).getCountry().toString());
		writer.println("<CENTER>Menu</CENTER>");
		writer.println("<H1>"+category+"</H1>");
		writer.println("<UL>");
		for(int i=0; i<list.size(); i++)
		{
			if(category.equals(list.get(i).getCategory()))
			{
				
				writer.println("<LI>");
				writer.println(list.get(i).getName()+"<BR>");
				writer.println("<i>"+list.get(i).getDescription()+"</i><BR>");
				writer.println(currency+" "+list.get(i).getPrice()+"<BR>");
				writer.println("</LI>");
				
		}
			else
			{
				 category =list.get(i).getCategory();
				 writer.println("</UL>");
				 writer.println("<H1>"+category+"</H1>");
				 writer.println("<UL>");
				writer.println("<LI>");
				writer.println(list.get(i).getName()+"<BR>");
				writer.println("<i>"+list.get(i).getDescription()+"</i><BR>");
				writer.println(currency+" "+list.get(i).getPrice()+"<BR>");
						writer.println("</LI>");
			  
				
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

	
