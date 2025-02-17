package junit.basic.annotations;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DBConnectionTest {

        static class DatabaseConnection {
            private boolean isConnected = false;

            public void connect() {
                isConnected = true;
                System.out.println("Database Connected!");
            }

            public void disconnect() {
                isConnected = false;
                System.out.println("Database Disconnected!");
            }

            public boolean isConnected() {
                return isConnected;
            }
        }

        private DatabaseConnection db;

        @BeforeEach
        public void setUp() {
            db = new DatabaseConnection();
            db.connect();
        }

        @AfterEach
        public void tearDown() {
            db.disconnect();
        }

        @Test
        public void testConnectionIsEstablished() {
            assertTrue(db.isConnected(), "Database should be connected.");
        }

        @Test
        public void testConnectionIsClosedAfterTest() {
            db.disconnect();
            assertFalse(db.isConnected(), "Database should be disconnected.");
        }
    }


