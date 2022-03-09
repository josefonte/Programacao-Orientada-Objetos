import java.util.Scanner;

public class Ficha2_Ex1 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ficha2AllMethods f = new Ficha2AllMethods();
        int valor;


        System.out.println("EX1: Qual o tamanho do Array?");
        valor = scanner.nextInt();

        int[] array = new int[valor];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "]: ");
            valor = scanner.nextInt();
            array[i] = valor;
        }

        //1.a - ler inteiros para um array e depois determinar o valor mínimo desse array.
        int minimo = f.encontraMinimo(array);
        System.out.println("#### EX 1_A ####\nMínimo: " + minimo);


        //1.b ler um array de inteiros e dois índices e determinar o array com os valores entre esses índices.
        System.out.println("\n#### EX 1_B ####");

        int bg, end;

        System.out.println("Qual o índice inicial");
        bg = scanner.nextInt();
        System.out.println("Qual o índice final");
        end = scanner.nextInt();

        int[] arrayaux = f.sublista(array, bg, end);

        System.out.print("Lista Original :");
        f.printlista(array);

        System.out.print("\nSublista :");
        f.printlista(arrayaux);


        //1.c ler dois arrays de inteiros e determinar o array com os elementos comuns aos dois arrays.

        System.out.print("\n\n#### EX 1_C ####");

        int[] array1 = {12,34,532,12,5423,23,12,43,12,31};
        int[] array2 = {3232,32,532,12,34,24,56,43};

        int[] arraycomuns= f.comuns(array2,array1);

        System.out.print("\nArray1: ");
        f.printlista(array1);
        System.out.print("\nArray2: ");
        f.printlista(array2);

        System.out.print("\nComuns: [");
        for(int i=0;i< arraycomuns.length-1; i++)
            if (arraycomuns[i+1]==0) {System.out.print(arraycomuns[i]+"]"); break;}
            else System.out.print(arraycomuns[i]+",");
    }
}
