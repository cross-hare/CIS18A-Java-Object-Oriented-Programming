//Program that describes moves and lets users know if the theater is playing it
class Movie
{
    String title;
    String genre;
    int rating;

    void playIt()
    {
        System.out.println("Playing the movie");
    }//end of playIt

    void sayIt()
    {
        System.out.println("Title: " + title + "\nGenre: " + genre + "\nRating: " + rating);
    }//end of describeMovie
}//end of class Movie

public class classPractice
{
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        one.sayIt();

        System.out.println();

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.sayIt();
        two.playIt();

        System.out.println();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
        three.sayIt();

        System.out.println();

        Movie four = new Movie();
        four.title = "Ratatouille";
        four.genre = "Epic";
        four.rating = 1000;
        four.sayIt();
        four.playIt();
    }//end of main
}//end of classPractice
