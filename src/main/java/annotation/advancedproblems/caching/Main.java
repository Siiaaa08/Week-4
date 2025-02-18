package annotation.advancedproblems.caching;

public class Main {
        public static void main(String[] args) {
            CacheResultCode operations = new CacheResultCode();

            System.out.println("First Call: " + CacheResultCode.executeWithCache(operations, "factorial", 5));
            System.out.println("Second Call: " + CacheResultCode.executeWithCache(operations, "factorial", 5)); // From cache
            System.out.println("New Call: " + CacheResultCode.executeWithCache(operations, "factorial", 6)); // New computation
        }

    }


