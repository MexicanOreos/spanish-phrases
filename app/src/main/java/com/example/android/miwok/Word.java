package com.example.android.miwok;

public class Word {
    private String defaultWord, spanishWord;

    Word() {
        defaultWord = null;
        spanishWord = null;
    }

    Word(String defaultWord, String spanishWord) {
        this.defaultWord = defaultWord;
        this.spanishWord = spanishWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public String getSpanishWord() {
        return spanishWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;

    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }
}
