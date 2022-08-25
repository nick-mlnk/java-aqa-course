package data.controllers;

import data.models.UserData;
import io.restassured.response.Response;
import utils.RestApiUtils;

public class GoRestApiController {

    private static final String DOMAIN_URL = "https://gorest.co.in";
    private static final String API_VERSION = "/public/v2";

    private static final String USERS_ENDPOINT = API_VERSION.concat("/users");

    private static RestApiUtils restApiUtils = new RestApiUtils(DOMAIN_URL);
    private static String TOKEN = System.getenv("TOKEN");

    public static Response createUser(UserData user) {
        return restApiUtils.post(user.toJson(), USERS_ENDPOINT, TOKEN);
    }
}
