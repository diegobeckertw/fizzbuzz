
import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class FizzBuzzTest{

    @Test
    public void isTrueWhenTheNumberIsMultipleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();

        MatcherAssert.assertThat(true, is(fizzbuzz.isMultipleByThree(6)));        
    }
}