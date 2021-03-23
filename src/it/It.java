/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it;

import java.util.*;

/**
 *
 * @author mobai
 */
public class It {

    public static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Aaam";
        String b = "AAAs";
       String res = isAnagram(a, b)?"same":"not same";
        System.out.println(res);
    }

    static boolean isAnagram(String a, String b) {
        ArrayList<charFrequncy> worda = new ArrayList<charFrequncy>();
        ArrayList<charFrequncy> wordb = new ArrayList<charFrequncy>();

        if (a.length() == b.length()) {
            setInfoToArrayList(worda, a);
            setInfoToArrayList(wordb, b);
          return  comparsien(worda,wordb);
        }
          return false ;
    }

    static void setInfoToArrayList(ArrayList<charFrequncy> word, String text) {
        for (int i = 0; i < text.length(); i++) {
            if (IncrementExictLetter(word, text.charAt(i))) {

            } else {
                charFrequncy c = new charFrequncy();
                c.leeter = text.charAt(i);
                c.freqency = 1;

                word.add(c);
            }

        }

    }

    static class charFrequncy {

        char leeter;
        int freqency;

    }

    static boolean IncrementExictLetter(ArrayList<charFrequncy> word, char text) {

        for (int j = 0; j < word.size(); j++) {
            if (Character.toLowerCase(text)
                    == Character.toLowerCase(word.get(j).leeter)) {
                word.get(j).freqency = word.get(j).freqency + 1;
                return true;
            }
        }
        return false;
    }

    static void printArrayList(ArrayList<charFrequncy> word) {
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i).leeter + " " + word.get(i).freqency);
        }
    }

    static void sorting(ArrayList<charFrequncy> word) {
        for (int i = 0; i < word.size(); i++) {
            for (int j = 0; j < word.size(); j++) {
                if (word.get(i).leeter < word.get(j).leeter) {
                    Collections.swap(word, i, j);

                }
            }

        }

    }

    static boolean comparsien(ArrayList<charFrequncy> worda,ArrayList<charFrequncy> wordb) {
        sorting(worda);
        sorting(wordb);
        for(int i = 0 ; i<worda.size();i++){
        if(worda.get(i).leeter==wordb.get(i).leeter){
           if(worda.get(i).freqency!=wordb.get(i).freqency){
           return false; 
           }
        }
        else{
       return  false ;
        }
        }
        return true; 
    }

}
