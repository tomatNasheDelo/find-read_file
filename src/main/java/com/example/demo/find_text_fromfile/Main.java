package com.example.demo.find_text_fromfile;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//
//@Component
//public class Main {
//	
//	
//	public void findByText() throws FileNotFoundException, IOException {
//        String searchWord = "ходил"; // слово заменить на нужное
//        FileInputStream fis = new FileInputStream("notes.txt"); // путь заменить на нужный
//        byte[] content = new byte[fis.available()];
//        fis.read(content);
//        fis.close();
//        String[] lines = new String(content, "Cp1251").split("\n"); // кодировку указать нужную
//        int i = 1;
//        for (String line : lines) {
//            String[] words = line.split(" ");
//            int j = 1;
//            for (String word : words) {
//                if (word.equalsIgnoreCase(searchWord)) {
//                    System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
//                }
//                j++;
//            }
//            i++;
//        }
//    }
//
//}
