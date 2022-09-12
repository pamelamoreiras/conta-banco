package com.pamela.contabanco.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse {

    private String name;
    private String accountType;
    private Integer agencyNumber;
    private Integer accountNumber;
}
