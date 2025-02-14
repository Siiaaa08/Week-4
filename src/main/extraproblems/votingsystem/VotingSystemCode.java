package extraproblems.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystemCode {
        private Map<String, Integer> voteMap = new HashMap<>();
        private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

        public void castVote(String candidate) {
            voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
            voteOrderMap.put(candidate, voteMap.get(candidate)); // Maintain order of votes
        }

        public int getVotes(String candidate) {
            return voteMap.getOrDefault(candidate, 0);
        }

        public Map<String, Integer> getSortedResults() {
            return new TreeMap<>(voteMap);
        }

        public Map<String, Integer> getVoteOrder() {
            return voteOrderMap;
        }

        public void displayResults() {
            System.out.println("Votes in Insertion Order:");
            for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            System.out.println("\nVotes in Alphabetical Order:");
            for (Map.Entry<String, Integer> entry : getSortedResults().entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
        public String firstKey() {
            return voteOrderMap.entrySet().iterator().next().getKey();
        }

    }


