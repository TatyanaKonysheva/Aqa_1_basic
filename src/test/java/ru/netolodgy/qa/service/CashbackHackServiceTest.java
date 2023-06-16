package ru.netolodgy.qa.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBoundaryWhenAmountLessThousand() {

        final CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(800), 200);
    }

    @Test
    public void shouldBoundaryWhenAmountAssertThousand() {

        final CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }
    @Test
    public void shouldBoundaryWhenAmountOverThousand() {

        final CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }

}