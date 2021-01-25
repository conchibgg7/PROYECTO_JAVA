
package proyecto_java;


public class Main5 {

    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6,7, 8, 9, 10};
        System.arraycopy(a1, 0, a2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(a2[0] + " ");
        System.out.print(a2[1] + " ");
        System.out.print(a2[2] + " ");
        System.out.print(a2[3] + " ");
        System.out.print(a2[4] + " ");
    }
}
        
    

