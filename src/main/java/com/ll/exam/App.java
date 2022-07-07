package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("==명언 SSG ==");
        Scanner sc = new Scanner(System.in);

        outer:
        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록":
                    System.out.print("명언) ");
                    String saying = sc.nextLine();
                    System.out.print("작가) ");
                    String writer = sc.nextLine();
                    System.out.println("1번글이 등록되었습니다.");

                    break;
                case "종료":
                    break outer;
            }
        }
        sc.close();
    }
}
