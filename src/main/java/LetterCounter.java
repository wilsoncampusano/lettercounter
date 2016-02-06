import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class LetterCounter {
    private String sentence;
    private Map<String, Integer> lettersFound;

    public LetterCounter(String sentence) {
        this.sentence = sentence;
        this.lettersFound = new HashMap<String, Integer>();
    }

    public void count() {
        if(nothinIsInSentence())
            throw new RuntimeException("Sentence null or empty");
        countAllLetters();
    }

    private boolean nothinIsInSentence() {
        return isNull(sentence) || sentence.equals("");
    }

    private void countAllLetters() {
        String[] allTheLetters = sentence.split("");
        for(String letter : allTheLetters)
            countCurrentLetter(letter);
    }

    private void countCurrentLetter(String letter) {
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

    public String print() {
        String output = "";
        for (String letter: lettersFound.keySet().stream().sorted().collect(Collectors.<String>toList())) {
            output += String.format("%s : %d\n",letter, lettersFound.get(letter));
        }
        return output;
    }
}
