package extraproblems.insurancepolicy;

import java.util.*;

public class InsuranceManagementSystem {
        private Map<String, Policy> hashMap = new HashMap<>();
        private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        private TreeMap<Date, Policy> treeMap = new TreeMap<>();

        public void addPolicy(Policy policy) {
            hashMap.put(policy.getPolicyNumber(), policy);
            linkedHashMap.put(policy.getPolicyNumber(), policy);
            treeMap.put(policy.getExpiryDate(), policy);
        }

        public Policy getPolicyByNumber(String policyNumber) {
            return hashMap.get(policyNumber);
        }

        public List<Policy> getExpiringPolicies() {
            List<Policy> expiringPolicies = new ArrayList<>();
            Date today = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(today);
            cal.add(Calendar.DAY_OF_YEAR, 30);
            Date next30Days = cal.getTime();

            for (Map.Entry<Date, Policy> entry : treeMap.entrySet()) {
                if (!entry.getKey().after(next30Days)) {
                    expiringPolicies.add(entry.getValue());
                }
            }
            return expiringPolicies;
        }

        public List<Policy> getPoliciesByHolder(String policyholderName) {
            List<Policy> policies = new ArrayList<>();
            for (Policy policy : hashMap.values()) {
                if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                    policies.add(policy);
                }
            }
            return policies;
        }

        public void removeExpiredPolicies() {
            Date today = new Date();
            treeMap.entrySet().removeIf(entry -> entry.getKey().before(today));

            hashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
            linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
        }

        public void displayPolicies() {
            for (Policy policy : linkedHashMap.values()) {
                System.out.println(policy);
            }
        }
    }


