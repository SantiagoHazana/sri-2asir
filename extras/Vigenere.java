package extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Vigenere {

    ArrayList<String> words;

    Map<Integer, Character> table;

    public Vigenere(){
        words = new ArrayList<>();
        table = new HashMap<>(26);

        for (int i = 0; i < 26; i++) {
            table.put(i, (char)(i+'A'));
        }
    }

    private String generateKeyPhrase(String keyword, String phrase){
        int length = keyword.length();

        if (keyword.length() > phrase.length())
            return keyword.substring(0, phrase.length());

        for (int i = 0; i <= length; i++) {
            if (i == length)
                i = 0;
            if (keyword.length() == phrase.length())
                break;
            keyword += keyword.charAt(i);
        }

        return keyword;
    }

    private void cutPhrase(String phrase){
        words.clear();
        this.words.addAll(Arrays.asList(phrase.split("\\s+")));
    }

    public String encodeWithTable(String phrase, String key){
        phrase = phrase.toUpperCase();
        key = key.toUpperCase();
        phrase = phrase.replaceAll("\\s", "");
        key = generateKeyPhrase(key, phrase);
        String encoded = "";

        for (int i = 0; i < phrase.length(); i++) {
            int n = (phrase.charAt(i) + key.charAt(i))%26;

            encoded += table.get(n);
        }

        return encoded.toLowerCase();
    }

    public String encode(String phrase, String key){
        phrase = phrase.toUpperCase();
        key = key.toUpperCase();
        phrase = phrase.replaceAll("\\s", "");
        key = generateKeyPhrase(key, phrase);
        String encoded = "";

        for (int i = 0; i < phrase.length(); i++) {

            int n = (phrase.charAt(i) + key.charAt(i))%26;

            n += 'A';

            encoded += (char)n;
        }

        return encoded.toLowerCase();
    }

    public String encodeByWord(String phrase, String key){
        phrase = phrase.toUpperCase();
        cutPhrase(phrase);
        String encoded = "";
        for (String word : words) {
            encoded += encode(word, key) + " ";
        }

        return encoded;
    }

    public String encodeByWordWithTable(String phrase, String key){
        phrase = phrase.toUpperCase();
        cutPhrase(phrase);
        String encoded = "";
        for (String word : words) {
            encoded += encodeWithTable(word, key) + " ";
        }

        return encoded;
    }

    public String decodeWithTable(String encoded, String key) {
        key = key.toUpperCase();
        encoded = encoded.toUpperCase();
        key = generateKeyPhrase(key, encoded);
        encoded = encoded.replaceAll("\\s", "");
        String decoded = "";

        for (int i = 0; i < encoded.length(); i++) {
            int n = (encoded.charAt(i) - key.charAt(i) + 26) % 26;

            decoded += table.get(n);
        }

        return decoded.toLowerCase();
    }

    public String decode(String encoded, String key){
        key = key.toUpperCase();
        encoded = encoded.toUpperCase();
        key = generateKeyPhrase(key, encoded);
        encoded = encoded.replaceAll("\\s", "");
        String decoded = "";

        for (int i = 0; i < encoded.length(); i++) {
            int n = (encoded.charAt(i)-key.charAt(i)+26)%26;

            n += 'A';

            decoded += (char)n;
        }

        return decoded.toLowerCase();
    }

    public String decodeByWord(String encoded, String key){
        encoded = encoded.toUpperCase();
        cutPhrase(encoded);
        String decoded = "";

        for (String word : words) {
            decoded += decode(word, key) + " ";
        }

        return decoded;
    }
    public String decodeByWordWithTable(String encoded, String key){
        encoded = encoded.toUpperCase();
        cutPhrase(encoded);
        String decoded = "";

        for (String word : words) {
            decoded += decodeWithTable(word, key) + " ";
        }

        return decoded;
    }
}
