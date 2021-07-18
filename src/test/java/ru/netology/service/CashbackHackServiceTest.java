package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    // JUnit4

    @org.junit.Test
    public void shouldReturn100IfUsed900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn200IfUsed1800() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;
            org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfUsed0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfUsed1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    // JUnit5

    @Test
    void shouldReturn500IfUsed500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfUsed2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}