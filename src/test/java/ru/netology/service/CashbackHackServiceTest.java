package ru.netology.service;

//import junit.framework.TestCase;

public class CashbackHackServiceTest {

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

}