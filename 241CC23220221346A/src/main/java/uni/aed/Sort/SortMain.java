package uni.aed.Sort;

import java.util.Random;

public class SortMain {
    static Sort st = new Sort();
    public static void main(String[] args){
        carga_aleatoria(5000);
        visualizar();
        Insertion_Sort();
        System.out.println();
        Selection_Wu_Sort();
        System.out.println();
        Bubble_Sort();
        System.out.println();
        visualizar();
    }

    public static void carga(){
        Integer[] X = {5, 14, 24, 39, 43, 65, 84, 45};
        st.setY(X);
    }
    
    public static void carga_aleatoria(int n){
        Integer[] X = new Integer[n];
        Random rd = new Random();
        for(int i = 0; i < n; ++i){
            X[i] = rd.nextInt(0, 5000);
        }
        st.setY(X);
    }
    
    public static void visualizar(){
        System.out.println("El array origen contiene los siguientes elementos:");
        System.out.println(st + "\n");
    }
    
    public static void Insertion_Sort(){
        for(Integer y : st.Insertion_Sort()){
            System.out.print(y + " ");
        }
        System.out.println("Insertion_Sort: nComp = " + st.getnComp() + " nInt = " + st.getnInt() + " tEjec = " + st.gettEjec());
    }
    
    public static void Selection_Wu_Sort(){
        for(Integer y : st.Selection_Wu_Sort()){
            System.out.print(y + " ");
        }
        System.out.println("Selection_Wu_Sort: nComp = " + st.getnComp() + " nInt = " + st.getnInt() + " tEjec = " + st.gettEjec());
    }
    
    public static void Bubble_Sort(){
        for(Integer y : st.Bubble_Sort()){
            System.out.print(y + " ");
        }
        System.out.println("Bubble_Sort: nComp = " + st.getnComp() + " nInt = " + st.getnInt() + " tEjec = " + st.gettEjec());
    }
}
