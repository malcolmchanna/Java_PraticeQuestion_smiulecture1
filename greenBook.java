package com.company;

public class greenBook {

    private String CourseName;

    public greenBook( String name){
        CourseName =  name;
    }

    public void setCourseName(String name){
        CourseName =name;
    }

    public String getCourseName(){
        return CourseName;
    }

    public void displayMessage(){
        System.out.println("myGreenBook is course name" +   getCourseName());

    }
}
