package org.example.model;

import java.util.Objects;

public class BiologyStudent extends Student implements Citizen{

    private String anatomyCourse;

    public BiologyStudent(){

    }
    public BiologyStudent(String fname, String lname, int id, String anatomyCourse) {
        super(fname, lname, id);
        this.anatomyCourse = anatomyCourse;
    }

    public String getAnatomyCourse() {
        return anatomyCourse;
    }

    public void setAnatomyCourse(String anatomyCourse) {
        this.anatomyCourse = anatomyCourse;
    }

    /*@Override
    public String toString() {
        return "BiologyStudent{" +
                "anatomyCourse='" + anatomyCourse + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BiologyStudent that = (BiologyStudent) o;
        return Objects.equals(anatomyCourse, that.anatomyCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), anatomyCourse);
    }

    @Override
    public String getAdress() {
        return "Adresse";
    }


    @Override
    public int identityCardNumber() {
        return 123;
    }



}
