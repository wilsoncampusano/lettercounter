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

    @Test
    public void twoLetter(){
        String letters = "aa";
        assertThat(counter(letters), is(2));
    }

    private int counter(String blank) {
        if(isNull(blank) || blank.equals(""))
            return 0;

        String[] letters = blank.split("");
        int counter = 0;

        for (String letter: letters)
            if(letter.equals("a"))
                counter++;

        return counter;
    }
}
