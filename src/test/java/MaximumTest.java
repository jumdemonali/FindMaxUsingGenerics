import org.junit.Assert;
import org.junit.Test;
 public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        Integer[] inputarray={15,18,19,16,25};
        int actualResult = Maximum.checkMaximum(inputarray);
        Maximum.printarray(inputarray,actualResult);
        Assert.assertEquals(25, actualResult);
    }
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        Integer[] inputarray={10, 15, 12,9};
        int actualResult = Maximum.checkMaximum(inputarray);
        Maximum.printarray(inputarray,actualResult);
        Assert.assertEquals(15, actualResult);
    }
     @Test
     public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
         Integer[] inputarray={15, 10, 12, 15};
         int actualResult = Maximum.checkMaximum(inputarray);
         Maximum.printarray(inputarray,actualResult);
         Assert.assertEquals(15, actualResult);
     }
    @Test
    public void givenThreeFloats_FindMaximumNumberTestCase1(){
        Float[] inputarray={8.3f, 900f,600f,700f};
        float actualValue = Maximum.checkMaximum(inputarray);
        Maximum.printarray(inputarray,actualValue);
        Assert.assertEquals(900f,actualValue, 0);
    }
     @Test
     public void givenThreeFloats_FindMaximumNumberTestCase2(){
         Float[] inputarray={600f,900f,700f,800f};
         float actualValue = Maximum.checkMaximum(inputarray);
         Maximum.printarray(inputarray,actualValue);
         Assert.assertEquals(900f,actualValue, 0);
     }
     @Test
     public void givenThreeFloats_FindMaximumNumberTestCase3(){
         Float[] inputarray={600f,700f,900f,150f};
         float actualValue = Maximum.checkMaximum(inputarray);
         Maximum.printarray(inputarray,actualValue);
         Assert.assertEquals(900f,actualValue, 0);
     }
    @Test
    public void givenThreeStrings_FindMaximumTestCase1(){
        String[] inputarray={"Peach","Apple","Banana"};
        String result=Maximum.checkMaximum(inputarray);
        Maximum.printarray(inputarray,result);
        Assert.assertEquals("Peach",result);
    }
     @Test
     public void givenThreeStrings_FindMaximumTestCase2(){
         String[] inputarray={"Apple","Peach","Banana"};
         String result=Maximum.checkMaximum(inputarray);
         Maximum.printarray(inputarray,result);
         Assert.assertEquals("Peach",result);
     }
     @Test
     public void givenThreeStrings_FindMaximumTestCase3(){
         String[] inputarray={"Apple","Peach","Banana"};
         String result=Maximum.checkMaximum(inputarray);
         Maximum.printarray(inputarray,result);
         Assert.assertEquals("Peach",result);
     }
     @Test
     public void givenThreeInteger_FindMaximumUsingClass(){
         Integer[] inputarray={15, 10, 12,25};
         Maximum getmax =new Maximum(inputarray);
         int max=(int)(getmax.checkMaximum());
         Maximum.printarray(inputarray,max);
         Assert.assertEquals(25,max);
     }

     @Test
     public void givenThreeFloat_FindMaximumUsingClass(){
         Float[] inputarray={600f,700f,900f,150f};
         Maximum getmax =new Maximum(inputarray);
         float max=(float)(getmax.checkMaximum());
         Maximum.printarray(inputarray,max);
         Assert.assertEquals(900f,max,0.0f);
     }

     @Test
     public void givenThreeString_FindMaximumUsingClass() {
         String[] inputarray={"Peach","Apple","Banana"};
         Maximum getmax =new Maximum(inputarray);
         String max=(String)(getmax.checkMaximum());
         Maximum.printarray(inputarray,max);
         Assert.assertEquals("Peach",max);
     }
 }