import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class LetterCounterTest {

    @Test
    public void oneLetter() {

        String letter = "a";

        LetterCounter counter = new LetterCounter(letter);
        counter.count();

        assertThat(counter.letters(), hasItems("a"));
    }

    @Test
    public void twoLetters() {

        String letters = "aa";

        LetterCounter counter = new LetterCounter(letters);
        counter.count();

        assertThat(counter.letters(), hasItems("a"));
    }

    @Test
    public void anotherLetters() {

        String letters = "bb";

        LetterCounter counter = new LetterCounter(letters);
        counter.count();

        assertThat(counter.letters(), hasItems("b"));
    }

    @Test
    public void alternateLettersInSentence() {

        String letters = "abababab";

        LetterCounter counter = new LetterCounter(letters);
        counter.count();

        assertThat(counter.letters(), hasItems("a", "b"));
    }
}
