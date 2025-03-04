package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.mpp.domain.User;
import ro.mpp.domain.UserRole;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User(1, "test@example.com", "John", UserRole.CONTESTANT);
    }

    @Test
    void testGetters() {
        assertEquals(1, user.getId());
        assertEquals("test@example.com", user.getEmail());
        assertEquals("John", user.getName());
        assertEquals(UserRole.CONTESTANT, user.getRole());
        assertFalse(user.isBanned());
    }

    @Test
    void testSetEmail() {
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }

    @Test
    void testSetName() {
        user.setName("Jane");
        assertEquals("Jane", user.getName());
    }

    @Test
    void testSetRole() {
        user.setRole(UserRole.ADMIN);
        assertEquals(UserRole.ADMIN, user.getRole());
    }

    @Test
    void testSetBanned() {
        user.setBanned(true);
        assertTrue(user.isBanned());
    }
}

