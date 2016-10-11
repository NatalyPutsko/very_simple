package nmnvmnmc;

import org.junit.Assert;
import org.junit.Test;

public class TachkaTest {
    @Test
    public void tachkaCreationTest(){
        Tachka tachka = new Tachka();

        Assert.assertEquals("Lanos", tachka.getModel());
        Assert.assertEquals("ZAZ", tachka.getBrand());
        Assert.assertEquals(1.7d, tachka.getVolume(), 0.2d);
    }
}
