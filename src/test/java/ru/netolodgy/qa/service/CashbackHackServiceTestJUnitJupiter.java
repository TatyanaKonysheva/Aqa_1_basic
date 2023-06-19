package ru.netolodgy.qa.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTestJUnitJupiter {

    @Test
    public void shouldCahbackWhenAmountLessThousand() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(200, service.remain(800));
    }

    @Test
    public void shouldCahbackWhenAmountOverThousand() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(200, service.remain(1800));
    }

    @Test
    public void shouldCahbackWhenAmountEqualThousand() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(0, service.remain(1000));
    }
}
