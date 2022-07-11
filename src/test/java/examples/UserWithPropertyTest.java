package examples;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserWithPropertyTest {

    User user1, user2;

    @BeforeClass
    public void setup() {
        String username = System.getProperty("user");
        user1 = new User(username);
        user2 = new User("Nick");
    }

    @Test
    public void testUsersAreEqual() {
        Assert.assertEquals(user1, user2, "Users should be equal");
    }
}
