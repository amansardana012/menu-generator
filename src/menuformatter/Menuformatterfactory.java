package menuformatter;

import readerpackage.Ireader;
import menugenerator.Imenugenerator;
import Abstractfactory.Abstractfactory;

public class Menuformatterfactory extends Abstractfactory {

	public Imenuformatter Createmenuoutput(String type)
	{
		if(type.equalsIgnoreCase("plaintext"))
		{
			return new Plaintext();
		}
		if(type.equalsIgnoreCase("xml"))
		{
			return new Xmloutput();
		}
		if(type.equalsIgnoreCase("Html"))
		{
			return new Htmloutput();
		}
		return null;
	}

	@Override
	public Ireader Createreader(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imenugenerator Createmenu(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
