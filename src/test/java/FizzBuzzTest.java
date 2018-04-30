
import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class FizzBuzzTest{

    @Test
    public void shouldReturnTrueWhenTheNumberIsMultipleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertThat(fizzbuzz.isMultipleByThree(6), is(true)); 
        // assertThat(reason, actual, matcher);       
    }

    @Test
    public void shouldReturnFalseWhenTheNumberNotIsMultipleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertThat(fizzbuzz.isMultipleByThree(4), is(false));     
    }

    @Test
    public void shouldReturnTrueWhenTheNumberIsMultipleByFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertThat(fizzbuzz.isMultipleByFive(10), is(true));
    }

    @Test
    public void shouldReturnFalseWhenTheNumberNotIsMultipleByFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertThat(fizzbuzz.isMultipleByFive(8), is(false));
    }
}