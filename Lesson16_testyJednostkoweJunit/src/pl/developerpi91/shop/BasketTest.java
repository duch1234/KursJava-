package pl.developerpi91.shop;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BasketTest {

    Basket b = new Basket();
    Item jabko;
    Item bulka;

    @org.junit.Before
    public void setUp() throws Exception {
        jabko = new Item("jabko", 0.1);
        bulka = new Item("bulka", 0.1);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldBePositive(){
    b.addItem(jabko,2);
    assertTrue(b.getOrderValue()>0);
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldNoSuchElement(){
        b.removeItem(bulka,1);
    }

}