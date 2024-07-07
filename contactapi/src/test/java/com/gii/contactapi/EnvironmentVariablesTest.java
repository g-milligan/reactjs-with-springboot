package com.gii.contactapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EnvironmentVariablesTest {
    @Test
    void doesNotHaveEnvironmentVariable() {
        String actual = System.getenv("thisVariableShouldNotExist");
        assertEquals(null, actual);
    }
    @Test
    void hasDBUrlEnv() {
        String actual = System.getenv("DB_POSTGRESQL_URL");
        assertNotEquals(null, actual);
        assertTrue(actual.length() > 0);
    }
    @Test
    void hasDBUserEnv() {
        String actual = System.getenv("DB_POSTGRESQL_USER");
        assertNotEquals(null, actual);
        assertTrue(actual.length() > 0);
    }
    @Test
    void hasDBPwdEnv() {
        String actual = System.getenv("DB_POSTGRESQL_PWD");
        assertNotEquals(null, actual);
        assertTrue(actual.length() > 0);
    }
}
