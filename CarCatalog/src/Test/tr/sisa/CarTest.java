package tr.sisa;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    Car a = new Car("Opel",1993,"red",1500,20000);

    @Test
    public void getNameTest() {
        String result = a.getName();
        assertEquals("Opel",result);
    }

    @Test
    public void setNameTest(){
        a.setName("Fiat");
        String result = a.getName();
        assertEquals("Fiat",result);
    }

    @Test
    public void getModelTest() {
        int result = a.getModel();
        assertEquals(1993,result);
    }

    @Test
    public void setModelTest(){
        a.setModel(1900);
        int result = a.getModel();
        assertEquals(1900,result);
    }

    @Test
    public void getColorTest() {
        String result = a.getColor();
        assertEquals("red",result);
    }

    @Test
    public void setColorTest(){
        a.setColor("blue");
        String result = a.getColor();
        assertEquals("blue",result);
    }

    @Test
    public void getWeightTest() {
        int result = a.getWeight();
        assertEquals(1500,result);
    }

    @Test
    public void setWeightTest(){
        a.setWeight(1203);
        int result = a.getWeight();
        assertEquals(1203,result);
    }

    @Test
    public void getPriceTest() {
        int result = a.getPrice();
        assertEquals(20000,result);
    }

    @Test
    public void setPriceTest(){
        a.setPrice(30000);
        int result = a.getPrice();
        assertEquals(30000,result);
    }
}