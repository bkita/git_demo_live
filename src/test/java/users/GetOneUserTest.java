package users;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class GetOneUserTest extends BaseTest {

    @Test
    public void readOneUser() {
        given()
                .spec(reqSpec)
                .when()
                .get(BASE_URL + "/" + USERS + "/10")
                .then()
                .statusCode(200);
    }
}
