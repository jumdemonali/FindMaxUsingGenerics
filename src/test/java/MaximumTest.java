import org.junit.Assert;
import org.junit.Test;
 public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int actualResult = Maximum.checkMaximum(15, 10, 12);
        Assert.assertEquals(15, actualResult);
    }
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int actualResult = Maximum.checkMaximum(10, 15, 12);
        Assert.assertEquals(15, actualResult);
    }
     @Test
     public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
         int actualResult = Maximum.checkMaximum(10, 12, 15);
         Assert.assertEquals(15, actualResult);
     }
    @Test
    public void givenThreeFloats_FindMaximumNumberTestCase1(){
        float actualValue = Maximum.checkMaximum(900f,600f,700f);
        Assert.assertEquals(900f,actualValue, 0);
    }
     @Test
     public void givenThreeFloats_FindMaximumNumberTestCase2(){
         float actualValue = Maximum.checkMaximum(600f,900f,700f);
         Assert.assertEquals(900f,actualValue, 0);
     }
     @Test
     public void givenThreeFloats_FindMaximumNumberTestCase3(){
         float actualValue = Maximum.checkMaximum(600f,700f,900f);
         Assert.assertEquals(900f,actualValue, 0);
     }
    @Test
    public void givenThreeStrings_FindMaximumTestCase1(){
        String result=Maximum.checkMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",result);
    }
     @Test
     public void givenThreeStrings_FindMaximumTestCase2(){
         String result=Maximum.checkMaximum("Apple","Peach","Banana");
         Assert.assertEquals("Peach",result);
     }
     @Test
     public void givenThreeStrings_FindMaximumTestCase3(){
         String result=Maximum.checkMaximum("Apple","Banana","Peach");
         Assert.assertEquals("Peach",result);
     }
     @Test
     public void givenThreeInteger_FindMaximumUsingClass(){
         Maximum getmax =new Maximum(1,2,3);
         int max=(int)(getmax.checkMaximum());
         Assert.assertEquals(3,max);
     }

     @Test
     public void givenThreeFloat_FindMaximumUsingClass(){
         Maximum getmax =new Maximum(5.1f,5.5f,1.5f);
         float max=(float)(getmax.checkMaximum());
         Assert.assertEquals(5.5f,max,0.0f);
     }

     @Test
     public void givenThreeString_FindMaximumUsingClass() {
         Maximum getmax =new Maximum("Apple","Peaches","Banana");
         String max=(String)(getmax.checkMaximum());
         Assert.assertEquals("Peaches",max);
     }
 }