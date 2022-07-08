package testNGexample;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.String.format;

public class UserTest {

    @Test
    public void testUsersAreEqual() {
        User user1 = new User("Nick");
        User user2 = new User("Nick");

        Assert.assertEquals(user1, user2);
        Assert.assertTrue(user1.equals(user2));
        Assert.assertEquals(user1, user2, "Users should be equal");
    }

    @Test
    public void testUsersAreNotEqual() {
        User user1 = new User("Nick");
        User user2 = new User("John");

        Assert.assertNotEquals(user1, user2);
    }

    @Test
    public void testUsersAreFromTheSameCompany() {
        User user1 = new User("Nick");
        User user2 = new User("John");

        Assert.assertEquals(user1.getCompany(), user2.getCompany(),
                format("\n%s \nAND \n%s\nshould have the same companies", user1, user2));
    }

}
