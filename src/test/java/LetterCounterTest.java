import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
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

    @Test
    public void oneLetterCount(){
        String letter = "a";

        LetterCounter counter = new LetterCounter(letter);
        counter.count();

        assertThat(counter.letters(), hasItems("a"));
        assertThat(counter.countOf("a"), is(1) );
    }

    @Test
    public void twoLetterCount(){
        String letters = "aa";

        LetterCounter counter = new LetterCounter(letters);
        counter.count();

        assertThat(counter.letters(), hasItems("a"));
        assertThat(counter.countOf("a"), is(2) );
    }

    @Test
    public void canCountDifferentLetters(){
        String letters = "aabbxxzzz";

        LetterCounter counter = new LetterCounter(letters);
        counter.count();

        assertThat(counter.letters(), hasItems("a","b","x","z"));
        assertThat(counter.countOf("a"), is(2) );
        assertThat(counter.countOf("b"), is(2) );
        assertThat(counter.countOf("x"), is(2) );
        assertThat(counter.countOf("z"), is(3) );
    }
}
