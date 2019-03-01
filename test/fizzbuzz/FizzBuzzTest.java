
package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 *
 * @author jacek.malatynski
 */

public class FizzBuzzTest {
    
        private FizzBuzz fizzBuzz;
        private final ArrayList<String> expectedValues = new ArrayList<>(
        Arrays.asList( "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", 
                       "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" ));
        private final ArrayList<String> actualValues = new ArrayList<>();

                
        @Before
        public void createCorrectInstance(){
            
        fizzBuzz = new FizzBuzz(1, 100);
        
        }
        
        @Test
        public void createFizzBuzzWithCountParameter() {
            
               fizzBuzz = new FizzBuzz(1, 100);
               
        }
        
        @Test
        public void getConstructorCountToValue() {
            
            Integer countTo = 100;
            Assert.assertThat(countTo, Matchers.comparesEqualTo(fizzBuzz.getCountTo()));
            
        }
        
        @Test
        public void getConstructorCountFromValue() {
            
            Integer countFrom = 1;
            Assert.assertThat(countFrom, Matchers.comparesEqualTo(fizzBuzz.getCountFrom()));
            
        }
        
        @Test(expected = IllegalArgumentException.class)
        public void testFizzBuzzWithWrongCountToParameter(){
            
            fizzBuzz = new FizzBuzz(1, 333);

        }

        @Test(expected = IllegalArgumentException.class)
        public void testFizzBuzzWithWrongCountFromParameterss(){
            
            fizzBuzz = new FizzBuzz(-4,100);
            
        }
        
        @Test(expected = IllegalArgumentException.class)
        public void testFizzBuzzWithNullParameters(){
            
            fizzBuzz = new FizzBuzz(null, null);
            
        }
          
        @Test
        public void getInt(){
            
           Integer testInt = 11;
           Assert.assertThat(testInt, Matchers.comparesEqualTo(fizzBuzz.getCurrentInt(11)));
           
        }

        @Test
        public void getFizz(){
            
            Assert.assertEquals("Fizz", fizzBuzz.returnFizz());
            
        }
        
        @Test
        public void getBuzz(){
            
            Assert.assertEquals("Buzz", fizzBuzz.returnBuzz());
            
        }
        
        @Test
        public void getFizzBuzz(){
            
            Assert.assertEquals("FizzBuzz", fizzBuzz.returnFizzBuzz());
            
        }
        
        @Test
        public void fizzBuzzChecker(){
            
            Assert.assertEquals("FizzBuzz", fizzBuzz.getValue(15));
            
        }
        
        @Test
        public void fizzChecker(){
            
            Assert.assertEquals("Fizz", fizzBuzz.getValue(9));
            
        }

        @Test
        public void buzzChecker(){
            
            Assert.assertEquals("Buzz", fizzBuzz.getValue(10));
            
        }
        
        
        @Test
        public void intToStringChecker(){
            
            Assert.assertEquals("77", fizzBuzz.getValue(77));
            
        }
        
        
        @Test
        public void compareSampleResults() {
            
            for (int i = 1; i <= 15 + 1; i++) {
            actualValues.add(fizzBuzz.getValue(i));
            }
            
            for (int i = 0 ; i < expectedValues.size(); i++) {
                Assert.assertTrue(expectedValues.get(i).equals(actualValues.get(i)));
            }
        }
        
}
