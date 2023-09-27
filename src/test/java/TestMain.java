import com.github.eiriksgata.calci.Expression;
import org.junit.jupiter.api.Test;

/**
 * Testing the package
 * Including main()
 */

public class TestMain {

    @Test
    void calciTest(String[] args) {
        //String string = "fzero(eval(1/2+1/(x-1)+2integ(sin(reg*arctan(x))/(1+x^2)^(reg/2)/(exp(2πx)-1),0,∞),reg(x)),14i)";
        String string = "2+3+(6+6+3+3+6)-3+(41+68+30+36+99+36+72+85+78+2)-4";

        Expression expr = new Expression(string);
        System.out.println(expr.value().val);
    }
}
