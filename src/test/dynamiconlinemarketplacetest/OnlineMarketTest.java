package dynamiconlinemarketplacetest;


import dynamiconlinemarketplace.Clothing;
import dynamiconlinemarketplace.Discount;
import dynamiconlinemarketplace.Product;
import dynamiconlinemarketplace.Storage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineMarketTest {
        @Test
        public void tester1(){
            Clothing clothing1=new Clothing("Rymonds",250000);
            Discount<Product> discount=new Discount<>();
            discount.addDiscount(clothing1,23);
            dynamiconlinemarketplace.Storage<Clothing> clothingStorage=new Storage<>();
            clothingStorage.addItem(clothing1);

           assertEquals(1,clothingStorage.getList().size());
        }


    }


