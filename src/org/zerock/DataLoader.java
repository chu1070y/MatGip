package org.zerock;

import java.io.File;
import java.util.Scanner;

public class DataLoader {

    public String loadData(String fileName) {

        StringBuffer buffer = new StringBuffer();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (true) {
                buffer.append(scanner.nextLine().toUpperCase());

            }//end while
        }catch(Exception e){

        }
        return buffer.toString();
    }

//    public static void main(String[] args) {
//
//        DataLoader scanEx = new DataLoader();
//        //String str;
//         String str = scanEx.loadData("C:\\zzz\\노인과바다.txt");
//        LetterTest lt = new LetterTest(str);
//
//        System.out.println(str);
//
//
//    }

}