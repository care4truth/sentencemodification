package com.wgdesign.sentencemodification;

import java.util.ArrayList;
import java.util.List;

import com.wgdesign.sentencemodification.SentenceManipulationHelper;

/*
 * Class which contains attribute "sentence" and takes care of processing sentence using "processSentence" method.
 * Any operation that need to be done on sentence must be added here.
 */
public class SentenceManipulation {

   private String sentence;
   
   public SentenceManipulation() {
      this.sentence = "";
   }
   
   public SentenceManipulation(String sentence) {
      this.sentence = sentence;
   }
   
   public String getSentence() {
      return sentence;
   }

   public void setSentence(String sentence) {
      this.sentence = sentence;
   }

   public String processSentence() {
      //buffer to store for result sentence
      StringBuffer resultSentence = new StringBuffer();
      
      //List which holds all the character until for loop reaches NonAlphaNumeric character
      List<Character> tempHolderUntilNonAlphaNumericEncounter = new ArrayList<Character>();
         
      if(sentence == null || sentence == "" ) {
         throw new IllegalArgumentException("Input String is not passed");
      } else {
         
         for(char anyCharacter : this.getSentence().toCharArray()) {
            if(Character.isLetterOrDigit(anyCharacter)) {
               
               //Add character to temporary holder if a alphanumeric character is encountered.
               tempHolderUntilNonAlphaNumericEncounter.add(Character.valueOf(anyCharacter));
            } else {
               
               //when non-alphanumeric character encountered, modify and stringify the temporary holder.Add that character at end.
               resultSentence.append(tempHolderUntilNonAlphaNumericEncounter.size() > 0 ? 
                                 SentenceManipulationHelper.manipulateWord(tempHolderUntilNonAlphaNumericEncounter) : "")
                              .append(anyCharacter);
               
               //Clean the temporary holder
               tempHolderUntilNonAlphaNumericEncounter = new ArrayList<Character>();
               }
            }
            //address the holder if non-alphanumeric character is not encountered
            if(tempHolderUntilNonAlphaNumericEncounter.size() > 0){ 
               resultSentence.append(SentenceManipulationHelper.manipulateWord(tempHolderUntilNonAlphaNumericEncounter));
            }
         }
      return resultSentence.toString();
   }

}
