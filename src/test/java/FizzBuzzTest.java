
import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;

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
    public void shouldReturnFizzForNumberMultipleByThree() {
        assertThat(fizzbuzz.convertNumber(6), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzForNumberMultipleByFive() {
        assertThat(fizzbuzz.convertNumber(10), is("Buzz"));
    }

    @Test
    public void returnTrueWhenMethodPrintIsInvoked() {
        Printer printerMock = Mockito.mock(Printer.class);

        fizzbuzz.run(fizzbuzz, printerMock);

        Mockito.verify(printerMock).print(fizzbuzz.convertNumber(4));
    }


}