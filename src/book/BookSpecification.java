package book;

public class BookSpecification {
    private double price;
    private String title;
    private int type;
    private String isbn;

    public BookSpecification(double pc,String ti,int ty,String in){
        price=pc;
        title=ti;
        type=ty;
        isbn=in;
    }
    public double getPrice(){
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public String getIsbn() {
        return isbn;
    }
}
