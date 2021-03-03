package oop.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        // serializare
        File personeFile = new File("C:/Test/person.txt");
        if (!personeFile.exists()) {
            personeFile.createNewFile();


        }
        Person person = new Person("andrei", "naaa");
        System.out.println("before" + person);

        try (FileOutputStream fileOutputStream = new FileOutputStream(personeFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
        }
        Person person1;
        try (FileInputStream fileInputStream = new FileInputStream(personeFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            person1 = (Person) objectInputStream.readObject();

        }
        System.out.println("after" + person1);


        ////sf serializare
        File absoluteFile = new File("C:/Test/test.txt");
        File outputFile = new File("C:/Test/output.txt");
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
                bufferedWriter.write(fileLine);
                bufferedWriter.append(fileLine);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
// path
        Path outputPath = Paths.get("C:/Test/output.txt");
        List<String> myLines = Files.readAllLines(outputPath);
        System.out.println("*****");
        System.out.println(myLines);
        System.out.printf("*****");
    Path inputPath=Paths.get( "C:/Test/input.txt"); //"./src/oop/io/input.txt" "../input.txt"
    Files.exists(inputPath);
    if(!Files.exists(inputPath)){
        Files.createFile(inputPath);
    }
    Files.write(inputPath, myLines);
        // sf path
    }
}
