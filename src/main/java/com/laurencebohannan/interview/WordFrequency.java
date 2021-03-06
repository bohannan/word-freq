package com.laurencebohannan.interview;

import com.laurencebohannan.interview.model.WordStat;
import com.laurencebohannan.interview.util.SequenceComparable;

import java.util.*;

/**
 * This application contains a simple method to process the input text file and provide a list of
 * the top 100 most frequent words found in the text. If no file was specified on the command
 * line argument then the default input file that was supplied will be used.
 * @author Laurence Bohannan
 */
public class WordFrequency
{

    public static String DEFAULT_INPUT = "/InputText.txt";

    public static void main( String[] args )
    {
        String inputText = null;
        //common punctuations and char that were in the file.
        String regEx = "[\\p{P}&&[^\u0027|\u002D]]|[0-9]+-*|»|«|º|↑|\\s'";

        // Get String of input text from source
        InputHandler inputHandler = new InputHandler();
        if(args.length>0){
            inputText = inputHandler.openFile(args[0]);
        }else {
            inputText = inputHandler.open(DEFAULT_INPUT);
        }

        if(inputText!=null && inputText.trim().length()!=0) {

            // split the input string into separate words and filter out any punctuations and unwanted chars
            String[] words = inputText.toLowerCase().replaceAll(regEx, " ").split("\\s+") ;

            int totalWordCount = words.length;
            System.out.println("Total word count: "+totalWordCount);

            // create a map of unique words and number of appearances
            Map<String,Integer> wordFreqMap = new HashMap<String,Integer>();
            Integer count;
            for (String s: words){
                count = wordFreqMap.get(s);
                if(count == null) {
                    count = 0;
                }
                wordFreqMap.put(s, ++count);
            }

            // place map structure into a simple list data structure
            List<WordStat> wordlist = new ArrayList<WordStat>();
            for (String s: wordFreqMap.keySet()){
                int wordCount = wordFreqMap.get(s);
                wordlist.add(new WordStat(s, wordCount));
            }

            int uniqueWordCount = wordlist.size();
            System.out.println("Unique word count: "+uniqueWordCount);

            // sort it by Rank
            Collections.sort(wordlist, new SequenceComparable()) ;

            //Display
            Integer rank = 0;
            System.out.format("%s\t%s\t%s\t%s\n","Rank","Word","Count","Frequency");
            for (WordStat wordStats : wordlist){
                ++rank;
                System.out.format("%d\t%s\t%d\t%.9f%n", rank, wordStats.getWord(), wordStats.getCount(),
                        wordStats.getRelativeFrequency(uniqueWordCount));
                if(rank.equals(100)) break;
            }
        }
    }
}
