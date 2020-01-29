package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        List<StudentResume>resumeList=new ArrayList<StudentResume>();

        while(true)
        {
            System.out.println("please enter the following case:\n1)creat resume\n2)show info");

            int menu=input.nextInt();

            switch(menu){
                case 1:resumeList.add(Creat());
                    break;

                case 2:for(StudentResume S:resumeList) {
                    System.out.println(S.toString());

                    System.out.println("\n\n");
                }
                    break;
                default:
                    System.out.println("the following number does not exist");
            }
        }
    }
    static StudentResume Creat()
    {
        Scanner input=new Scanner(System.in);
        StudentResume S=new StudentResume();

        System.out.println("enter your first name:");
        S.setFirstName(input.next());
        System.out.println("enter your last name:");
        S.setLastName(input.next());
        System.out.println("enter your ID");
        S.setID(input.next());
        System.out.println("enter your age:");
        S.setAge(input.next());
        System.out.println("enter your major:");
        S.setMajor(input.next());
        System.out.println("enter your academicOrientation:");
        S.setAcademicOrientation(input.next());


        return S;
    }
}

