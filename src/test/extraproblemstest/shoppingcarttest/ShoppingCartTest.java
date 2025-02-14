package extraproblemstest.shoppingcarttest;

import extraproblems.shoppingcart.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
        @Test
        public void Tester(){
            ShoppingCart cart = new ShoppingCart();

            cart.addProduct("Laptop", 1000.0);
            cart.addProduct("Mouse", 25.0);
            cart.addProduct("Keyboard", 50.0);
            cart.addProduct("Monitor", 200.0);

            cart.addToCart("Laptop");
            cart.addToCart("Mouse");
            cart.addToCart("Keyboard");
            cart.addToCart("Monitor");

            cart.displayCart();
            cart.displaySortedCart();
            Assert.assertEquals("Mouse",cart.firstValue());
        }
    }


