package com.explorecountry.explorecountry.service;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.domain.School;

import java.util.List;

public interface ExploreSchoolService {

    List<CollegeSeach> getSchoolsDetais(CollegeSeach zipCode) throws  Exception;

    Integer getCountShoolDetails(CollegeSeach collegeSeach) throws Exception;


}
