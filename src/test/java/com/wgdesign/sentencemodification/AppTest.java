package com.wgdesign.sentencemodification;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.wgdesign.sentencemodification.SentenceManipulation;

/**
 * Unit test for sentenceManipulation Application
 */
public class AppTest 
{
   @Test(expected = IllegalArgumentException.class)
   public void testIfInputNull() {
     SentenceManipulation sentenceManipulation = new SentenceManipulation();
     sentenceManipulation.processSentence();
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testIfInputEmpty() {
     SentenceManipulation sentenceManipulation = new SentenceManipulation("");
     sentenceManipulation.processSentence();
   }
   
   @Test
   public void testIfInputNotNull() {
     SentenceManipulation sentenceManipulation = new SentenceManipulation("It 1s better to f@il !n originality+ than 2 succeed in $imitation");
     assertEquals("I0t 10s b2r t0o f@i0l !n o7y+ t2n 2 s3d i0n $i5n", sentenceManipulation.processSentence());
   }
   
   @Test
   public void testIfInputStartsWithNonAlphaNumeric() {
     SentenceManipulation sentenceManipulation = new SentenceManipulation("^It 1s better to f@il !n originality+ than 2 succeed in $imitation");
     assertEquals("^I0t 10s b2r t0o f@i0l !n o7y+ t2n 2 s3d i0n $i5n",sentenceManipulation.processSentence());
   }
   
   @Test
   public void testIfInputEndsWithNonAlphaNumeric() {
     SentenceManipulation sentenceManipulation = new SentenceManipulation("It 1s better to f@il !n originality+ than 2 succeed in $imitation*&");
     assertEquals("I0t 10s b2r t0o f@i0l !n o7y+ t2n 2 s3d i0n $i5n*&",sentenceManipulation.processSentence());
   }
}
