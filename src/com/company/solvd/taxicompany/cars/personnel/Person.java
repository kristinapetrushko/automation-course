package com.company.solvd.taxicompany.cars.personnel;

 public abstract class Person {
    private String FIO;
    private int age;
    private String education;

    public Person (String FIO, int age, String education) {
        this.FIO = FIO;
        this.age = age;
        this.education = education;
    }

    public String getFIO () {
        return FIO;
    }

    public void setFIO (String FIO) {
        this.FIO = FIO;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getEducation () {
        return education;
    }

    public void setEducation (String education) {
        this.education = education;
    }
}
