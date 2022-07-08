package com.ll.exam;



import java.util.Scanner;

public class App {
    String json;

    public void run(){
        System.out.println("==명언 SSG ==");
        Scanner sc = new Scanner(System.in);
        int num=0;
        outer:
        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록":
                    System.out.print("명언) ");
                    String content = sc.nextLine();
                    System.out.print("작가) ");
                    String author = sc.nextLine();
                    int id = ++num;

                    WiseSaying wiseSaying = new WiseSaying(id, content,author);
                    System.out.println(wiseSaying);
                    System.out.println(id+"번글이 등록되었습니다.");
                    break;
                case "종료":
                    break outer;
            }
        }
    }
}
