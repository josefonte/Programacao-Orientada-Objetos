import java.time.LocalDate;
import java.util.Scanner;

public class Ficha2_Ex3 {

    public static void main(String[] args){

        ArrayLocalDate dateArray = new ArrayLocalDate(5);
        Scanner scan = new Scanner(System.in);

        dateArray.insereData(LocalDate.of(2020,2,29));
        dateArray.insereData(LocalDate.of(2019,12,9));
        dateArray.insereData(LocalDate.of(2010,7,18));
        dateArray.insereData(LocalDate.of(2001,4,13));
        dateArray.insereData(LocalDate.of(2010,3,23));

        LocalDate datamaisprox = dateArray.datamaisproxima(LocalDate.of(2012,12,12));
        System.out.println("A data mais próxima de 2012-12-12 é " + datamaisprox.toString());

        System.out.println("Lista de Datas");
        System.out.println(dateArray.toString());
    }
}
