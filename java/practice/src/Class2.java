 class Phone{
    private int id;
    private String type;
    private float price;
    private String brand;
    public Phone(){
        this.id=-1;
        this.brand="";
        this.type="";
        this.price=-1;

    }
    public Phone(int id,String brand,String type,float price){
        this.id=id;
        this.brand=brand;
        this.type=type;
        this.price=price;

    }
    @Override
     public String toString(){
        return (id+"_"+brand+"_"+type+"_"+price);
    }
 }
public class Class2 {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println(p);
    }
}
