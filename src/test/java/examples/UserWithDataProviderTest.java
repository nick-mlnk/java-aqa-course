package examples;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.String.format;

public class UserWithDataProviderTest {

    User user;

    @BeforeClass
    public void setup() {
        user = new User("Nick");
    }

    @DataProvider
    public static Object[][] userDataProvider() {
        return new Object[][]{
                {new User("Nick")},
                {new User("Nick")},
                {new User("Cris")},
                {new User("Ben")},
                {new User("Nick")}
        };
    }

    @Test(dataProvider = "userDataProvider")
    public void testUsersAreEqual(User user) {
        Assert.assertEquals(this.user, user, "Users should be equal");
    }

    @Test(dataProvider = "userDataProvider")
    public void testUsersAreFromTheSameCompany(User user) {
        Assert.assertEquals(this.user.getCompany(), user.getCompany(),
                format("\n%s \nAND \n%s\nshould have the same companies", this.user, user));
    }
}
