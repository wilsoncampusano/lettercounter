import com.sun.tools.javac.util.StringUtils;
import org.junit.Test;

import static java.util.Objects.isNull;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by wilsoncampusano on 2/4/16.
 */
public class LetterCounterTest {

    @Test
    public void oneBlankSpaceDontCount(){
        String blank = "";

        assertThat(counter(blank), is(0));
    }

    @Test public void dontCountNull(){
        String nulll = null;
        assertThat(counter(nulll), is(0));
    }

    @Test public void oneLetterCount(){
        String letter = "a";
        assertThat(counter(letter), is(1));
    }

    private int counter(String blank) {
        if(isNull(blank) || blank.equals(""))
            return 0;
        if(blank.equals("a"))
            return 1;
        return -1;
    }
}
