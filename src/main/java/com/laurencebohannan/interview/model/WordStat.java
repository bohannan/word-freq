package com.laurencebohannan.interview.model;

import java.util.Objects;

/**
 * Created by bohannan on 6/7/15.
 */
public class WordStat {

    private String word;
    private int count = 1;

    public WordStat(String word,int count) {
        this.word = word;
        this.count = count ;
    }

    public String getWord() {
        return word;
    }

    public int getCount(){
        return this.count;
    }

    public float getRelativeFrequency(int totalCount){
        return this.count/(float)totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordStat wordStat = (WordStat) o;

        if (count != wordStat.count) return false;
        if (!word.equals(wordStat.word)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = word.hashCode();
        result = 31 * result + count;
        return result;
    }
}
