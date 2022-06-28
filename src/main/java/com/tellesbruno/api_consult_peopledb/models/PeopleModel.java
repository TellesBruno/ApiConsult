package com.tellesbruno.api_consult_peopledb.models;

import lombok.*;

@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PeopleModel {
    private int id;
    private String nome;
    private String cpf;
}
