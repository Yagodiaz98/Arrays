import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        La idea de esta actividad es crear un array al que se le introduzcan los valores por teclado.
        Posteriormente el programa deberá reconocer cuál es el número más grande y cual es mas pequeño y
        posteriormente revertir el orden del array.
        */
        int arraySize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor índica de que tamaño deseas que sea el Array");
        arraySize = sc.nextInt();
        int array[] = new int[arraySize];

        //Insertamos en cada posicion del array un numero por teclado
        for(int i = 0; i<=arraySize-1;i++){
            System.out.println("Inserta el numero que irá en la posición " + i + " del Array.");
            array[i] = sc.nextInt();
        };

        System.out.println("El Array resultante es el siguiente:");
        System.out.println(Arrays.toString(array));

        minMaxArray(array);
        reverseArray(array);
    }
    public static int[] minMaxArray(int[] a){
        int aLength = a.length;
        int min = a[0];
        int max = a[0];
        for(int e : a){
            if (e<min){
                min = e;
            }else if (e>max){
                max = e;
            }
        }
        int[] b = {min,max};
        System.out.println("Los números min/max son: "+Arrays.toString(b));
        return b;
    }

    public static int[] reverseArray(int[] a){
        int[] b = new int[a.length];
        for(int i = 0; i<a.length; i++){
            b[a.length-1-i]= a[i];
        }
        System.out.println("El array revertido resultante es: "+Arrays.toString(b));
        return b;
    }
}
