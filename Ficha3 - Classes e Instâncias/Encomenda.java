import java.util.ArrayList;
import java.util.List;

public class Encomenda {

    private String cliente;
    private int n_fiscal;
    private String morada;
    private int n_enc;
    private String data_enc;
    ArrayList<LinhadeEncomenda> encomendas;

    public Encomenda(){
        this.cliente = "";
        this.n_fiscal = 0;
        this.morada = "";
        this.n_enc = 0;
        this.data_enc = "";
        this.encomendas = new ArrayList<LinhadeEncomenda>();
    }

    public Encomenda(String new_cliente,
                    int new_n_fiscal,
                    String new_morada,
                    int new_n_enc,
                    String new_data_enc,
                    List<LinhadeEncomenda> new_enc){

        this.cliente = new_cliente;
        this.n_fiscal = new_n_fiscal;
        this.morada = new_morada;
        this.n_enc = new_n_enc;
        this.data_enc = new_data_enc;

        this.encomendas = new ArrayList<>();
        for(LinhadeEncomenda line : new_enc){
            encomendas.add(line.clone());
        }
    }

    public Encomenda(Encomenda enc){
        this.cliente = this.getCliente();
        this.n_fiscal = this.getN_fiscal();
        this.morada = this.getMorada();
        this.n_enc = this.getN_enc();
        this.data_enc = this.getData_enc();

        this.encomendas = new ArrayList<>();
        for(LinhadeEncomenda line : enc.getEncomendas()){
            encomendas.add(line);
        }
    }

    public String getCliente() {
        return this.cliente;
    }

    public int getN_fiscal() {
        return this.n_fiscal;
    }

    public String getMorada() {
        return this.morada;
    }

    public int getN_enc(){
        return this.n_enc;
    }

    public String getData_enc(){
        return this.data_enc;
    }

    public ArrayList<LinhadeEncomenda> getEncomendas(){
        ArrayList<LinhadeEncomenda> encomenda = new ArrayList<>();
        for(LinhadeEncomenda line : this.encomendas){
            encomenda.add(line.clone());
        }
        return encomenda;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setN_fiscal(int n_fiscal) {
        this.n_fiscal = n_fiscal;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setN_enc(int n_enc) {
        this.n_enc = n_enc;
    }

    public void setData_enc(String data_enc) {
        this.data_enc = data_enc;
    }

    public void setEncomendas(ArrayList<LinhadeEncomenda> enc) {
        this.encomendas = enc;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n##Encomenda##")
                .append("\nCliente: ").append(this.getCliente())
                .append("\nNúmero fiscal: ").append(this.getN_fiscal())
                .append("\nMorada: ").append(this.getMorada())
                .append("\nNúmero Encomendas: ").append((this.getN_enc()))
                .append("\nData Encomenda: ").append(this.getData_enc())
                .append("\nEncomendas: ").append(this.getEncomendas().toString());

        return sb.toString();
    }

    public boolean equals(Object o){

        if (this==o) return true;
        if ((o==null) || this.getClass()!=o.getClass()) return false;

        Encomenda enc = (Encomenda) o;
        return (    (this.cliente.equals(enc.getCliente()) ) ||
                    (this.n_fiscal == enc.getN_fiscal()) ||
                    (this.morada.equals(enc.getMorada())) ||
                    (this.n_enc == enc.getN_enc()) ||
                    (this.data_enc.equals(enc.getData_enc())) ||
                    (this.encomendas.equals(enc.getEncomendas()))
                );
    }

    public Encomenda clone(){
        return new Encomenda(this);
    }

    public double calculaValorTotal(){
        double sum=0;
        for (LinhadeEncomenda line : this.getEncomendas()){
            sum+=line.calculaValorLinhaEnc();
        }
        return sum;
    }

    public double calculaValorDesconto(){
        double sum=0;
        for (LinhadeEncomenda line : this.getEncomendas()){
            sum += line.calculaValorDesconto() * line.getQuantidade();
        }
        return sum;
    }

    public int numeroTotalProdutos(){
        int sum=0;
        for (LinhadeEncomenda line : this.getEncomendas()){
            sum+=line.getQuantidade();
        }
        return sum;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for (LinhadeEncomenda line : this.getEncomendas()){
            if (line.getReferencia().equals(refProduto)) return true;
        }
        return false;
    }

    public void adicionaLinha(LinhadeEncomenda linha){
        this.encomendas.add(linha.clone());
    }

    public void removeProduto(String codProd){
        int i=0;
        for (LinhadeEncomenda line : this.getEncomendas()){
            if (line.getReferencia().equals(codProd)) this.encomendas.remove(i);
            i++;
        }
    }

}
