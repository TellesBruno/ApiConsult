package com.tellesbruno.api_consult_peopledb.controllers;

import com.tellesbruno.api_consult_peopledb.models.PeopleModel;
import com.tellesbruno.api_consult_peopledb.services.ConsultService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/consult")
public class ConsultController {

    ConsultService consultService;

    @GetMapping("/name/{name}")
    public List<PeopleModel> getPeopleByName(@PathVariable("name") String name) {
        return consultService.getPeopleByName(name);
    }

    @GetMapping("/id/{id}")
    public PeopleModel getPeopleById(@PathVariable("id") int id) {
        return consultService.getPeopleById(id);
    }

    @GetMapping("/cpf/{cpf}")
    public PeopleModel getPeopleByCpf(@PathVariable("cpf") String cpf) {
        return consultService.getPeopleByCpf(cpf);
    }



}
