public class Main{
	public static void main(String [] args){
	    //creating the artist and two artwork objects
	    Artist artist = new Artist("Hanzo");
	    Artwork art1 = new Artwork("Casandra",1521,artist);
	    Artwork art2 = new Artwork("kill",1321);
	    //changing the title and year
	    art2.setTitle("murder");
	    art2.setYear(1891);
	    //printing the results
	    System.out.println(art1);
	    System.out.println(art2);
	    //getting the shallow and deep copy
	    Artwork shallowCopyOfArt1 = art1.shallowCopy();
	    Artwork deepCopyOfArt1 = art1.deepCopy();
	    System.out.println("");
	    System.out.println(art1);
	    //printing to see the results of shallow and deep copy
	    System.out.println(shallowCopyOfArt1);
	    System.out.println(deepCopyOfArt1);
	     System.out.println("");
	    art1.setArtistName("Alucard");
	    //seeing the change of artist name in both copies 
	    System.out.println(art1);
	    System.out.println(shallowCopyOfArt1);
	    System.out.println(deepCopyOfArt1);
	    
	    
	    
	
	
	
	}




}
