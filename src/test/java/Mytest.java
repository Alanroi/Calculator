import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        int res = Main.add(5,5);
        Assert.assertEquals(res,10);
    }
}

