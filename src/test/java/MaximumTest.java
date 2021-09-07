import org.junit.Assert;
import org.junit.Test;
public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue() {
        int actualResult = Maximum.max(10, 15, 12);
        Assert.assertEquals(15, actualResult);
    }
}
