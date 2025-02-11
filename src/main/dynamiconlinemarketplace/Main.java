package dynamiconlinemarketplace;

public class Main {
        public static void main(String[] args) {
            Clothing clothing1=new Clothing("Rymonds",250000);
            Clothing clothing2=new Clothing("Dev",250000);
            Book book1=new Book("Raygan",3400);
            Book book2=new Book("Karmanya",299);
            Discount<Product> discount=new Discount<>();
            discount.addDiscount(clothing1,23);
            discount.addDiscount(clothing1,45);
            discount.addDiscount(book1,30);
            discount.addDiscount(book2,12);
            Storage<Clothing> clothingStorage=new Storage<>();
            Storage<Book> bookStorage=new Storage<>();
            clothingStorage.addItem(clothing2);
            clothingStorage.addItem(clothing1);
            bookStorage.addItem(book1);
            bookStorage.addItem(book2);
            System.out.println(clothingStorage.getList());
            System.out.println(bookStorage.getList());

        }
    }




