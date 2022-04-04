package servlets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetPlayerServletTest {
    private final GetPlayerServlet getPlayerServletUnderTest = new GetPlayerServlet();

    @Test
    public void getRatioTest() {
                //arrange
              float kills = 100.00F;
              float deaths = 10.00F;
              float expected = 10.00F;
              //act
            double result = getPlayerServletUnderTest.getRatio(kills,deaths);
        Assertions.assertEquals(expected,result);
    }
}