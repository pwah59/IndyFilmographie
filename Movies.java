class Movies {
// à minima une classe nommée + une méthode

//methode principale = point d'entrée du prgm
	public static void main(String[] args) {
    // init vars
	String[] archePerdue  = {"Les Aventuriers de l'Arche perdue","Harrison Ford", "Karen Allen"};  
	String[] templeMaudit = {"Indiana Jones et le Temple maudit","Harrison Ford", "Kate Capshaw"};
	String[] dernCroisade = {"Indiana Jones et la Derniere Croisade","Harrison Ford", "Sean Connery"};
    String[] craneCristal = {"Indiana Jones et le Royaume du Crane de Cristal","Harrison Ford", "Cate Blanchett"};
   String[][] movies = {archePerdue,templeMaudit,dernCroisade,craneCristal }; 
   boolean alreadyViewed = true;

for(String[] movie : movies)
		System.out.println("Dans le film " + movie[0] + ", les principaux acteurs sont " + movie[1] + " , " +movie[2] +"." );
		
	}


}
