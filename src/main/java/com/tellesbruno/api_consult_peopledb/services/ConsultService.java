package com.tellesbruno.api_consult_peopledb.services;

import com.tellesbruno.api_consult_peopledb.models.PeopleModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ConsultService {

    public static final Logger LOG = Logger.getLogger(ConsultService.class.getName());
    private static final String BASE_URI = "http://localhost:8080/persistence/people-db/";
    public List<PeopleModel> getPeopleByName(String name) {
        List<PeopleModel> filteredPeopleList = new ArrayList<>();
        var restTemplate = new RestTemplate();
        try {
            var people = restTemplate.getForObject(BASE_URI, PeopleModel[].class);
            for (PeopleModel peopleModel : people ) {
                if (peopleModel.getNome().contains(name)) {
                    filteredPeopleList.add(peopleModel);
                }
            }
            return filteredPeopleList;
        } catch (Exception e) {
            LOG.info("Erro ao buscar pessoas");
            return new ArrayList<>();
        }
    }

    public PeopleModel getPeopleById(int id) {
        var restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(BASE_URI + id, PeopleModel.class);
        } catch (Exception e) {
            LOG.info("Erro ao buscar pessoa");
            return null;
        }
    }

    public PeopleModel getPeopleByCpf(String cpf) {
        PeopleModel findedPeople = null;
        var restTemplate = new RestTemplate();
        try {
            PeopleModel[] people = restTemplate.getForObject(BASE_URI, PeopleModel[].class);
            for (PeopleModel peopleModel : people ) {
                if (peopleModel.getCpf().equals(cpf)) {
                    findedPeople = peopleModel;
                }
            }
            return findedPeople;
        } catch (Exception e) {
            LOG.info("Erro ao buscar pessoa");
            return null;
        }
    }
}
