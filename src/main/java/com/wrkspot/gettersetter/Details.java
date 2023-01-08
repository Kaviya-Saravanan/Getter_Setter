package com.wrkspot.gettersetter;

 class Details  {
    private String Name;
    private int Age;
    private double Average;
    private char Grade;



    public void setAge(int age) {
       this.Age = age;
    }
    public int getAge() {
        return Age;
    }

    public void setAverage(double average) {
        this.Average = average;
    }

    public double getAverage() {
        return Average;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setGrade(char grade) {
        this.Grade = grade;
    }

    public char getGrade() {
        return Grade;
    }
}
