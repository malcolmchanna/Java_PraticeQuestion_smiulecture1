package com.company;

public class RedBook {
    private String CourseName;


    public void setCourseName( String name){
        CourseName = name;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void displayMessage(){
        System.out.println("welcome to red Book " + getCourseName());
    }
}
