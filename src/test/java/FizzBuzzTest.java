
import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest{

    private FizzBuzz fizzbuzz;

    @Before
    public void init(){
        this.fizzbuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnTrueWhenTheNumberIsMultipleByThree(){
        assertThat(fizzbuzz.isMultipleByThree(6), is(true));      
    }

    @Test
    public void shouldReturnFalseWhenTheNumberNotIsMultipleByThree(){
        assertThat(fizzbuzz.isMultipleByThree(4), is(false));     
    }

    @Test
    public void shouldReturnTrueWhenTheNumberIsMultipleByFive(){
        assertThat(fizzbuzz.isMultipleByFive(10), is(true));
    }

    @Test
    public void shouldReturnFalseWhenTheNumberNotIsMultipleByFive(){
        assertThat(fizzbuzz.isMultipleByFive(8), is(false));
    }

    @Test
    public void shouldReturnTrueWhenTheNumberIsMultipleByThreeAndFive(){
        assertThat(fizzbuzz.isMultipleByThreeAndFive(15), is(true));
    }

    @Test
    public void shouldReturnFalseWhenTheNumberNotIsMultipleByThreeAndFive(){
        assertThat(fizzbuzz.isMultipleByThreeAndFive(8), is(false));
    }
}