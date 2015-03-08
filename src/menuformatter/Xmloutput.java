package menuformatter;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import readerpackage.Fooditem;

public class Xmloutput implements Imenuformatter {

	

	@Override
	public void generatemenuoutput(List<Fooditem> list) {
		

		try {
			
				
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			currency obj = new currency();
			String currency=obj.currency(list.get(0).getCountry().toString());
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("MenuItems");
			doc.appendChild(rootElement);
			String category = "";
			Element Fooditem = null;
			
			for(int i=0; i<list.size(); i++)
			{
				
				if(!(category.equals(list.get(i).getCategory())))
				{
					 Fooditem = doc.createElement("MenuCategory");
					category= list.get(i).getCategory();
					rootElement.appendChild(Fooditem);
					Attr attr = doc.createAttribute("category");
					attr.setValue(category);
					Fooditem.setAttributeNode(attr);	
				}
					Element menuitem = doc.createElement("MenuItem");
					Fooditem.appendChild(menuitem);
					Element Name = doc.createElement("Name");
					Name.appendChild(doc.createTextNode(list.get(i).getName()));
					menuitem.appendChild(Name);
					
					Element price = doc.createElement("Price");
					menuitem.appendChild(price);
					
					Element currencycode = doc.createElement("CurrencyCode");
					currencycode.appendChild(doc.createTextNode(currency));
					price.appendChild(currencycode);
					
					Element Amount = doc.createElement("Amount");
					Amount.appendChild(doc.createTextNode(list.get(i).getPrice()));
					price.appendChild(Amount);
					
					Element Description = doc.createElement("Description");
					Description.appendChild(doc.createTextNode(list.get(i).getDescription()));
					menuitem.appendChild(Description);
					
					
			}
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("menu.xml"));
	 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
	 
			transformer.transform(source, result);
	 
			//System.out.println("File saved!");
	 
		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
		}
		
	}


