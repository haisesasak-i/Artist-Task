public class Artist{
	//attributes (Encapsulation)
	private String name;
	//constructor
	public Artist(String name){
	
		this.name = name;
	
	}
	//getter
	public String getName(){
	
		return this.name;
	
	}
	//Overriding the to String method
	@Override
	public String toString (){
	
		return "The name of the artist is \" this.name \"";
	
	}
	//setting the artist name
	public void setName(String name){
	  this.name = name;
	}















}
