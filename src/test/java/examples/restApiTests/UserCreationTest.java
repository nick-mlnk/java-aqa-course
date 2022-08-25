package examples.restApiTests;

import com.github.javafaker.Faker;
import data.controllers.GoRestApiController;
import data.models.UserData;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserCreationTest {

    UserData user;

    @BeforeClass
    public void setup() {
        Faker faker = Faker.instance();
        user = UserData.builder()
                .name(faker.name().username())
                .email(faker.internet().emailAddress())
                .gender("male")
                .status("active")
                .build();
    }

    @Test
    public void testUserIsCreated() {
        GoRestApiController.createUser(user)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .body("id", Matchers.notNullValue());
    }

    @Test(dependsOnMethods = "testUserIsCreated")
    public void testUserIsNotCreated() {
        GoRestApiController.createUser(user)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_UNPROCESSABLE_ENTITY);
    }
}
