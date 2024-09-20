public class Main{
	public static void main(String [] args){
	    Artist artist = new Artist("Hanzo");
	    Artwork art1 = new Artwork("Casandra",1521,artist);
	    Artwork art2 = new Artwork("kill",1321);
	    art2.setTitle("murder");
	    art2.setYear(1891);
	    System.out.println(art1);
	    System.out.println(art2);
	    Artwork shallowCopyOfArt1 = art1.shallowCopy();
	    Artwork deepCopyOfArt1 = art1.deepCopy();
	    System.out.println("");
	    System.out.println(art1);
	    System.out.println(shallowCopyOfArt1);
	    System.out.println(deepCopyOfArt1);
	     System.out.println("");
	    art1.setArtistName("Alucard");
	    System.out.println(art1);
	    System.out.println(shallowCopyOfArt1);
	    System.out.println(deepCopyOfArt1);
	    
	    
	    
	
	
	
	}




}
