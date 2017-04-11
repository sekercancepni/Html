package tr.sisa;

import org.junit.Test;
import tr.sisa.page.TestBean;

import static org.junit.Assert.*;

public class TestBeanTest {

    TestBean testBean = new TestBean();

    @Test
    public void getCarNameTest(){
        String result = testBean.getCarName();
        assertEquals(testBean.getInputName(),result);
    }

    @Test
    public void setCarNameTest(){
        testBean.setCarName("fiat");
        String result = testBean.getCarName();
        assertEquals("fiat",result);
    }

    @Test
    public void getCarModelYılıTest(){
        int result = testBean.getCarModel();
        assertEquals(testBean.getInputModel(),result);
    }

    @Test
    public void setCarModelYılıTest(){
        testBean.setCarModel(1992);
        int result = testBean.getCarModel();
        assertEquals(1992,result);
    }

    @Test
    public void getCarColorTest(){
        String result = testBean.getCarColor();
        assertEquals(testBean.getInputColor(),result);
    }

    @Test
    public void setCarColorTest(){
        testBean.setCarColor("blue");
        String result = testBean.getCarColor();
        assertEquals("blue",result);
    }

    @Test
    public void getCarWeightTest(){
        int result = testBean.getCarWeight();
        assertEquals(testBean.getInputWeight(),result);
    }

    @Test
    public void setCarWeightTest(){
        testBean.setCarWeight(1999);
        int result = testBean.getCarWeight();
        assertEquals(1999,result);
    }

    @Test
    public void getCarPriceTest(){
        int result = testBean.getCarPrice();
        assertEquals(testBean.getInputPrice(),result);
    }

    @Test
    public void setCarPriceTest(){
        testBean.setCarPrice(20000);
        int result = testBean.getCarPrice();
        assertEquals(20000,result);
    }

    @Test
    public void getCarIndexTest(){
        int result = testBean.getCarIndex();
        assertEquals(testBean.getInputIndex(),result);
    }

    @Test
    public void setCarIndexTest(){
        testBean.setCarIndex(2);
        int result = testBean.getCarIndex();
        assertEquals(2,result);
    }

    @Test
    public void getCarInputNameTest(){
        String result = testBean.getInputName();
        assertEquals(testBean.getInputName(),result);
    }

    @Test
    public void getCarInputModelYılıTest(){
        int result = testBean.getInputModel();
        assertEquals(testBean.getInputModel(),result);
    }

    @Test
    public void getCarInputColorTest(){
        String result = testBean.getInputColor();
        assertEquals(testBean.getInputColor(),result);
    }

    @Test
    public void getCarInputWeightTest(){
        int result = testBean.getInputWeight();
        assertEquals(testBean.getInputWeight(),result);
    }

    @Test
    public void getCarInputPriceTest(){
        int result = testBean.getInputPrice();
        assertEquals(testBean.getInputPrice(),result);
    }

    @Test
    public void getCarInputIndexTest(){
        int result = testBean.getInputIndex();
        assertEquals(testBean.getInputIndex(),result);
    }
}
