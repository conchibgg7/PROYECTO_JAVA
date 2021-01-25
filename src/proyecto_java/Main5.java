
package proyecto_java;


public class Main5 {

    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        int a[] = new int[a1.length+a2.length];
        System.arraycopy(a1, 0, a, 0, a1.length);
        System.arraycopy(a2, 0, a, a1.length, a2.length);
    }
        
    
}
