public class Ponto {

    private int x;
    private int y;

    public Ponto(){
        this.x=0;
        this.y=0;
    }

    public Ponto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Ponto(Ponto umPonto){
        this.x=umPonto.getX();
        this.y=umPonto.getY();
    }

    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void deslocamento(int deltaX, int deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public void somaPonto (Ponto umPonto){
        this.x += umPonto.getX();
        this.y += umPonto.getY();
    }

    public void movePonto (int cx, int cy){
        this.x = cx;
        this.y = cy;
    }

    public boolean ePositivo () {
        return ( this . x > 0 && this . y > 0) ;
    }

    public double distancia (Ponto umPonto) {
        return Math . sqrt ( Math . pow ( this . x - umPonto . getX () , 2) +
                Math . pow ( this . y - umPonto . getY () , 2) ) ;
    }

    private boolean xIgualAy () {
        return ( Math . abs ( this . x ) == Math . abs ( this . y ) ) ;
    }

    public boolean equals ( Object o ) {
        if ( this == o ) return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) ) return false ;
         Ponto p = ( Ponto ) o ;
         return ( this . x == p . getX () && this . y == p . getY () ) ;
    }

    public String toString () {
        return "Cx = " + this . x + " - Cy = " + this . y ;
    }

    public Ponto clone(){
        return new Ponto(this);
    }


}
