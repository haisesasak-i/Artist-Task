public class Artwork{
    //attributes
	private String title;
	private int year;
	private Artist artist;
	//first constructor
	public Artwork(String title , int year , Artist artist){
		this.title = title;
		this.year  = year;
		this.artist = artist;
	
	
	
	}
	//second constructor
	public Artwork(String title , int year){
	
		this(title,year,new Artist("Unknown Artist"));
	
	}
	//getters
	public String getTitle(){
	  return this.title;
	
	}
	public int getYear(){
	  return this.year;
	
	}
	public Artist getArtist(){
	
	  return this.artist;
	
	}
	//Overrriding the toString()
	@Override
	public String toString(){
	      
	  return "The artwork "+this.title+" was published by "+this.artist.getName()+" in the year "+this.year+".";  
	}
	
	//shallow copy method
	public Artwork shallowCopy(){
	  return new Artwork(this.title,this.year,this.artist);
	}
	//deep copy method
	public Artwork deepCopy(){
	  return new Artwork(this.title,this.year,new Artist(this.artist.getName()));
	}
	//setters
	public void setYear(int year){
	  this.year = year;
	}
	public void setTitle(String title){
	  this.title = title;
	
	}
	public void setArtistName(String name){
	  this.artist.setName(name);
	}
	



















}
