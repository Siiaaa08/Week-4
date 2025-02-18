package annotation.advancedproblems.caching;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheResultCode {
        private static final Map<String, Object> cache = new HashMap<>();

        public static Object executeWithCache(Object obj, String methodName, Object... args) {
            try {
                Method method = obj.getClass().getMethod(methodName, int.class);

                if (method.isAnnotationPresent(CacheResult.class)) {
                    String key = methodName + "_" + args[0];

                    if (cache.containsKey(key)) {
                        System.out.println("Fetching result from cache for: " + key);
                        return cache.get(key);
                    }

                    Object result = method.invoke(obj, args);
                    cache.put(key, result);
                    return result;
                }

                return method.invoke(obj, args);

            } catch (Exception e) {
                throw new RuntimeException("Error executing method: " + e.getMessage());
            }
        }
        @CacheResult
        public int factorial(int n) {
            System.out.println("Computing factorial of " + n);
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);
        }
    }


