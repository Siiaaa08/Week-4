package junit.advanced.passwordstrengthvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class PasswordValidator {
        public static boolean isValidPassword(String password) {
            if (password == null || password.length() < 8) return false;
            if (!password.matches(".*[A-Z].*")) return false;
            if (!password.matches(".*\\d.*")) return false;
            return true;
        }
    }

    public class PasswordValidatorTest {
        @Test
        public void testValidPassword() {
            assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Valid password should return true");
        }

        @Test
        public void testShortPassword() {
            assertFalse(PasswordValidator.isValidPassword("Short1"), "Password with less than 8 chars should return false");
        }

        @Test
        public void testNoUppercase() {
            assertFalse(PasswordValidator.isValidPassword("weakpass1"), "Password without uppercase should return false");
        }

        @Test
        public void testNoDigit() {
            assertFalse(PasswordValidator.isValidPassword("NoDigitPass"), "Password without digit should return false");
        }

        @Test
        public void testNullPassword() {
            assertFalse(PasswordValidator.isValidPassword(null), "Null password should return false");
        }
    }


