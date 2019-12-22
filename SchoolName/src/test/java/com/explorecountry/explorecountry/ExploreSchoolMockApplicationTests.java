package com.explorecountry.explorecountry;

import com.explorecountry.explorecountry.domain.CollegeSeach;
import com.explorecountry.explorecountry.service.ExploreSchoolService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class ExploreSchoolMockApplicationTests {



	@Test
	public void test1() throws Exception {
		ExploreSchoolService exploreSchoolService  = mock(ExploreSchoolService.class);
		CollegeSeach school = new CollegeSeach();
		school.setZipCode(52557);
		school.setNumberPage(100);
		school.setPredominant("2,3");
		school.setDistance("123");
		school.setYear(2017);
		Integer count  =exploreSchoolService.getCountShoolDetails(school);
		when(count).thenReturn(57);
	}

}
