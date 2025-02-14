package extraproblemstest.insurancepolicytest;


import extraproblems.insurancepolicy.InsuranceManagementSystem;
import extraproblems.insurancepolicy.Policy;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertTrue;

public class InsurancePolicyTest {

        @Test
        public void testMapPerformanceComparison() throws Exception {
            InsuranceManagementSystem system = new InsuranceManagementSystem();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            system.addPolicy(new Policy("P1001", "Alice", sdf.parse("2025-03-15"), "Health", 5000.0));
            system.addPolicy(new Policy("P1002", "Bob", sdf.parse("2024-07-10"), "Auto", 3000.0));
            system.addPolicy(new Policy("P1003", "Charlie", sdf.parse("2024-06-25"), "Home", 4500.0));

            String searchKey = "P1002";

            long startTime = System.nanoTime();
            system.getPolicyByNumber(searchKey);
            long hashMapTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            system.getPolicyByNumber(searchKey); // Using the same method since it retrieves from HashMap
            long linkedHashMapTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            system.getExpiringPolicies(); // TreeMap operation
            long treeMapTime = System.nanoTime() - startTime;

            System.out.println("HashMap Search Time: " + hashMapTime + " ns");
            System.out.println("LinkedHashMap Search Time: " + linkedHashMapTime + " ns");
            System.out.println("TreeMap Search Time: " + treeMapTime + " ns");

            assertTrue("Expected HashMap to be faster than LinkedHashMap", hashMapTime >= linkedHashMapTime);
            assertTrue("Expected LinkedHashMap to be faster than TreeMap", linkedHashMapTime <= treeMapTime);
        }
    }



