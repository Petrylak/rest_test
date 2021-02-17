package com.game.snake_test.utils;

import com.game.snake_test.service.InsertToDataSql;

import java.io.FileNotFoundException;

public class GenerateDataSql {
    public static void main(String[] args) throws FileNotFoundException {
        //Automatycznie wypełnia wsad do bazy testowymi danymi
        final InsertToDataSql insertToDataSql;
        InsertToDataSql.saveToDataSql();
    }
}
