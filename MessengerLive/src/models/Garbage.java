/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luan Junior
 */
public class Garbage {
     public static long carregarMemoria(){
       List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
       return Runtime.getRuntime().freeMemory();
    }
     public static double limparMemoria(){
         Runtime rt = Runtime.getRuntime();
        int MB = 1_048_576;//total de bytes em 1MB
        double total = rt.maxMemory()/MB;
        
        double inicio = total - (carregarMemoria()/MB);
        
        rt.runFinalization();
        rt.gc();
        
        double fim = total - (rt.freeMemory()/MB);
        return fim;
     }
}
