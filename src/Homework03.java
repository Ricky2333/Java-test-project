//编写类Book，定义方法updatePrice，实现更改某本书的价格，具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book(123.4);
        book.info();
        book.updatePrice(160);
        book.info();
    }
}

class Book {
    double price;

    public Book(double price) {
        this.price = price;
    }

    public void updatePrice(double price) {
        if(price > 150){
            this.price = 150;
        }else if(price > 100){
            this.price = 100;
        }
    }

    public void info() {
        System.out.println("Price is " + this.price);
    }
}
