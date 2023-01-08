package com.wrkspot.gettersetter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetterSetterApplication {

    public static void main(String[] args) {
        Details details=new Details();
        details.setName("John");
        details.setAge(21);
        details.setAverage(23.22);
        details.setGrade('A');
        System.out.println("Name of the student:"+" "+ details.getName());
        System.out.println("Age of the student:"+" "+details.getAge());
        System.out.println("Average of the student:"+" "+details.getAverage());
        System.out.println("Grade of the student: "+" "+details.getGrade());

    }


}
