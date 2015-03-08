package readerpackage;

import menuformatter.Imenuformatter;
import menugenerator.Imenugenerator;
import Abstractfactory.Abstractfactory;

public class Readerfactory extends Abstractfactory{

		

		@Override
		public Ireader Createreader(String type) {
			if(type.equals("Xml"))
			{
				return new Xmlparser();
			}
			if(type.equals("Json"))
			{
				return new Jsonparser();
			}
				// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Imenugenerator Createmenu(String type) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Imenuformatter Createmenuoutput(String type) {
			// TODO Auto-generated method stub
			return null;
		}

	}

