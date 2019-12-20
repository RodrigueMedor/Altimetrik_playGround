package com.explorecountry.explorecountry.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollegeSeach {
    private int zipCode;
    private int numberPage;
    private String predominant;
    private String distance;
    private int year;
    private int StudentSize;
    private School school;

//    public CollegeSeach(int zipCode, String distance, String predominant, int year, int numberPage) {
//        this.zipCode = zipCode;
//        this.distance=distance;
//        this.predominant =predominant;
//        this.year=year;
//        this.numberPage = numberPage;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeSeach)) return false;
        CollegeSeach that = (CollegeSeach) o;
        return StudentSize == that.StudentSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentSize);
    }
}
