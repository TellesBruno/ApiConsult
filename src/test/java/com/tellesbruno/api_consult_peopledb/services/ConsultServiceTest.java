package com.tellesbruno.api_consult_peopledb.services;

import com.tellesbruno.api_consult_peopledb.models.PeopleModel;
import com.tellesbruno.api_consult_peopledb.services.stubs.ConsultServiceStub;
import lombok.AllArgsConstructor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("Service")
@RunWith(SpringJUnit4ClassRunner.class)
class ConsultServiceTest {

    @Autowired
    private ConsultService consultService;

    @Test
    void whemGetPeopleByID(){
        final int TESTID = 2;
        PeopleModel testPeople = new PeopleModel(2, "Joao", "12345678900");
        Mockito.when(consultService.getPeopleById(TESTID)).thenReturn(ConsultServiceStub.getPeopleModelRequest());
        Assert.assertEquals(ConsultServiceStub.getPeopleModelRequest(), testPeople);
    }
}
