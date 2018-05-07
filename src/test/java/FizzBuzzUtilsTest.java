

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzUtilsTest {

    private FizzBuzzUtils fizzBuzzUtils;
    @Before
    public void init() {
        this.fizzBuzzUtils = new FizzBuzzUtils();
    }

    @Test
    public void returnTrueWhenTheNumberIsMultipleByThree(){
        assertThat(fizzBuzzUtils.isMultipleByThree(6), is(true));      
    }

    @Test
    public void returnFalseWhenTheNumberNotIsMultipleByThree(){
        assertThat(fizzBuzzUtils.isMultipleByThree(4), is(false));     
    }

    @Test
    public void returnTrueWhenTheNumberIsMultipleByFive(){
        assertThat(fizzBuzzUtils.isMultipleByFive(10), is(true));
    }

    @Test
    public void returnFalseWhenTheNumberNotIsMultipleByFive(){
        assertThat(fizzBuzzUtils.isMultipleByFive(8), is(false));
    }

    @Test
    public void returnTrueWhenTheNumberIsMultipleByThreeAndFive(){
        assertThat(fizzBuzzUtils.isMultipleByThreeAndFive(15), is(true));
    }

    @Test
    public void returnFalseWhenTheNumberNotIsMultipleByThreeAndFive(){
        assertThat(fizzBuzzUtils.isMultipleByThreeAndFive(8), is(false));
    }
}