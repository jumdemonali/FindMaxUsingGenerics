import org.junit.Assert;
import org.junit.Test;
 public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int actualResult = Maximum.max(15, 10, 12);
        Assert.assertEquals(15, actualResult);
    }
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int actualResult = Maximum.max(10, 15, 12);
        Assert.assertEquals(15, actualResult);
    }
     @Test
     public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
         int actualResult = Maximum.max(10, 12, 15);
         Assert.assertEquals(15, actualResult);
     }
    @Test
    public void givenThreeFloats_FindMaximumNumber1(){
        float actualValue = Maximum.max(900f,600f,700f);
        Assert.assertEquals(900f,actualValue, 0);
    }
     @Test
     public void givenThreeFloats_FindMaximumNumber2(){
         float actualValue = Maximum.max(600f,900f,700f);
         Assert.assertEquals(900f,actualValue, 0);
     }
     @Test
     public void givenThreeFloats_FindMaximumNumber3(){
         float actualValue = Maximum.max(600f,700f,900f);
         Assert.assertEquals(900f,actualValue, 0);
     }
    @Test
    public void givenThreeStrings_FindMaximum1(){
        String result=Maximum.max("Peach","Apple","Banana");
        Assert.assertEquals("Peach",result);
    }
     @Test
     public void givenThreeStrings_FindMaximum2(){
         String result=Maximum.max("Apple","Peach","Banana");
         Assert.assertEquals("Peach",result);
     }
     @Test
     public void givenThreeStrings_FindMaximum3(){
         String result=Maximum.max("Apple","Banana","Peach");
         Assert.assertEquals("Peach",result);
     }

}
