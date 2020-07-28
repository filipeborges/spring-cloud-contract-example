package br.com.filipeborges.contract.springcloudcontract;

import br.com.filipeborges.contract.springcloudcontract.controller.ServiceController;
import br.com.filipeborges.contract.springcloudcontract.dto.RequestBodyDto;
import br.com.filipeborges.contract.springcloudcontract.dto.ResponseCreatedDto;
import br.com.filipeborges.contract.springcloudcontract.service.StubService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class BaseContractTest {

    private StubService stubServiceMock;

    @BeforeEach
    public void setup() {
        ResponseCreatedDto responseCreatedDto = new ResponseCreatedDto();
        responseCreatedDto.setStatus("CREATED");

        stubServiceMock = Mockito.mock(StubService.class);

        Mockito.when(
                stubServiceMock.create(ArgumentMatchers.any(RequestBodyDto.class))
        ).thenReturn(responseCreatedDto);

        RestAssuredMockMvc.standaloneSetup(new ServiceController(stubServiceMock));
    }
}
