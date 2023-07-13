package org.example.model;

import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen {

    private String javaCourse;
    public ComputerScienceStudent() {
    }

      public ComputerScienceStudent(String fname, String lname, int id, String javaCourse) {
        super(fname, lname, id);
        this.javaCourse = javaCourse;
    }

    public String getJavaCourse() {
        return javaCourse;
    }

    public void setJavaCourse(String javaCourse) {
        this.javaCourse = javaCourse;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "javaCourse='" + javaCourse + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(javaCourse, that.javaCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), javaCourse);
    }

    @Override
    public String getAdress() {
        return "Adresse";
    }

    @Override
    public int identityCardNumber() {
        return 124;
    }
}
