package dynamiconlinemarketplace;

public class Discount <T extends Product>{

        public void addDiscount(T product,int rate) {
            double rateDiscount=rate/100.0;
            double newPrice=product.getPrice()*(1-rateDiscount);
            product.setPrice(newPrice);
            System.out.println("Discount applied: " + rate + "% off on "
                    + ". New Price: " + product.getPrice());

        }
    }


