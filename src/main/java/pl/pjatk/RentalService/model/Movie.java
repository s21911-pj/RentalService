package pl.pjatk.RentalService.model;

public class Movie {
    private Long ID;
    private String name;

    public Movie() {
    }

    public Movie(Long ID, String name, MovieCathegory movieCathegory, boolean isAvailable) {
        this.ID = ID;
        this.name = name;
        this.movieCathegory = movieCathegory;
        this.isAvailable = isAvailable;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCathegory getMovieCathegory() {
        return movieCathegory;
    }

    public void setMovieCathegory(MovieCathegory movieCathegory) {
        this.movieCathegory = movieCathegory;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private MovieCathegory movieCathegory;
    private boolean isAvailable;
}
