package com.explorecountry.explorecountry.controller;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.domain.Response;
import com.explorecountry.explorecountry.domain.School;
import com.explorecountry.explorecountry.service.ExploreSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8085")
//@CrossOrigin(origins = {"http://localhost:8085"}, maxAge = 6000)
public class ExploreSchoolController {

    @Autowired
    private ExploreSchoolService exploreSchoolService;
//    @RequestParam int zipCode,
//    @RequestParam String distance,
//    @RequestParam int numberPage,
//    @RequestParam String predominant,
//    @RequestParam int year

    @PostMapping("/api/search")
    public ResponseEntity<List<CollegeSeach>> searchCollege(@RequestBody  CollegeSeach collegeSeach) {
        try {
            //new CollegeSeach(zipCode, distance, predominant,year, numberPage)

            return new ResponseEntity(exploreSchoolService.getSchoolsDetais(collegeSeach), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("The request returned no value", HttpStatus.BAD_REQUEST);
        }
    }



}
