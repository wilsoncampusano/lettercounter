import static java.util.Objects.isNull;

/**
 * Created by wilsoncampusano on 2/4/16.
 */
public class LetterCounter {
    private String sentence;

    public LetterCounter(String sentence) {
        this.sentence = sentence;
    }

    public int occurences() {
        if(isNull(sentence) || sentence.equals(""))
            return 0;
        String[] letters= sentence;
        if(sentence.equals(letter) )
            return 1;
        return -1;
    }
}
