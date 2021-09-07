import org.junit.Assert;
import org.junit.Test;
public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue() {
        int actualResult = Maximum.max(10, 15, 12);
        Assert.assertEquals(15, actualResult);
    }
    @Test
    public void givenThreeFloats_FindMaximumNumber(){
        float actualValue = Maximum.getMaximumFloat(1000f,545f,746f);
        Assert.assertEquals(1000f,actualValue, 0);
    }
    @Test
    public void givenThreeStrings_FindMaximum(){
        String result=Maximum.getMaximumString("Apple","Peach","Banana");
        Assert.assertEquals("Peach",result);
    }

}
