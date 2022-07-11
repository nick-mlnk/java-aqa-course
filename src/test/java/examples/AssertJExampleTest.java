package examples;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertJExampleTest {

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
    public void testUsersAreEqualAndHaveNoNullFields(User user) {
        Assertions.assertThat(this.user)
                .as("Users equality & absence of null fields")
                .hasNoNullFieldsOrProperties()
                .isEqualTo(user);
    }


}
