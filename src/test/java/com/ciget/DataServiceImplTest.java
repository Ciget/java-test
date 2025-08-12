package com.ciget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceImplTest {
    DataService service = new DataServiceImpl();
    static final String s = "test";

    @Test
    void ShouldGetTaxes() {
        assertEquals(2, service.getTaxes().size());

    }

    @Test
    void ShouldFail() {
        assertEquals(23, service.getTaxes().size());
    }
}
