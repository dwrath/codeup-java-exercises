package Movies;

public class Movie {
    private  String name;
    private  String category;

    public Movie (String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.getName() +" -- "+ this.getCategory();
    }
}
