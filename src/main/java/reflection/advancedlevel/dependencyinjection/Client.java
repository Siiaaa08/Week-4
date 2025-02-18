package reflection.advancedlevel.dependencyinjection;

import java.security.Provider;

public class Client {
        @Inject
        private Service service;
        public void clientCall(){
            service.showMessage();
        }
    }


