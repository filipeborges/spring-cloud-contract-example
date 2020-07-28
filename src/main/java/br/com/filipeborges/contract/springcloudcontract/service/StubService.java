package br.com.filipeborges.contract.springcloudcontract.service;

import br.com.filipeborges.contract.springcloudcontract.dto.RequestBodyDto;
import br.com.filipeborges.contract.springcloudcontract.dto.ResponseCreatedDto;
import org.springframework.stereotype.Service;

@Service
public class StubService {

    public ResponseCreatedDto create(RequestBodyDto requestBodyDto) {
        System.out.println("======= CREATING RESPONSE BY SERVICE IMPLEMENTATION ==============");
        ResponseCreatedDto responseCreatedDto = new ResponseCreatedDto();
        responseCreatedDto.setStatus("CREATED");
        return responseCreatedDto;
    }

}
