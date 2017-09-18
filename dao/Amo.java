/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Olga
 */
public class Amo {
         private static Map<String, String> dictionary1 =new HashMap<String, String>();
 private static Map<String, String> dictionarySource =new HashMap<String, String>();
 private static final Map<String, Integer> buildDictionary1(){
      Map<String, Integer> dictionary =new HashMap<String, Integer>();
      String abed="abed";
      dictionary.put(abed, abed.hashCode());
      dictionary.put("bade", abed.hashCode());
      dictionary.put("bead", abed.hashCode());
      String abet="abet";
      dictionary.put(abet, abet.hashCode());
      dictionary.put("beat", abet.hashCode());
      dictionary.put("beta", abet.hashCode());
     return dictionary;
 }
  private static final Map<Integer,Set<String>> buildDictionarySource(){
      Map<Integer,Set<String>> dictionarySource =new HashMap<Integer,Set<String>>();
      String abed="abed";
      dictionarySource.put(abed.hashCode(),new HashSet<String>(){{add(abed);add("bade");add("bead");}});
      String abet="abet";
      dictionarySource.put(abet.hashCode(), new HashSet<String>(){{add(abet);add("beat");add("beta");}});
     return dictionarySource;
 }
     static double closerToZero(double[] ts) {
        double minTo_0 = ts[0];
        for (int i = 1; i < ts.length; i++) {
            if (ts[i] > 0) {
                minTo_0 = ts[i];
                break;
            }
        }
        if (minTo_0 >= 0) {
            for (int i = 0; i < ts.length; i++) {
                if (ts[i] > 0) {
                    if (minTo_0 > ts[i]) {
                        minTo_0 = ts[i];
                    }
                }
            }
        } else {
            for (int i = 0; i < ts.length; i++) {
                if (ts[i] < 0) {
                    if (minTo_0 < ts[i]) {
                        minTo_0 = ts[i];
                    }
                }
            }
        }
        return minTo_0;
    }

    public static void main(String[] args) {
        double[] ts={-11,-2,-1,-2,1,3-5,-8, -18};
//  System.out.print(closerToZero(ts));
        String word="bead";
        System.out.println(buildDictionary1().get(word));
        System.out.println(buildDictionarySource().get(buildDictionary1().get(word)));
    }
}
