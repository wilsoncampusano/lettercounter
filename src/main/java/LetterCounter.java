import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

/**
 * Created by wilsoncampusano on 2/4/16.
 */
public class LetterCounter {
    private String sentence;
    List<String> lettersFound;

    public LetterCounter(String sentence) {
        this.sentence = sentence;
        this.lettersFound = new ArrayList<String>();
    }

    public void count() {

        if(isNull(sentence) || sentence.equals(""))
            throw new RuntimeException();

        for(String letter : sentence.split(""))
            if(!lettersFound.contains(letter))
                lettersFound.add(letter);

    }

    public List<String> letters() {
        return lettersFound;
    }
}
