package com.ifood;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class PratoResourceTest {

    @Test
    public void testHelloEndpoint() {

        //Aqui dará erro se não utilizar testContainers

        String body = given()
                .when().get("/pratos")
                .then()
                .statusCode(200).extract().asString();
        System.out.println(body);
    }

}