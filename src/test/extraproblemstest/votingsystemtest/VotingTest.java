package extraproblemstest.votingsystemtest;

import extraproblems.votingsystem.VotingSystemCode;
import org.junit.Assert;
import org.junit.Test;

public class VotingTest {
        @Test
        public void Tester(){
            VotingSystemCode votingSystem = new VotingSystemCode();

            votingSystem.castVote("Aditya");
            votingSystem.castVote("Bobby");
            votingSystem.castVote("Charlie");
            votingSystem.castVote("Aditya");
            votingSystem.castVote("Bobby");
            votingSystem.castVote("Dev");
            Assert.assertEquals("Aditya",votingSystem.firstKey());
        }
    }


