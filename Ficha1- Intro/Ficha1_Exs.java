public class Ficha1_Exs {

    public double celsiusparaFarenheit(double graus){
        return graus*1.8 + 32;
    }

    public int maximoNumeros(int a, int b){
        return Math.max(a,b);
    }

    public String criaDescricaoConta(String nome, double saldo){
        return "Nome: " + nome + ", saldo: " + saldo;
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        return valor*taxaConversao;
    }

    public void ex5(int a, int b){
        float media = ((float)(a+b))/2;
        if(a>b)
            System.out.println("A: " +a+ " B: " +b+ "Média: "+ media);
        else
            System.out.println("B: " +b+ " A: " +a+ "Média: "+ media);
    }

    public long factorial(int num){
        int sum=1;
        for (int i=0; i<num; i++){
            sum*=num-i;
        }
        return sum;
    }

    public long tempoGasto(){

        long startTime = System.nanoTime();
        long fat = factorial(5000);
        long stopTime = System.nanoTime();

        long elapsedTime = stopTime - startTime ;

        return elapsedTime;
    }

}
