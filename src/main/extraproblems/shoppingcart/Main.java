package extraproblems.shoppingcart;

public class Main {
        public static void main(String[] args) {
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

        }
    }


