import Website.Caculator;
import Website.Demo;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;


public class TestCaculatorCsv {
   @ParameterizedTest
    @CsvFileSource(resources = "/add.csv",numLinesToSkip = 1)
    void testAdd (int a, int b, int result){
       Caculator math = new Caculator();
       assertEquals(math.add(a,b),result);
   }
    @ParameterizedTest
    @CsvFileSource(resources = "/sub.csv",numLinesToSkip = 1)
    void testSub (int a, int b, int result){
        Caculator math = new Caculator();
        assertEquals(math.sub(a,b),result);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/mul.csv",numLinesToSkip = 1)
    void testMul (int a, int b, int result){
        Caculator math = new Caculator();
        assertEquals(math.mul(a,b),result);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/div.csv",numLinesToSkip = 1)
    void testDiv(int a, int b, double result){
        Caculator math = new Caculator();
        assertEquals(math.div(a,b),result,1e-6);
    }
}
