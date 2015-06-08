package com.laurencebohannan.interview.util;

import com.laurencebohannan.interview.model.WordStat;

import java.util.Comparator;

/**
 * Created by bohannan on 6/8/15.
 */
public class SequenceComparable implements Comparator<WordStat> {

    @Override
    public int compare(WordStat o1, WordStat o2) {
        int obj1 = o1.getCount();
        int obj2 = o2.getCount();
        return (obj2<obj1 ? -1 : (obj1 == obj2 ? 0 : 1));
    }
}
