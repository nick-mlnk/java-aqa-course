package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;

import static io.restassured.RestAssured.given;

public class RestApiUtils {

    private RequestSpecification requestSpec;

    public RestApiUtils(final String domainUrl) {
        requestSpec = given()
                .baseUri(domainUrl)
                .header(HttpHeaders.CONTENT_TYPE, ContentType.JSON)
                .log().everything();
    }

    public Response post(final String payload, final String endpoint, final String token) {
        return given(requestSpec)
                .auth().oauth2(token)
                .body(payload)
                .post(endpoint);
    }
}
