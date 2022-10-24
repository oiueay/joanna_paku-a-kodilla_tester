package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){
        Dictionary dictionary = new Dictionary();
        String polishword = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");


        dictionary.addWord(polishword, englishWord);

        assertEquals(1, dictionary.size());
    }

    @Test
    public void findEnglishWords(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));

        List<EnglishWord>result = dictionary.findEnglishWord("gra");

        List<EnglishWord>expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }
}