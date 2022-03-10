import java.util.Scanner;

public class Ficha3 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("### FICHA 3 - CLASSES E INSTÂNCIAS ###\n Exercício (1-7-9)");
        int ex = sc.nextInt();

        switch (ex){

            case(1):

                System.out.println("Ex1 : Circulo");
                System.out.print("X: ");
                int x = sc.nextInt();
                System.out.print("Y: ");
                int y = sc.nextInt();
                System.out.print("Raio: ");
                int raio = sc.nextInt();

                Circulo c1 = new Circulo();
                Circulo c2 = new Circulo(x+1,y+1,raio+1);
                Circulo c3 = new Circulo(c2);

                c1.setX(x);
                c1.setY(y);
                c1.setRaio(raio);

                System.out.println("\nX: " + c1.getX());
                System.out.println("Y: " + c1.getY());
                System.out.println("Raio: " + c1.getRaio());

                Circulo c4 = c1.clone();
                System.out.println("\nC1 " + c1.toString());
                System.out.println("C2 " + c2.toString());

                System.out.println("\nEquals c1 vs c2? " + c1.equals(c2));
                System.out.println("\nArea c1: " + c1.calculaArea());
                System.out.println("Perimetro c1: " + c1.calculaPerimetro());

                break;

            case(7):
                System.out.println("Ex7 : Linha de Encomenda");
                System.out.print("Referência: ");
                String ref0 = sc.nextLine();
                String ref = sc.nextLine();
                System.out.print("Descrição: ");
                String des = sc.nextLine();
                System.out.print("Preço Bruto: ");
                float  preco = sc.nextFloat();
                System.out.print("Quantidade: ");
                int quant = sc.nextInt();

                int imposto;
                do {
                    System.out.print("Imposto (0%-100% //sem input de %): ");
                    imposto = sc.nextInt();
                }
                while (imposto>100 || imposto<0);


                int desconto;
                do{
                    System.out.print("Desconto (0%-100% //sem input de %): ");
                    desconto = sc.nextInt();
                }
                while(desconto>100 || desconto<0);

                LinhadeEncomenda enc = new LinhadeEncomenda(ref, des,preco, quant, imposto, desconto);

                System.out.println("\n " + enc.toString());
                LinhadeEncomenda enc2 = enc.clone();
                System.out.println("\nEquals Enc1 vs enc2: " + enc.equals(enc2));

                System.out.println("Valor de Desconto: " + enc.calculaValorDesconto());
                System.out.println("Valor da Linha: " + enc.calculaValorLinhaEnc());
                break;

            case(9):
                System.out.println("Ex9 : Triangulo");
                System.out.println("[Ponto1]");
                System.out.print("X = ");
                int x1 = sc.nextInt();
                System.out.print("Y = ");
                int y1 = sc.nextInt();
                Ponto ponto1 = new Ponto(x1,y1);

                System.out.println("[Ponto2]");
                System.out.print("X = ");
                int x2 = sc.nextInt();
                System.out.print("Y = ");
                int y2 = sc.nextInt();
                Ponto ponto2 = new Ponto(x2,y2);

                System.out.println("[Ponto3]");
                System.out.print("X = ");
                int x3 = sc.nextInt();
                System.out.print("Y = ");
                int y3 = sc.nextInt();
                Ponto ponto3 = new Ponto(x3,y3);

                Triangulo trig = new Triangulo(ponto1,ponto2,ponto3);

                System.out.println(trig.toString());
                System.out.println("\n### Exercícios ###\nÁrea Triângulo= " + trig.calculaAreaTriangulo());
                System.out.println("Perímetro Triângulo= " + trig.calculaPerimetroTriangulo());
                System.out.println("Altura Triângulo= " + trig.calculaAlturaTriangulo());

        }
    }
}
