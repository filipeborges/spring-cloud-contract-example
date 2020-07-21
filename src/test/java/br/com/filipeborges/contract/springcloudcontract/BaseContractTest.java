package br.com.filipeborges.contract.springcloudcontract;

import br.com.filipeborges.contract.springcloudcontract.controller.ServiceController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseContractTest {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ServiceController());
    }
}
