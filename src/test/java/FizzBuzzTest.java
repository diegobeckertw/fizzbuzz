
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

import static org.mockito.Mockito.*;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FizzBuzzTest{

    private FizzBuzz fizzbuzz;

    @Before
    public void init(){
        this.fizzbuzz = new FizzBuzz();
    }

    @Test
    public void returnFizzForNumberMultipleByThree() {
        assertThat(fizzbuzz.convertNumber(6), is("Fizz"));
    }

    @Test
    public void returnBuzzForNumberMultipleByFive() {

        assertThat(fizzbuzz.convertNumber(10), is("Buzz"));
    }

    @Test
    public void returnFizzBuzzForNumberMultiopleByThreeAndFive() {
        assertThat(fizzbuzz.convertNumber(15), is("FizzBuzz"));
    }

    @Test
    public void returnTrueWhenMethodPrintIsInvoked() {
        Printer printerMock = mock(Printer.class);

        fizzbuzz.run(fizzbuzz, printerMock);

        verify(printerMock).print(fizzbuzz.convertNumber(4));
    }


}