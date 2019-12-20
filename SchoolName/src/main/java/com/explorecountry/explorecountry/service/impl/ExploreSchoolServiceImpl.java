package com.explorecountry.explorecountry.service.impl;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.domain.School;
import com.explorecountry.explorecountry.service.ExploreSchoolService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ExploreSchoolServiceImpl implements ExploreSchoolService {

        @Autowired
        private  RestTemplate restTemplate;

    @Override
    public List<CollegeSeach> getSchoolsDetais(CollegeSeach collegeSeach) throws  Exception{

         String URL = "https://api.data.gov/ed/collegescorecard/v1/schools.json?school.degrees_awarded.predominant="
                + collegeSeach.getPredominant() + "&fields=id,school.name,2017.student.size&per_page="
                + collegeSeach.getNumberPage()+ "&zip=" + collegeSeach.getZipCode()+ "&distance="
                + collegeSeach.getDistance() + "&api_key=tZAYe0gMs3L7lvcEy8Juhio5M6k7apCTo77gTjYE";
         if(URL == null || URL.trim().isEmpty())
             throw new Exception("400");




        ResponseEntity responseEntity = restTemplate.getForEntity(URL, Object.class);

        LinkedHashMap bodyResponse = (LinkedHashMap)responseEntity.getBody();

        List<List<CollegeSeach>> colleges = (List<List<CollegeSeach>>) bodyResponse.get("results");
        List col = colleges.stream().collect(Collectors.toList());

        return col;

   }







}
