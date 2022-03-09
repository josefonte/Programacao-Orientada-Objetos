import java.util.Scanner;

public class TestePrograma{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ficha1_Exs f1= new Ficha1_Exs();


        System.out.println("Exercício(1-7): ");
        int ex = sc.nextInt();

        switch (ex) {
            case (1):
                System.out.println("Conversão Celsius->Farenheit:");
                System.out.println("Celsius: ");
                double graus = sc.nextInt();
                System.out.println("Farenheit: " + f1.celsiusparaFarenheit(graus));
                break;

            case (2):
                System.out.println("Max entre dois números:");
                System.out.println("A: ");
                int a = sc.nextInt();
                System.out.println("B: ");
                int b = sc.nextInt();
                System.out.println("Max:" + f1.maximoNumeros(a, b));
                break;

            case (3):
                System.out.println("Info da Conta:");
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Saldo: ");
                double saldo = sc.nextDouble();
                f1.criaDescricaoConta(nome, saldo);
                break;

            case (4):
                System.out.println("Conversão Euro -> Libra");
                System.out.println("Euro: ");
                double euros = sc.nextDouble();
                System.out.println("Taxa de Conversão: ");
                double taxa = sc.nextDouble();
                f1.eurosParaLibras(euros, taxa);

            case (5):
                System.out.println("Ex5:");
                System.out.println("Número a: ");
                int a1 = sc.nextInt();
                System.out.println("Número b: ");
                int b1 = sc.nextInt();
                f1.ex5(a1, b1);
                break;

            case (6):
                System.out.println("Fatorial de N");
                System.out.println(f1.factorial(Integer.parseInt(args[0])));
                break;

            case (7):
                System.out.println("Tempo Gasto na computação fatorial(5000): " + f1.tempoGasto() + " ns");
                break;

        }
    }
}
