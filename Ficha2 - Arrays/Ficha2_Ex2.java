import java.util.Scanner;

public class Ficha2_Ex2 {

    public static void main ( String[] args){
        Scanner scan = new Scanner(System.in);
        Ficha2AllMethods f = new Ficha2AllMethods();

        System.out.print("\n#### EX_2 ####");

        int[][] notasTurma = {  {17,15,12,11,16},
                                {19,18,19,7,20},
                                {13,14,15,3,16},
                                {10,19,12,8,11},
                                {13,15,13,6,18}};

        int[] notas = {2,12,20,9,13};

        //2.a) ler as notas dos alunos e actualiza o array da pauta;
        System.out.println("\nPauta Original");
        f.printPauta(notasTurma);

        System.out.print("\nAluno a alterar: 2 | Notas: ");
        f.printlista(notas);

        f.atualizaPauta(notasTurma, 2, notas);

        System.out.println("\n\nPauta atualizada");
        f.printPauta(notasTurma);

        // 2.b) calcula a soma de uma UC (coluna)
        System.out.print("\nSoma da UC nº 3: " + f.somaUCS(notasTurma, 3));

        //2.c) calcula a média de um aluno
        System.out.print("\nMédia do aluno nº 3: " + (float)f.mediaAluno(notasTurma, 3));

        //2.d) calcula a média de uma UC
        System.out.print("\nMédia da UC nº 3: " + (float)f.somaUCS(notasTurma, 3)/5);

        //2.e) calcula a nota mais alta de todos aluno
        System.out.print("\nNota mais alta: " + f.maxUC(notasTurma));

        //2.f) calcula a nota mais baixa de todos aluno
        System.out.print("\nNota mais baixa: " + f.minUC(notasTurma));

        //2.g) devolve array com notas acima de certo valor;
        System.out.print("\nArray de valores acima de que valor? : ");
        int valor = scan.nextInt();
        System.out.print("Array de valores acima do valor " + valor + " | " );
        f.printlista(f.arrayAbove(notasTurma, valor));

        //2.h) não entendi puts?!?!
        //2.i) indice da UC com média mais alta
        float med;
        int ind;
        System.out.print("\n\nUC com média mais alta: UC-");
        f.UCmediaalta(notasTurma);


    }
}
