package primeraEvaluacion.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Vigenere {

    ArrayList<String> words;

    Map<Integer, Character> table;

    // Constructor that initializes the words array and table map
    public Vigenere(){
        words = new ArrayList<>();
        table = new HashMap<>(26);

        for (int i = 0; i < 26; i++) {
            table.put(i, (char)(i+'A'));
        }
    }

    /* Helpers methods */

    // Generates the keyphrase depending on the length of the phrase
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

    // Cuts the phrase given by the spaces and stores it in words array
    private void cutPhrase(String phrase){
        words.clear();
        this.words.addAll(Arrays.asList(phrase.split("\\s+")));
    }

    /* Encoding methods */

    // This method encodes a single word or phrase removing spaces, using the ASCII table
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

    // This method encodes a single word of phrase removing spaces using the map table defined above
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

    // Encodes with the method encode but word by word
    public String encodeByWord(String phrase, String key){
        phrase = phrase.toUpperCase();
        cutPhrase(phrase);
        String encoded = "";
        for (String word : words) {
            encoded += encode(word, key) + " ";
        }

        return encoded;
    }

    // Encodes with the method encodeWithTable but word by word
    public String encodeByWordWithTable(String phrase, String key){
        phrase = phrase.toUpperCase();
        cutPhrase(phrase);
        String encoded = "";
        for (String word : words) {
            encoded += encodeWithTable(word, key) + " ";
        }

        return encoded;
    }

    /* Decoding methods */

    // This method decodes a single word or phrase, without spaces, using the ASCII table
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

    // This method decodes a single word of phrase, without spaces, using the map table defined above
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

    // Decodes with the method decode but word by word
    public String decodeByWord(String encoded, String key){
        encoded = encoded.toUpperCase();
        cutPhrase(encoded);
        String decoded = "";

        for (String word : words) {
            decoded += decode(word, key) + " ";
        }

        return decoded;
    }

    // Encodes with the method decodeWithTable but word by word
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
