package com.explorecountry.explorecountry.domain;

import java.util.Comparator;

public class CompareStudentSize implements Comparator<CollegeSeach> {


    @Override
    public int compare(CollegeSeach o1, CollegeSeach o2) {
        return o1.getStudentSize() - o2.getStudentSize();
    }
}
