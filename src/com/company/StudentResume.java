package com.company;

/**
 * Created by narges nastran on 10/24/2019.
 */
public class StudentResume {
        private String firstName;
        private String lastName;
        private String ID;
        private String age;
        private String major;
        private String academicOrientation;

        @Override
        public String toString()
        {
            return "StudentResume{"+"your firstName="+firstName  +  "your lastName="+lastName  +  "your age="+age  +  "your ID="+ID  +  "your major"+major+"your academic orientation="+academicOrientation+'}';

        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAcademicOrientation() {
        return academicOrientation;
    }

    public void setAcademicOrientation(String academicOrientation) {
        this.academicOrientation = academicOrientation;
    }
}
