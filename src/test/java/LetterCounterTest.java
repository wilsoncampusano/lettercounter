
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LetterCounterTest {

    @Test
    public void oneBlankSpaceDontCount(){

        String blank = "";

        LetterCounter counter =  new LetterCounter(blank);

        assertThat(counter.occurences(), is(0));
    }

    @Test public void dontCountNull(){

        String nulll = null;

        LetterCounter counter = new LetterCounter(nulll);

        assertThat(counter.occurences(), is(0));
    }

    @Test public void oneLetterCount(){

        String letter = "a";

        LetterCounter counter = new LetterCounter(letter);

        assertThat(counter.occurences(), is(1));
    }

    @Test
    public void twoLetter(){

        String letters = "aa";

        LetterCounter counter = new LetterCounter(letters);

        assertThat(counter.occurences(), is(1));
    }

    @Test
    public void twoLetters(){

        String letters  = "bb";

        LetterCounter counter = new LetterCounter(letters);

        assertThat(counter.occurences(), is(1));
    }

    @Test @Ignore("need more dt")
    public void countDiferentsLetters(){

        String letters = "ab";

        LetterCounter counter = new LetterCounter(letters);

        assertThat(counter.occurences(), is(2));
    }
}
