package examples;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.String.format;

public class UserWithPreconditionsTest {

    User user1, user2;

    @BeforeClass
    public void setup() {
        user1 = new User("Nick");
        user2 = new User("Nick");
    }

    @BeforeMethod(enabled = true)
    public void changeUserCompany() {
        user2.setCompany(user1.getCompany());
    }

    @Test
    public void testUsersAreEqual() {
        Assert.assertEquals(user1, user2, "Users should be equal");
    }

    @Test
    public void testUsersAreFromTheSameCompany() {
        Assert.assertEquals(user1.getCompany(), user2.getCompany(),
                format("\n%s \nAND \n%s\nshould have the same companies", user1, user2));
    }


}
