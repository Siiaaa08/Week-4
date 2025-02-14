package extraproblems.votingsystem;

public class Main {
        public static void main(String[] args) {
            VotingSystemCode votingSystem = new VotingSystemCode();

            votingSystem.castVote("Aditya");
            votingSystem.castVote("Bobby");
            votingSystem.castVote("Charlie");
            votingSystem.castVote("Aditya");
            votingSystem.castVote("Bobby");
            votingSystem.castVote("Dev");

            votingSystem.displayResults();
        }
    }


