import org.junit.Test;
import org.mockito.Mockito;

public class PrinterTest {

    @Test
    public void shouldReturnTrueWhenReturnOfFizz() {
        FizzBuzz fizzBuzzMock = Mockito.mock(FizzBuzz.class);

        fizzBuzzMock.convertNumber(5);

        Mockito.verify(fizzBuzzMock, Mockito.times(1)).convertNumber(5);
    }

    
}