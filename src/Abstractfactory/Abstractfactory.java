package Abstractfactory;

import menuformatter.Imenuformatter;
import menugenerator.Imenugenerator;
import readerpackage.Ireader;
import readerpackage.Fooditem;

public abstract class Abstractfactory {
	
public abstract Ireader Createreader(String type);
public abstract Imenugenerator Createmenu(String type);
public abstract Imenuformatter Createmenuoutput(String type);

}
