package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ByteDemoApplication {

	public static void main(String[] args) throws FileNotFoundException , IOException{
		SpringApplication.run(ByteDemoApplication.class, args);
		
				  
//        String text = "Hello world!"; // строка для записи
//        try(FileOutputStream fos=new FileOutputStream("notes.txt"))
//        {
//            // перевод строки в байты
//            byte[] buffer = text.getBytes();
//            System.out.println("-------------");
//            System.out.println(buffer.toString());
//             for(int x = 0; x<buffer.length; x++) {
//            	 System.out.println(buffer[x]);
//             }
//            System.out.println("--------------");
//            fos.write(buffer, 0, buffer.length);
//            System.out.println("The file has been written");
//        }
//        catch(IOException ex){
//              
//            System.out.println(ex.getMessage());
  //        }
//		
//		 String searchWord = "Hello"; // слово заменить на нужное
//         FileInputStream fis = new FileInputStream("notes.txt"); // путь заменить на нужный
//         byte[] content = new byte[fis.available()];
//         fis.read(content);
//         fis.close();
//        String[] lines = new String(content, "Cp1251").split("\n"); // кодировку указать нужную
//         int i = 1;
//        for (String line : lines) {
//             String[] words = line.split(" ");
//             int j = 1;
//             for (String word : words) {
//                 if (word.equalsIgnoreCase(searchWord)) {
//                     System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
//                 }
//                 j++;
//            }
//              i++;
//        }
    }

		
	}



