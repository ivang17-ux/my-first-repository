public class Main{
   public static void main(String[] args){
   
   Movie movie1 = new Movie();
   movie1.title = "Zootopia";
   movie1.genre = "Fantasy";
   movie1.duration = 113;
   
   Movie movie2 = new Movie();
   movie2.title = "Avengers";
   movie2.genre = "Action";
   movie2.duration = 102;
   
   Movie movie3 = new Movie();
   movie3.title = "Spiderman";
   movie3.genre = "Action";
   movie3.duration = 83;
   
   movie1.displayInfo();
   movie2.displayInfo();
   movie3.displayInfo();


}
}