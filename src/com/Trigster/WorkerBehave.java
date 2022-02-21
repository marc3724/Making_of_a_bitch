package com.Trigster;

import java.util.Scanner;

public class WorkerBehave {
    // Dan make a class that tells a "worker" how to behave

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        behave();

    }

    public static void behave(){
        System.out.println("Don't be lazy, do your work and always be on time.");
        System.out.println("Did you understand me?" + "\n" + "y/n?");
        String answer = scn.nextLine();
        if(answer.equals("y")){
            System.out.println("Good, then I don't have to keep telling you.");
        }
        else{
            System.out.println("No? No!! Then I just have to tell you again!");
            behave();
        }
    }
}
