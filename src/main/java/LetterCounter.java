import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

public class LetterCounter {
    private String sentence;
    private Map<String, Integer> lettersFound;

    public LetterCounter(String sentence) {
        this.sentence = sentence;
        this.lettersFound = new HashMap<String, Integer>();
    }

    public void count() {

        if(isNull(sentence) || sentence.equals(""))
            throw new RuntimeException("Sentence null or empty");

        for(String letter : sentence.split(""))
            if(!lettersFound.keySet().contains(letter))
                lettersFound.put(letter, 1);
            else
                lettersFound.put(letter, incrementLetterCount(letter));
    }

    private Integer incrementLetterCount(String letter) {
        return lettersFound.get(letter).intValue() + 1;
    }

    public List<String> letters() {
        return new ArrayList<String>(lettersFound.keySet());
    }

    public Integer countOf(String letter) {
        return lettersFound.get(letter);
    }
}
