package queueinterface.circularbuffersimulation;

public class Main {
        public static void main(String[] args) {
            Buffer cb = new Buffer(3);

            cb.insert(1);
            cb.insert(2);
            cb.insert(3);
            cb.display();

            cb.insert(4);
            cb.display();

            cb.insert(5);
            cb.display();

            System.out.println("Peek oldest: " + cb.peek());

        }
    }


