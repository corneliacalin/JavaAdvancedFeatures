package oop.io.Homework;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File checkedFile = new File("C:/Test/loremipsum.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(checkedFile));
        int spaces = 0;
        int comma = 0;
        int dots = 0;

        String fileContent = "";
        String fileLine;


        while ((fileLine = bufferedReader.readLine()) != null) {
            fileContent +=  fileLine;
            fileContent+=" ";
        }



        System.out.println(fileContent);
        System.out.println("Words number: " + countWords(fileContent));


    }

    public static int countWords(String text) {
        String[] wordsArray = null;
        wordsArray = text.split(" ");
        return (wordsArray.length);

    }

    public static void countSpecialSigns(String text){
        int commaCount=0, dotCount=0,spaceCount=0;
        for (int i=0; i<text.length()-1;i++){
            if(text.charAt(i)==' '){
                spaceCount++;
            }
            if(text.charAt(i)==','){
                commaCount++;

            }
            if(text.charAt(i)=='.'){
                dotCount++;
            }
        }
        System.out.println("Number of comma "+ commaCount);
        System.out.println("Number of dot " + dotCount);
        System.out.println("Number of space " + spaceCount);
    }

    public static int numberOfOccurences (String text, String word){
    String[] wordArray=text.split(" ");
    for (int i=0; i<wordArray.length; i++){
        String word1 =wordArray[i];
        if((word.charAt(word.length()-1)<65 )|| ((word.charAt(word.length()-1)>90) && (word.charAt(word.length()-1)<97)) ||(word.charAt(word.length()-1)>120)) {
    word = word.substring(0,word.length()-2);
        }

    }
    return 0;}
}
