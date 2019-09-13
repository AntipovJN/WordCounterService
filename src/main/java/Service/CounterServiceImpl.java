package Service;

import java.util.HashMap;
import java.util.Map;

public class CounterServiceImpl implements CounterService {

    public Map<String, Integer> getCounterMap(String words) {
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String word : words.split(" ")) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }
}
