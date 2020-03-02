package school.cesar.unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class FactorialTest {

    @Spy
    Factorial factorial;

    @Test
    public void calculate_callAmountForEight() {
        factorial.calculate(8);
        verify(factorial, times(8)).calculate(anyInt());
    }
}
