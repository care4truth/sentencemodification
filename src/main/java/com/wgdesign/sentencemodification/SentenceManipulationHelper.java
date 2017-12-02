package com.wgdesign.sentencemodification;

import java.util.List;

/*
 * Class that acts as utility class which supplies "manipulateWord" to modify the word 
 * Eg: Input  -- "Automotive"
 *     Output -- "A6e";
 */
public class SentenceManipulationHelper {
   public  static String manipulateWord(List<Character> word) {
      //when size is 1 , represent as it is.
      if(word.size() == 1 ) {
         return new StringBuffer()
                  .append(word.get(0)).toString();
      } 
      //logic that we actually need when size is greater than 1.Input:success;Output:s4s
      return new StringBuffer()
               .append(String.valueOf(word.get(0)))
               .append(word.subList(1 , word.size() - 1).stream().distinct().count())
               .append(String.valueOf(word.get(word.size() - 1)))
               .toString();
   }
}
