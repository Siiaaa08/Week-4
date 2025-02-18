package reflection.advancedlevel.dependencyinjection;

public class Main {

        public static void main(String[] args) throws Exception {
            Client client = new Client();
            SimpleDIContainer.injectDependencies(client);
            client.clientCall();
        }
    }


