package com.pamela.contabanco.model;

import com.pamela.contabanco.annotation.CPForCNPJ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientRequest {

    private String name;
    private Integer age;
    private Double salary;
    @CPForCNPJ
    private String document;
}
