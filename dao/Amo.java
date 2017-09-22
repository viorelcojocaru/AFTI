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
       String abets="abets";
      dictionary.put(abets, abets.hashCode());
      dictionary.put("baste", abets.hashCode());
      dictionary.put("betas", abets.hashCode());
      dictionary.put("beast", abets.hashCode());
      dictionary.put("beats", abets.hashCode());
       String abut="abut";
      dictionary.put(abut, abut.hashCode());
      dictionary.put("tabu", abut.hashCode());
      dictionary.put("tuba", abut.hashCode());
       String acme="acme";
      dictionary.put(acme, acme.hashCode());
      dictionary.put("came", acme.hashCode());
      dictionary.put("mace", acme.hashCode());
       String acre="acre";
      dictionary.put(acre, acre.hashCode());
      dictionary.put("care", acre.hashCode());
      dictionary.put("race", acre.hashCode());
       String acres="acres";
      dictionary.put(acres, acres.hashCode());
      dictionary.put("cares", acres.hashCode());
      dictionary.put("races", acres.hashCode());
      dictionary.put("scare", acres.hashCode());
       String actors="actors";
      dictionary.put(actors, actors.hashCode());
      dictionary.put("costar", actors.hashCode());
      dictionary.put("castor", actors.hashCode());
       String actress="actress";
      dictionary.put(actress, actress.hashCode());
      dictionary.put("casters", actress.hashCode());
      dictionary.put("recasts", actress.hashCode());
       String airmen="airmen";
      dictionary.put(airmen, airmen.hashCode());
      dictionary.put("marine", airmen.hashCode());
      dictionary.put("remain", airmen.hashCode());
       String alert="alert";
      dictionary.put(acme, alert.hashCode());
      dictionary.put("alter", alert.hashCode());
      dictionary.put("later", alert.hashCode());
       String alerted="alerted";
      dictionary.put(alerted, alerted.hashCode());
      dictionary.put("altered", alerted.hashCode());
      dictionary.put("related", alerted.hashCode());
      dictionary.put("treadle", alerted.hashCode());
       String ales="ales";
      dictionary.put(ales, ales.hashCode());
      dictionary.put("leas", ales.hashCode());
      dictionary.put("sale", ales.hashCode());
      dictionary.put("seal", ales.hashCode());
       String aligned="aligned";
      dictionary.put(aligned, aligned.hashCode());
      dictionary.put("dealing", aligned.hashCode());
      dictionary.put("leading", aligned.hashCode());
       String allergy="allergy";
      dictionary.put(allergy, allergy.hashCode()); 
      dictionary.put("gallery", allergy.hashCode());
      dictionary.put("largely", allergy.hashCode());
      dictionary.put("regally", allergy.hashCode());
       String amen="amen";
      dictionary.put(amen, amen.hashCode());
      dictionary.put("amen", amen.hashCode());
      dictionary.put("mean", amen.hashCode());
      dictionary.put("name", amen.hashCode());
            String anew="anew";
      dictionary.put(anew, anew.hashCode());
      dictionary.put("wane", anew.hashCode());
      dictionary.put("wean", anew.hashCode());
            String angel="angel";
      dictionary.put(ales, angel.hashCode());
      dictionary.put("angle", angel.hashCode());
      dictionary.put("glean", angel.hashCode());
       String antler="antler";
      dictionary.put(antler, antler.hashCode());
      dictionary.put("learnt", antler.hashCode());
      dictionary.put("rental", antler.hashCode());
       String apt="apt";
      dictionary.put(apt, apt.hashCode());
      dictionary.put("pat", apt.hashCode());
      dictionary.put("tap", apt.hashCode());

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
public boolean isAnagram(String str){
    return buildDictionary1().containsKey(str);
}
    public static void main(String[] args) {
        double[] ts={-11,-2,-1,-2,1,3-5,-8, -18};
//  System.out.print(closerToZero(ts));
        String word="bead";
        System.out.println(buildDictionary1().get(word));
        System.out.println(buildDictionarySource().get(buildDictionary1().get(word)));
    }
}
