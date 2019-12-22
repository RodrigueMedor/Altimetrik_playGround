package com.explorecountry.explorecountry;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.service.ExploreSchoolService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExploreSchoolJUnitApplicationTests {

    @Autowired
    private ExploreSchoolService exploreSchoolService;
    @Test
    public void checkSchool() throws Exception{
        CollegeSeach school = new CollegeSeach();
                school.setZipCode(52557);
                school.setNumberPage(100);
                school.setPredominant("2,3");
                school.setDistance("123");
                school.setYear(2017);
        List<CollegeSeach> actual = exploreSchoolService.getSchoolsDetais(school);
        int size = actual.size();
        System.out.println(size);
        assert(size == 57);
    }
}
