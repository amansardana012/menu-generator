package readerpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Xmlparser implements Ireader{

	@Override
	public List<Fooditem> Readfile(String filename) {
		
		  try {

				File file = new File(filename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
	 
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
	 
		
	 
		NodeList nList = doc.getElementsByTagName("FoodItem");
	 
		ArrayList<Fooditem> fooditems =new ArrayList();
	
	 
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Fooditem items = new Fooditem();
			Node nNode =  nList.item(temp);
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	
				items.setId(eElement.getElementsByTagName("id").item(0).getTextContent());
				items.setCategory(eElement.getElementsByTagName("category").item(0).getTextContent());
				 items.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
				items.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
				items.setPrice(eElement.getElementsByTagName("price").item(0).getTextContent());
				items.setCountry(eElement.getAttribute("country"));
				
			fooditems.add(items);
			
	 
			}
		
		}
		return fooditems;
	    } catch (Exception e) {
		System.out.println("Oops something went wrong, Check the filepath & Try again");
		e.printStackTrace();
		System.exit(0);
	    }
		return null;
	}

}
