package com.myapp.theagrim.agrimaapp;

public class Student {
    private String name;
    private String registration;
    private String year;
    private String branch;
    private TimeTable timeTable;

    public Student(){

    }

    public Student(String name,String registration,String year, String branch) {
        this.name = name;
        this.registration = registration;
        this.year = year;
        this.branch = branch;

    }


        public String getName () {
            return name;
        }

        public String getBranch () {
            return branch;
        }

        public String getRegistration () {
            return registration;
        }

        public String getYear () {
            return year;
        }

        public TimeTable getTimeTable () {
            return timeTable;
        }
    }
