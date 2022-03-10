import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex3 {

    private LocalDate[] array;
    private int num_elems;

    public Ex3(int size){
        this.array= new LocalDate[size];
        this.num_elems = 0;
    }

    public void insereData(LocalDate data){
        if(this.array.length>=this.num_elems)
            this.array[this.num_elems++] = data;
    }

    public LocalDate datamaisproxima (LocalDate data){ //similar ao mínimo

        long mindiff= Math.abs(ChronoUnit.DAYS.between(data, this.array[0]));
        long diff;
        LocalDate returndata = this.array[0];


        for (int i=0; i<this.array.length; i++){
            diff = Math.abs(ChronoUnit.DAYS.between(data, this.array[i]));
            if (diff<mindiff) {
                mindiff = diff;
                returndata = this.array[i];
            }
        }
        return returndata;
    }

    public String toString(){
        StringBuilder string= new StringBuilder();
        for (int i=0; i<this.num_elems; i++) {
            LocalDate data = this.array[i];
            string.append(data.toString()).append("\n");
        }
        return string.toString();
    }
}
