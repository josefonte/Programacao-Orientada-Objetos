public class Ex1 {

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
}
