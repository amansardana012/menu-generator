package Abstractfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FilenameUtils;

import menuformatter.Imenuformatter;
import menugenerator.Imenugenerator;
import readerpackage.Ireader;
import readerpackage.Fooditem;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		Abstractfactory ReaderFactory = Factoryproducer.getFactory("Reader");
		List<Fooditem> menu = new ArrayList();
		 Ireader reader = null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the desired input file (json or xml format supported)");
		String filename=sc.nextLine();
		
		String ext=FilenameUtils.getExtension(filename);
		
		if(ext.equals("json"))
		{
	    reader=  ReaderFactory.Createreader("Json");
		}
		else if(ext.equals("xml"))
		{
			reader=  ReaderFactory.Createreader("Xml");
		}
		else
		{
			System.out.println("File format not supported");
			System.exit(0);
		}
 	    menu=reader.Readfile (filename);
 	    System.out.println("Enter the country for menu (US or GB):");
 	   String country=sc.nextLine();
 	  System.out.println("Enter the category of restaurant (Diner, Eveninngonly, Allday):");
	   String category=sc.nextLine();
	   System.out.println("Enter the type of menu to be generated (Html, xml, plaintext):");
	   String output=sc.nextLine();
	   sc.close();
 	   Abstractfactory MenuFactory = Factoryproducer.getFactory("Menugenerator");
 	  Imenugenerator menu_generator = MenuFactory.Createmenu(category);
 	  menu=menu_generator.getmenu(menu, country);
 	  
 	 Abstractfactory MenuformatFactory = Factoryproducer.getFactory("Menuoutput");
 	Imenuformatter menu_format = MenuformatFactory.Createmenuoutput(output);
 	menu_format.generatemenuoutput(menu);
 	System.out.println("Menu successfully generated");
	}

}
