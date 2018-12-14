import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    private HashSet<Character> vowels;

    @Step("FOO is <value>.")
    public void checkValue(String value) {
    
            assertThat(System.getenv("FOO")).isEqualTo(value);
    }
}
