package entertainment;

public class RunnerEntertainment {

	public static void main(String[] args) {
		
		Movie movie= new Movie();
		movie.name = "Julai";
		movie.director = "Trivikram";
		movie.stuntMaster = "Peter Hein";
		movie.numberOfArtists = 57;
		movie.releaseDate = "15-Aug-2012";
		movie.collectionsFirstWeek = 215467.8;
        movie.collectionsRestOfTheDays = 541132.5;
        System.out.println("Movie-TotalCollections: "+ movie.getTotalCollections(movie.collectionsFirstWeek,movie.collectionsRestOfTheDays));
        
		
		Drama drama = new Drama();
        drama.name = "Ramayana";
        drama.writer = "Valmiki";
        drama.stageSetter = "Anjaneya";
        drama.numberOfArtists = 200000;
        drama.releaseDate = "17-Mar-1659 BC";
        drama.collectionsFirstWeek = 3282937242.86;
        drama.collectionsRestOfTheDays = 93488272349.51;
        System.out.println("Drama-TotalCollections: "+ drama.getTotalCollections(drama.collectionsFirstWeek,drama.collectionsRestOfTheDays));
        
        System.out.println(drama.name+" "+ drama.writer);
        
       

	}

}
