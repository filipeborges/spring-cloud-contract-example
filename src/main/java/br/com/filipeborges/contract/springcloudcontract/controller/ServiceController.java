package br.com.filipeborges.contract.springcloudcontract.controller;

import br.com.filipeborges.contract.springcloudcontract.dto.RequestBodyDto;
import br.com.filipeborges.contract.springcloudcontract.dto.ResponseCreatedDto;
import br.com.filipeborges.contract.springcloudcontract.service.StubService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private StubService stubService;

    public ServiceController(StubService stubService) {
        this.stubService = stubService;
    }

    @PostMapping("/stub")
    public ResponseCreatedDto create(@RequestBody RequestBodyDto requestBody) {
        return stubService.create(requestBody);
    }

}
