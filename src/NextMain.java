public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("a", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        var plane = new Comedy("Airplane");
        plane.watchComedy();
        Object unknownIbject = Movie.getMovie("C", "Airplane");
        if(unknownIbject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownIbject;
            c.watchComedy();
        } else if (unknownIbject instanceof Adventure) {
            ((Adventure) unknownIbject).watchAdventure();

        }else if(unknownIbject instanceof ScienceFiction syfy){
            syfy.watchAdventure();
        }
    }
}
