package com.game.rest_test.utils;

import com.game.rest_test.service.InsertToDataSql;

import java.io.FileNotFoundException;

public class GenerateDataSql {
    public static void main(String[] args) throws FileNotFoundException {
        //Automatycznie wypełnia wsad do bazy testowymi danymi
        final InsertToDataSql insertToDataSql;
        InsertToDataSql.saveToDataSql();
    }
}
