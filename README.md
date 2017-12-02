# sentencemodification

In the programming language of your choice, write a method that modifies a string using the following rules:
1. Each word in the input string is replaced with the following: the first letter of the word, the count of distinct letters between the first and last letter, and the last letter of the word. For example, "Automotive" would be replaced by "A6e".
2. A "word" is defined as a sequence of alphabetic characters, delimited by any non-alphabetic characters.
3. Any non-alphabetic character in the input string should appear in the output string in its original relative location.

Prerequisites : 
1) Java 8 , MAVEN.

How to run
----------
1. Please clone this repository
2. Go that location on your system and run the following command.
    mvn clean compile install exec:java -Dexec.args="'inputsentence'"
Eg: mvn clean compile install exec:java -Dexec.args="'Hello World'"

Note: 1. "inputsentence" in the above command , is the place where you need to give your own sentence.Please be careful with quotes.
      2. If argument was not entered , system will prompt you to "Input sentence is missing.A sentence must be entered".
