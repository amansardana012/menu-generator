package menugenerator;

import menuformatter.Imenuformatter;
import readerpackage.Ireader;
import Abstractfactory.Abstractfactory;

public class menugeneratorfactory extends Abstractfactory{
	
	
	@Override
	public Imenugenerator Createmenu(String type) {
		
		if(type.equalsIgnoreCase("Diner"))
		{
			return new Dinermenu();
		}
		if(type.equalsIgnoreCase("Allday"))
		{
			return new Alldaymenu();
		}
		if(type.equalsIgnoreCase("Eveningonly"))
		{
			return new Eveningonlymenu();
		}
		return null;
	}

	@Override
	public Ireader Createreader(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Imenuformatter Createmenuoutput(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
