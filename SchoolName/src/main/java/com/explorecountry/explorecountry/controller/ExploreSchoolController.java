package com.explorecountry.explorecountry.controller;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.domain.Response;
import com.explorecountry.explorecountry.domain.School;
import com.explorecountry.explorecountry.service.ExploreSchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8086", maxAge = 6000)
@Api(value="api", description = "Data service operations on Localization of Colleges", tags=("colleges"))
public class ExploreSchoolController {

    @Autowired
    private ExploreSchoolService exploreSchoolService;


    @PostMapping("/api/search")
    @ApiOperation(value="Get All Colleges", notes="Gets all Colleges in the system", nickname="getColleges")
    public ResponseEntity<List<CollegeSeach>> searchCollege(@RequestBody  CollegeSeach collegeSeach) {
        try {

            return new ResponseEntity(exploreSchoolService.getSchoolsDetais(collegeSeach), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("The request returned no value", HttpStatus.BAD_REQUEST);
        }
    }



}
