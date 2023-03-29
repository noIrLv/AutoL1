package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldReturn1000IfAmount0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmount100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
}
