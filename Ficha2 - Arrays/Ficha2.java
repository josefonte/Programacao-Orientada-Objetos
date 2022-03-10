import java.time.LocalDate;
import java.util.Scanner;

public class Ficha2 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("### FICHA 2 - ARRAYS ###\n Exercício (1-2-3-4)");
        int ex = scanner.nextInt();

        switch (ex){

            case(1):
                Ex1 f = new Ex1();

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
                break;

            case (2):
                Scanner scan = new Scanner(System.in);
                Ex1 ex1 = new Ex1();
                Ex2 ex2 = new Ex2();

                System.out.print("\n#### EX_2 ####");

                int[][] notasTurma = {  {17,15,12,11,16},
                        {19,18,19,7,20},
                        {13,14,15,3,16},
                        {10,19,12,8,11},
                        {13,15,13,6,18}};

                int[] notas = {2,12,20,9,13};

                //2.a) ler as notas dos alunos e actualiza o array da pauta;
                System.out.println("\nPauta Original");
                ex2.printPauta(notasTurma);

                System.out.print("\nAluno a alterar: 2 | Notas: ");
                ex1.printlista(notas);

                ex2.atualizaPauta(notasTurma, 2, notas);

                System.out.println("\n\nPauta atualizada");
                ex2.printPauta(notasTurma);

                // 2.b) calcula a soma de uma UC (coluna)
                System.out.print("\nSoma da UC nº 3: " + ex2.somaUCS(notasTurma, 3));

                //2.c) calcula a média de um aluno
                System.out.print("\nMédia do aluno nº 3: " + (float)ex2.mediaAluno(notasTurma, 3));

                //2.d) calcula a média de uma UC
                System.out.print("\nMédia da UC nº 3: " + (float)ex2.somaUCS(notasTurma, 3)/5);

                //2.e) calcula a nota mais alta de todos aluno
                System.out.print("\nNota mais alta: " + ex2.maxUC(notasTurma));

                //2.f) calcula a nota mais baixa de todos aluno
                System.out.print("\nNota mais baixa: " + ex2.minUC(notasTurma));

                //2.g) devolve array com notas acima de certo valor;
                System.out.print("\nArray de valores acima de que valor? : ");
                int valor1 = scan.nextInt();
                System.out.print("Array de valores acima do valor " + valor1 + " | " );
                ex1.printlista(ex2.arrayAbove(notasTurma, valor1));

                //2.h) não entendi puts?!?!
                //2.i) indice da UC com média mais alta
                float med;
                int ind;
                System.out.print("\n\nUC com média mais alta: UC-");
                ex2.UCmediaalta(notasTurma);


                break;

            case(3):
                Ex3 dateArray = new Ex3(5);

                dateArray.insereData(LocalDate.of(2020,2,29));
                dateArray.insereData(LocalDate.of(2019,12,9));
                dateArray.insereData(LocalDate.of(2010,7,18));
                dateArray.insereData(LocalDate.of(2001,4,13));
                dateArray.insereData(LocalDate.of(2010,3,23));

                LocalDate datamaisprox = dateArray.datamaisproxima(LocalDate.of(2012,12,12));
                System.out.println("A data mais próxima de 2012-12-12 é " + datamaisprox.toString());

                System.out.println("Lista de Datas");
                System.out.println(dateArray.toString());
                break;

            case(4):
                Ex1 f1 = new Ex1();
                Ex4 ex4 = new Ex4();

                int[] array4 = {9,2,3,5,1,6,4,8,7,0};

                System.out.print("\nArray é ");
                f1.printlista(array4);

                System.out.print("\nArray Organizado é ");
                f1.printlista(ex4.ordenaArrayCrescente(array4));

                System.out.println("\nBinary Search do Array\nValor? (1<->9)");
                int valor4 = scanner.nextInt();
                System.out.println( "Array[" + ex4.binarySearch(array4,valor4) + "] = "+ valor4);

                break;

        }





    }
}
