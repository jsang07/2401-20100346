package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int input,max;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<Integer>();

        do {
            System.out.print("점수를 입력하세요 : ");
            input = in.nextInt();
            if(input>=0) score.add(input);
        } while(input>=0);

        System.out.println("전체 학생은 "+score.size()+"명이다.");
        System.out.print("학생들의 성적 : ");
        for (int s : score)
            System.out.print(s + " ");
        System.out.println();
        max=Collections.max(score);

        Test5 check = new Test5();

        for(int i=0;i<score.size();i++) {
            System.out.println(i+"번 학생의 성적은 "+score.get(i)+"점이며 등급은"+check.rating(score.get(i),max)+"이다.");
        }
    }

    public String rating(int score,int max) {
        if(score>=max-10)
            return "A";
        else if(score<max-10 && score>=max-20)
            return "B";
        else if(score<max-20 && score>=max-30)
            return "C";
        else if(score<max-30 && score>=max-40)
            return "D";
        else return "F";
    }

}
