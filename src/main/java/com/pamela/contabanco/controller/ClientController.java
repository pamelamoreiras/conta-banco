package com.pamela.contabanco.controller;

import com.pamela.contabanco.model.ClientRequest;
import com.pamela.contabanco.model.ClientResponse;
import com.pamela.contabanco.service.ClientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/account")
public class ClientController {

    private final ClientServiceImpl clientService;

    @GetMapping
    public ClientResponse accountAvailability(@RequestBody @Valid final ClientRequest clientRequest) {
        return clientService.execute(clientRequest);
    }
}