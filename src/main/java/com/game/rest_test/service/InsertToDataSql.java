package com.game.rest_test.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class InsertToDataSql {

    public static void saveToDataSql() throws FileNotFoundException {
        PrintWriter save = new PrintWriter("src/main/resources/data.sql");
        save.write("");
        generateTestDataPostTable(save);
        generateTestDataCommentTable(save);
        save.close();
    }
    private static void generateTestDataPostTable(PrintWriter printWriter){
        for (int i = 1; i <= 100; i++){
            printWriter.append("insert into post(id, title, content, created) " + "values (")
                    .append(String.valueOf(i))
                    .append(", 'Test post ")
                    .append(String.valueOf(i))
                    .append("', 'Content ")
                    .append(String.valueOf(i))
                    .append("', '")
                    .append(String.valueOf(LocalDateTime.now().minusDays(100 - i)))
                    .append("');\n");
        }
    }
    private static void generateTestDataCommentTable(PrintWriter printWriter){
        for (int i = 1; i <= 100; i++){
            int postId = 1 + i / 10;
            printWriter.append("insert into comment(id, post_id, content, created) " + "values (")
                    .append(String.valueOf(i))
                    .append(", ")
                    .append(String.valueOf(postId))
                    .append(", 'Content ")
                    .append(String.valueOf(i))
                    .append("', '")
                    .append(String.valueOf(LocalDateTime.now().minusDays(100 - i)))
                    .append("');\n");
        }
    }



}
