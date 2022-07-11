package com.ll.exam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class AppTest {
    public void run(){}

    @Test
    public void 테스트_실험(){
        int rs= 30;
        assertEquals(30,rs);
    }
    @Test
    public void 테스트_스캐너(){
        String input= """
                등록
                명언1
                작가1
                """.stripIndent();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc = new Scanner(in);

        String cmd = sc.nextLine().trim();
        String content  = sc.nextLine().trim();
        String author = sc.nextLine().trim();

        assertEquals("등록",cmd);
        assertEquals("명언1",content);
        assertEquals("작가1",author);
    }

}

