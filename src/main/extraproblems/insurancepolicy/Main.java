package extraproblems.insurancepolicy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
                public static void main(String[] args) throws ParseException {
                    InsuranceManagementSystem system = new InsuranceManagementSystem();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    system.addPolicy(new Policy("P1001", "Alice", sdf.parse("2025-03-15"), "Health", 5000.0));
                    system.addPolicy(new Policy("P1002", "Bob", sdf.parse("2024-02-20"), "Auto", 3000.0));
                    system.addPolicy(new Policy("P1003", "Alice", sdf.parse("2024-01-28"), "Home", 4500.0));
                    system.addPolicy(new Policy("P1004", "Charlie", sdf.parse("2025-02-10"), "Health", 6000.0));

                    System.out.println("All Policies:");
                    system.displayPolicies();

                    System.out.println("\nPolicies Expiring in the Next 30 Days:");
                    for (Policy policy : system.getExpiringPolicies()) {
                        System.out.println(policy);
                    }

                    System.out.println("\nPolicies for Alice:");
                    for (Policy policy : system.getPoliciesByHolder("Alice")) {
                        System.out.println(policy);
                    }

                    System.out.println("\nRemoving Expired Policies...");
                    system.removeExpiredPolicies();
                    system.displayPolicies();
                }
            }



