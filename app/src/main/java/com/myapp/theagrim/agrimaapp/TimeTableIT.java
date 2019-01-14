package com.myapp.theagrim.agrimaapp;

public class TimeTableIT extends TimeTable {
    String[] Mon={"IT Management 9am-10am","Java Lab 10am-1pm"};
    String[] Tue={"Java Lecture 8am-10am","FOLT 10am-12noon","Data Structures 2pm-4pm","Electronics 4pm-5pm"};
    String[] Wed={"IT Management 9am-10am","FOLT 10am-11am","IT Management 11am-12noon","Java Lecture 12noon-1pm","DataStructures 3pm-5pm"};
    String[] Thurs={"FOLT 9am-10am","Electronics 10am-12noon","DSLab 2pm-5pm(IT-1)","DSLab 2pm-5pm(IT-2"};
    String[] Fri={"Electronics 9am-10am","Electronics 10am-12noon","DSLab 2pm-5pm(IT-1)","DSLab 2pm-5pm(IT-2"};
    String[] Sat={"No calsses have fun"};
    String[] Sun={"No classes have fun"};

    public String[] getMon() {
        return Mon;
    }

    public String[] getTue() {
        return Tue;
    }

    public String[] getWed() {
        return Wed;
    }

    public String[] getThurs() {
        return Thurs;
    }

    public String[] getFri() {
        return Fri;
    }

    public String[] getSat() {
        return Sat;
    }

    public String[] getSun() {
        return Sun;
    }
}

