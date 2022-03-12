public class LinhadeEncomenda {

    private String referencia;
    private String descricao;
    private float precoBruto;
    private int quantidade;
    private int imposto;
    private int desconto;

    public LinhadeEncomenda(){
        this.referencia = "";
        this.descricao = "";
        this.precoBruto = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public LinhadeEncomenda(String referencia, String descricao, float precoBruto, int quantidade, int imposto, int desconto){
        this.referencia = referencia;
        this.descricao = descricao;
        this.precoBruto = precoBruto;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhadeEncomenda(LinhadeEncomenda enc){
        this.referencia = enc.getReferencia();
        this.descricao = enc.getDescricao();
        this.precoBruto = enc.getPrecoBruto();
        this.quantidade = enc.getQuantidade();
        this.imposto = enc.getImposto();
        this.desconto = enc.getDesconto();
    }

    public String getReferencia() {
        return this.referencia;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public float getPrecoBruto() {
        return this.precoBruto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int getImposto() {
        return this.imposto;
    }

    public int getDesconto() {
        return this.desconto;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoBruto(float precoBruto) {
        this.precoBruto = precoBruto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public LinhadeEncomenda clone(){
        return new LinhadeEncomenda(this);
    }
    /* toString - chapador de massa
    public String toString() {
        return "LinhadeEncomenda" +
                "\nreferência='" + this.referencia +
                "\ndescricao='" + this.descricao +
                "\nprecoBruto=" + this.precoBruto +
                "\nquantidade=" + this.quantidade +
                "\nimposto=" + this.imposto +
                "\ndesconto=" + this.desconto;
    }*/

    //toString melhor
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("### Linha de Encomenda ###")
                .append("\nReferência: ").append(this.referencia)
                .append("\nDescrição: ").append(this.descricao)
                .append("\nPreço Bruto: ").append(this.precoBruto)
                .append("\nQuantidade: ").append(this.quantidade)
                .append("\nImposto: ").append(this.imposto)
                .append("\nDesconto: ").append(this.desconto);

        return sb.toString(); //toString da lib to String
    }

    public boolean equals(Object o){
        if (this == o)  return true;
        if (o==null || this.getClass()!=o.getClass()) return false;
        LinhadeEncomenda enc = (LinhadeEncomenda) o;
        return (this.referencia.equals(enc.getReferencia()) && //equals da lib string
                this.descricao.equals(enc.getDescricao()) &&
                this.precoBruto == enc.getPrecoBruto() &&
                this.quantidade == enc.getQuantidade() &&
                this.imposto == enc.getImposto() &&
                this.desconto == enc.getDesconto());
    }

    public double calculaValorLinhaEnc(){
        return (double) (this.quantidade * this.precoBruto*(1-(((float)this.desconto)/100)) * (1+ ((float)this.imposto)/100));
    }

    public double calculaValorDesconto(){
        return this.precoBruto * ((float)this.desconto)/100;
    }

}

