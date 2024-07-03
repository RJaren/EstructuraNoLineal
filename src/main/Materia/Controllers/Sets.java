package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class Sets {
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        TreeSetOnComparador();
    }
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("HashSet: " + conjunto);
        //Eliminar elemento
        conjunto.remove("Banana");
        System.out.println("HashSet después de eliminar: " + conjunto);
        conjunto.remove("Uvas");
        conjunto.remove("Piña");
        System.out.println("Hashset despues de eliminar: " + conjunto);


        //Verificar si existe un elemento
        Boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("HashSet contiene 'Naranja' ? " + contieneNaranja);

        //Obtener el tamño del conjunto
        int tamano = conjunto.size();
        System.out.println("Tamaño del HashSet: " + tamano);

    
    }
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("linkedHashSet: " +conjunto);
    }
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("TreeSet: " +conjunto);
    }
    public void TreeSetOnComparador(){
        Comparator<String> comparadorOrdenInverso = new Comparator<String>(){
        @Override
        public int compare(String s1, String s2){
            return s2.compareTo(s1);
        }
    };
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("TreeSet: " +conjunto);
        }
        
    }

