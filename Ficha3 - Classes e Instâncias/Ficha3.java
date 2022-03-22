import java.util.ArrayList;
import java.util.Scanner;

public class Ficha3 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("### FICHA 3 - CLASSES E INSTÂNCIAS ###\n Exercício (1-7-8-9)");
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
            case(8):

                System.out.println("Ex8 : Encomendas");
                System.out.print("Nome do Cliente: ");
                String clean = sc.nextLine();
                String n_cliente = sc.nextLine();
                System.out.print("Número Fiscal: ");
                int n_fiscal = sc.nextInt();
                System.out.print("Morada do Cliente: ");
                clean = sc.nextLine();
                String  morada = sc.nextLine();
                System.out.print("Número da Encomenda: ");
                int n_enc = sc.nextInt();
                System.out.print("Data da Encomenda: ");
                clean = sc.nextLine();
                String data = sc.nextLine();

                LinhadeEncomenda line1 = new LinhadeEncomenda("Caixa 1019", "dimensões 10x19 cm", 1, 100, 23, 30);
                LinhadeEncomenda line2 = new LinhadeEncomenda("Caixa 2040", "dimensões 20x40 cm", 2, 200, 23, 33);
                LinhadeEncomenda line3 = new LinhadeEncomenda("Caixa 3050", "dimensões 30x50 cm", 3, 300, 23, 35);
                LinhadeEncomenda line4 = new LinhadeEncomenda("Caixa 4050", "dimensões 40x50 cm", 4, 50, 23, 20);

                ArrayList<LinhadeEncomenda> enc_lines = new ArrayList<>();

                enc_lines.add(line1.clone());
                enc_lines.add(line2.clone());
                enc_lines.add(line3.clone());

                Encomenda enc8_1 = new Encomenda(n_cliente,n_fiscal,morada,n_enc,data,enc_lines);
                Encomenda enc8_2 = new Encomenda("Rogério",123456789,"Rua Sesamo",5,"25/12/2020",enc_lines);

                System.out.println(enc8_1.toString());
                System.out.println(enc8_2.toString());

                System.out.println("Enc1 - nº total de produtos: "+enc8_1.numeroTotalProdutos());
                System.out.println("Enc1 - valor total: "+enc8_1.calculaValorTotal());
                System.out.println("Enc1 - valor de desconto: "+enc8_1.calculaValorDesconto());
                System.out.println("\nExiste produto caixa 1019? "+enc8_1.existeProdutoEncomenda("Caixa 1019"));
                System.out.println("\nAdiciona line4"+ line4.toString());
                enc8_1.adicionaLinha(line4);
                System.out.println("\nRemove line1"+ line1.toString());
                enc8_1.removeProduto("Caixa 1019");

                System.out.println(enc8_1.toString());

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
