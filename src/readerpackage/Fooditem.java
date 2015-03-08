package readerpackage;

import java.util.Comparator;

import org.codehaus.jackson.annotate.JsonProperty;

public class Fooditem implements Comparator<Fooditem> {
	    private String id;

	    private String category;

	    private String price;

	    private String description;

	    private String name;
	    @JsonProperty("-country")
	    private String country;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getCategory ()
	    {
	        return category;
	    }

	    public void setCategory (String category)
	    {
	        this.category = category;
	    }

	    public String getPrice ()
	    {
	        return price;
	    }

	    public void setPrice (String price)
	    {
	        this.price = price;
	    }

	    public String getDescription ()
	    {
	        return description;
	    }

	    public void setDescription (String description)
	    {
	        this.description = description;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getCountry ()
	    {
	        return country;
	    }

	    public void setCountry (String country)
	    {
	        this.country = country;
	    }

	    @Override
	    public String toString()
	    {
	    	return "category =" +category;
	       // return "[id = "+id+", category = "+category+", price = "+price+", description = "+description+", name = "+name+", country = "+country+"]";
	    }
	   

		@Override
		public int compare(Fooditem o1, Fooditem o2) {
		
			return (o1.getCategory()).compareTo(o2.getCategory());		
			
		}
	}
