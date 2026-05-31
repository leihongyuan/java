class Book{
    private String title;
    private String author;
    private double price;
    private int quantity;
    public Book(String title,String author,double price,int quantity){
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;

    }
    public boolean hasStock(){
       boolean b=false;
        if(quantity>0){
          b=true;
        }else if(quantity==0){
            b=false;
        }
        return b;
    }
    public void sell(int sum){
        if(sum>quantity){
            System.out.println("库存不足");
        }else {
            quantity-=sum;
        }

    }
    public void Show(){
        System.out.println("书名："+title+"\n作者："+author+"\n价格："+price+"\n库存："+quantity);
    }
    //重写object类的toString()方法
    //如果不重新写，就会返回原本的：类+哈希地址
    @Override
    public String toString(){
        return ("书名："+title+"\n作者："+author+"\n价格："+price+"\n库存："+quantity);
    }
}
public class Class {
    public static void main(String[] args) {
        Book b1=new Book("清华","leihongyuan",100,1000);
        b1.Show();
        System.out.println(b1);
        //程序会自动执行b1.toString()-->如果没有重写.toString()方法，就只会输出：类+哈希地址=Book@50040f0c

    }
}
