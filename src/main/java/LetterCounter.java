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
        countAllLetters();
    }

    private void countAllLetters() {
        for(String letter : sentence.split(""))
            countThisLetter(letter);
    }

    private void countThisLetter(String letter) {
        if(notAddedYet(letter))
            addLetter(letter);
        else
            increment(letter);
    }

    private boolean notAddedYet(String letter) {
        return !lettersFound.keySet().contains(letter);
    }

    private void addLetter(String letter) {
        lettersFound.put(letter, 1);
    }

    private void increment(String letter) {
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
