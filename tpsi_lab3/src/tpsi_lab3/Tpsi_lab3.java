/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi_lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Kamil
 */
public class Tpsi_lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //zadanie 1
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");
        
        for(String dzien : zbiorDni) {
             System.out.println(dzien);
        }
        
        //w przypadku użycia HashSet, elementy nie są sortowane -
        
        //TreeSet sortuje elementy rosnąco -> alfabetycznie w przypadku stringów
        //jednak najprawdobniej z powodu lokalizacji, środa wyświetlana jest na
        //końcu
        
        //to daje odpowiedź na drugie pytanie - w zależności od tego, czy zależy
        //nam na pobraniu elementów w określonej kolejności
        
        //nie wymagało to żadnych zmian w kodzie oprócz zmiany Hash na Tree
        
        
        //zadanie 2
        Student s1 = new Student("Jan", "Kowalski", "32");
        Student s2 = new Student("Hermenegilda", "Nowak", "32");
        Student s3 = new Student("Kamil", "Śpiewak", "33");
        Student s4 = new Student("sss", "ddd", "33");
        Student s5 = new Student("qqqq", "www", "34");
        Student s6 = new Student("aa", "ww", "34");
        Student s7 = new Student("ss", "ee", "35");
        Student s8 = new Student("dd", "rr", "35");
        
        Teacher t1 = new Teacher("Bjarne", "Stroustrup", "Programowanie obiektowe");
        Teacher t2 = new Teacher("ccc", "ddd", "WDSI");
        Teacher t3 = new Teacher("aaa", "bbb", "MPIS");
        Teacher t4 = new Teacher("qqqq", "baaabb", "ASK");
        
        Map<String,Teacher> przedmiotProwadzacy = new HashMap<>();
        przedmiotProwadzacy.put("programowanie obiektowe",t1);
        przedmiotProwadzacy.put("WDSI",t2);
        przedmiotProwadzacy.put("MPIS",t3);
        przedmiotProwadzacy.put("ASK",t4);
        
        System.out.println("Nauczyciel prowadzacy programowanie obiektowe to: "+przedmiotProwadzacy.get("programowanie obiektowe"));
        
        List<Student> grupa32 = new ArrayList<>();
        List<Student> grupa33 = new ArrayList<>();
        List<Student> grupa34 = new ArrayList<>();
        List<Student> grupa35 = new ArrayList<>();
        grupa32.add(s1);
        grupa32.add(s2);
        grupa33.add(s3);
        grupa33.add(s4);
        grupa34.add(s5);
        grupa34.add(s6);
        grupa35.add(s7);
        grupa35.add(s8);
        
        Map<Integer,List> grupyStudentow = new TreeMap<>();
        grupyStudentow.put(32, grupa32);
        grupyStudentow.put(33, grupa33);
        grupyStudentow.put(34, grupa34);
        grupyStudentow.put(35, grupa35);
        
        List<Student> tempGroup = grupyStudentow.get(32);
        System.out.println("Uczniowie w grupie 32");
        for(Student student : tempGroup) {
            System.out.println(student.getFirstName()+" "+student.getLastName());
           }
        
        //zadanie 3
        List<Product> produkty = new ArrayList();
        Map<Integer,Product> mapaPoID = new TreeMap();
        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();

                while(s!=null) {
                    
                    String[] pola = s.split(";");
                    produkty.add(new Product(pola[0],pola[1],Double.parseDouble(pola[3]),pola[2]));
                    
                     s = in.readLine();
                }
        } catch (IOException ex) {
            ex.printStackTrace();
            }
        
        //test 1
        for(Product p : produkty){
            System.out.println(p.id+"\t"+ p.name+"\t"+p.category+"\t"+p.price);
        }
        
        Map<Integer,Product> mapID = new TreeMap();
        for(Product prod : produkty){
            mapID.put(Integer.parseInt(prod.id), prod);
        }
        
        //test 2
        System.out.println(mapID.get(101).name);
        
        
        }
}
