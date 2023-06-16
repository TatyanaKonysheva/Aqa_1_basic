package ru.netolodgy.qa.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnit4 {

    @Test
    public void shouldCahbackWhenAmountLessThousand() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(200, service.remain(800));
    }

    @Test
    public void shouldCahbackWhenAmountEqualsThousand() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(0, service.remain(1000));
    }
}
