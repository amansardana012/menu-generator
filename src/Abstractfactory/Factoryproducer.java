package Abstractfactory;

import menuformatter.Menuformatterfactory;
import menugenerator.menugeneratorfactory;
import readerpackage.Readerfactory;

public class Factoryproducer {

		   public static Abstractfactory getFactory(String choice){
		   
		      if(choice.equalsIgnoreCase("Reader")){
		         return new Readerfactory();
		         
		      }
		      if(choice.equalsIgnoreCase("Menugenerator")){
		         return new menugeneratorfactory();
		      }
		      if(choice.equalsIgnoreCase("Menuoutput"))
		      {
		    	  return new Menuformatterfactory();
		      }
		      return null;
	  }
}
