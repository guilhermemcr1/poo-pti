public class Ponto {

    private int x,y;

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Ponto(){
        this.x = 0;
        this.y = 0;      
    }

    public boolean verificaIgual(Ponto ponto){
        if(this.x == ponto.x && this.y == ponto.y){
            return true;
        } else{
            return false;
        }
    }

    public double calculaDistancia(Ponto ponto){
        int distanciaX = this.x - ponto.x;
        int distanciaY = this.y - ponto.y;
        return Math.sqrt((distanciaX * distanciaX) + (distanciaY * distanciaY));
    }

}