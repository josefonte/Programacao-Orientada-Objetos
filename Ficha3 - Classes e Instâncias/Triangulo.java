import javax.swing.plaf.basic.BasicTreeUI;

public class Triangulo {

    private Ponto ponto1;
    private Ponto ponto2;
    private Ponto ponto3;

    public Triangulo(){
        this.ponto1 = new Ponto();
        this.ponto2 = new Ponto();
        this.ponto3 = new Ponto();
    }

    public Triangulo(Ponto ponto1, Ponto ponto2 , Ponto ponto3){
        this.ponto1 = ponto1.clone();
        this.ponto2 = ponto2.clone();
        this.ponto3 = ponto3.clone();
    }

    public Triangulo(Triangulo umTrig){
        this.ponto1 = umTrig.getPonto1();
        this.ponto2 = umTrig.getPonto2();
        this.ponto3 = umTrig.getPonto3();
    }

    public Ponto getPonto1(){
        return this.ponto1.clone();
    }

    public Ponto getPonto2(){
        return this.ponto2.clone();
    }

    public Ponto getPonto3(){
        return this.ponto3.clone();
    }


    public void setPonto1(int x, int y){
        this.ponto1.setX(x);
        this.ponto1.setY(y);
    }
    public void setPonto2(int x, int y){
        this.ponto2.setX(x);
        this.ponto2.setY(y);
    }
    public void setPonto3(int x, int y){
        this.ponto3.setX(x);
        this.ponto3.setY(y);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || this.getClass()!=o.getClass()) return false;
        Triangulo trig = (Triangulo) o;
        return (this.ponto1.equals(trig.getPonto1()) &&
                this.ponto2.equals(trig.getPonto2()) &&
                this.ponto3.equals(trig.getPonto3()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n### Triangulo ###")
                .append("\nPonto1 (").append(this.ponto1.getX()).append(",").append(this.ponto1.getY()).append(")")
                .append("\nPonto2 (").append(this.ponto2.getX()).append(",").append(this.ponto2.getY()).append(")")
                .append("\nPonto3 (").append(this.ponto3.getX()).append(",").append(this.ponto3.getY()).append(")");
        return sb.toString();
    }

    public Triangulo clone(){
        return new Triangulo(this);
    }

    public double calculaAreaTriangulo(){
        double d12 = this.ponto1.distancia(ponto2);
        double d13 = this.ponto1.distancia(ponto3);
        double d23 =this.ponto2.distancia(ponto3);
        //Heron's formula
        double s = (d12 + d13 + d23)/2;
        return Math.sqrt(s*(s-d12)*(s-d13)*(s-d23));
    }

    public double calculaPerimetroTriangulo(){
        double d12 = this.ponto1.distancia(ponto2);
        double d13 = this.ponto1.distancia(ponto3);
        double d23 = this.ponto2.distancia(ponto3);
        return d12 + d13 + d23;
    }

    public double calculaAlturaTriangulo(){
        return this.MaxY() - this.MinY();
    }

    public double MinY(){
        double Y1 = this.getPonto1().getY();
        double Y2 = this.getPonto2().getY();
        double Y3 = this.getPonto3().getY();

        return Math.min(Math.min(Y1,Y2),Y3);
    }

    public double MaxY(){
        double Y1 = this.getPonto1().getY();
        double Y2 = this.getPonto2().getY();
        double Y3 = this.getPonto3().getY();

        return Math.max(Math.max(Y1,Y2),Y3);
    }
}
