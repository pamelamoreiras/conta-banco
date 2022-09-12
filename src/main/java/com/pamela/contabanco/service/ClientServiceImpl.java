package com.pamela.contabanco.service;

import com.pamela.contabanco.model.ClientRequest;
import com.pamela.contabanco.model.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl {

    public ClientResponse verifyTypeOfAccount(final ClientRequest clientRequest){

        ClientResponse account = ClientResponse.builder().build();

        if (clientRequest.getDocument().length() == 11 ) {
            if (clientRequest.getSalary() >= 2800){
                account = ClientResponse.builder()
                        .name(clientRequest.getName())
                        .accountType("Conta Corrente")
                        .agencyNumber(10)
                        .accountNumber(4500)
                        .build();
            }

            if (clientRequest.getSalary() < 2800) {
                account = ClientResponse.builder()
                        .name(clientRequest.getName())
                        .accountType("Conta Poupança")
                        .agencyNumber(11)
                        .accountNumber(4600)
                        .build();
            }
        }
        if (clientRequest.getDocument().length() == 14) {
            if (clientRequest.getSalary() >= 3000) {
                account = ClientResponse.builder()
                        .name(clientRequest.getName())
                        .accountType("Conta Corrente")
                        .agencyNumber(22)
                        .accountNumber(5500)
                        .build();
            } else {
                account = ClientResponse.builder()
                        .name(clientRequest.getName())
                        .accountType("Conta Corrente")
                        .agencyNumber(10)
                        .accountNumber(4500)
                        .build();
            }
        }

        return account;
    }
}
