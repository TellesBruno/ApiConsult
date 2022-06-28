package com.tellesbruno.api_consult_peopledb.services.stubs;

import com.tellesbruno.api_consult_peopledb.models.PeopleModel;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsultServiceStub {
    public static PeopleModel getPeopleModelRequest() {
        return PeopleModel.builder()
                .id(2)
                .nome("Joao")
                .cpf("12345678900")
                .build();
    }
}
