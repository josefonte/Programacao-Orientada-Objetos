import java.util.Arrays;

public class Ficha2AllMethods {

    //############################# Ex 1 ############################

    public void printlista(int[] lista){
        System.out.print("[");
        for(int i=0;i< lista.length-1; i++) System.out.print(lista[i]+",");
        System.out.print(lista[lista.length-1] + "]");
    }

    public int encontraMinimo(int[] array){
        int min= array[0];
        for(int elem : array) {
            if(elem < min) min=elem;
        }
        return min;
    }

    public int[] sublista(int[] array, int bg, int end){
        int[] arrayaux= new int[end-bg+1];

        System.arraycopy(array, bg, arrayaux, 0, end - bg+1);

        return arrayaux;

    }

    public boolean notinList(int[] array, int value){
        for(int elem:array)
            if(value==elem) return false;

        return true;
    }


    public int[] comuns(int[] array1 , int[] array2) {

        int min = Math.min(array1.length, array2.length);
        int i=0;
        int[] aux = new int[min];

        for (int elem1 : array1)
            for (int elem2 : array2)
                if (elem1 == elem2 && notinList(aux, elem2)) {
                    aux[i] = elem2;
                    i++;
                }

        return aux;
    }

    //#############################Ex 2 ############################

    public void printPauta (int[][] notasTurma){
        for(int i=0;i< notasTurma.length; i++) {
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
            minAluno = encontraMinimo(notasTurma[aluno]);
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
            //System.out.println(i + " " + med);
            if (max < med) {
                max = med;
                ind=i;
            }
        }
        System.out.print(ind + " | "+ max);
    }

   /* public int[] string2Array( String[] strNotas){
        int size = strNotas.length;
        int[] list_Notas = new int [size];
        for(int i=0; i<size; i++) {
            list_Notas[i] = Integer.parseInt(strNotas[i]);
        }
        return list_Notas;
   */


}

