import java.util.Arrays;

public class Ex2 {

    Ex1 ex1 = new Ex1();

    public void printPauta (int[][] notasTurma){
        for(int i=0 ; i<notasTurma.length ; i++) {
            System.out.print("Aluno["+ i + "] : ");
            for (int j = 0; j < notasTurma[0].length; j++)
                System.out.print(notasTurma[i][j] + " ");
            System.out.print("\n");
        }
    }

    public void atualizaPauta (int[][] notasTurma, int aluno, int[] notas){
        System.arraycopy(notas,0, notasTurma[aluno], 0,notas.length);
    }


    public int somaUCS(int[][] notasTurma, int UC){
        int sum=0;
        for(int i=0; i< notasTurma.length; i++){
            sum+=notasTurma[i][UC];
        }
        return sum;
    }


    public int mediaAluno (int[][] notasTurma, int aluno){
        int sum=0;
        for(int notas : notasTurma[aluno]) {
            sum += notas;
        }
        return sum/5;
    }

    public int maxUC ( int[][] notasTurma){
        int max=0;
        for (int aluno=0; aluno< notasTurma[0].length ; aluno ++)
            for(int nota : notasTurma[aluno])
                if(nota>max && nota<=20) max=nota;

        return max;
    }

    public int minUC(int[][] notasTurma){

        int min=20;
        int minAluno;

        for(int aluno=0; aluno<notasTurma[0].length; aluno++) {
            minAluno = ex1.encontraMinimo(notasTurma[aluno]);
            if (min > minAluno) min = minAluno;
        }

        return min;
    }

    public int[] append2Array (int[] array, int value){
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
        return array;
    }

    public int[] arrayAbove(int[][] notasTurma, int valor) {
        int[] arr = new int[0];

        for (int aluno=0; aluno< notasTurma[0].length ; aluno ++)
            for(int nota : notasTurma[aluno])
                if(nota>valor && nota<=20) arr=append2Array(arr, nota);

        return  arr;
    }

    public void UCmediaalta(int[][] notasTurma) {
        float max=0;
        float med;
        int ind=0;

        for(int i=0; i<notasTurma[0].length; i++) {
            med = (float)somaUCS(notasTurma, i )/ 5;

            if (max < med) {
                max = med;
                ind=i;
            }
        }
        System.out.print(ind + " | "+ max);
    }
}
