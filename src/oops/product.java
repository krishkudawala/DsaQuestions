package oops;

public class product {
   private int id;
    private String name;
    private Double price;


    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public void setPrice(Double p){
        price=p;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }

}
