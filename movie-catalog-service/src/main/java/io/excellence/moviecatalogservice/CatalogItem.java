package io.excellence.moviecatalogservice;





import lombok.Data;

@Data


public class CatalogItem 
{
	
	
	
	
	private String name ;
	
	
	private String desc;
	
	
	private int rating ;


	public CatalogItem(String name, String desc, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}


	
	
	
	
	

}