package com.sda.child2;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{



        HashMap<String, Integer> map = new HashMap<>();
        Scanner input = new Scanner(new File("C:\\Users\\raluca.manoiu\\raluca\\java-advanced\\src\\main\\java\\com\\sda\\child2\\Main.txt"));


        while(input.hasNext()) {
            String word=input.next();

            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            }
            else {
                map.put(word, 1);
            }
        }
            input.close();

        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

}

}
