package hu.vtg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTetra {
    @Test
    public void testCalcVolume_350(){
        Tetra tetra = new Tetra();
        double actual = tetra.calcVolume(30,35);
        double expected = 350.0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcVolume_3977(){
        Tetra tetra = new Tetra();
        double actual = tetra.calcVolume(123,97);
        double expected = 3977.0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcVolume_0_333(){
        Tetra tetra = new Tetra();
        double actual = tetra.calcVolume(1,1);
        double expected = 0.3333333333333333;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcVolume_0(){
        Tetra tetra = new Tetra();
        double actual = tetra.calcVolume(0,0);
        double expected = 0.0;
        Assert.assertEquals(actual, expected);
    }
}
