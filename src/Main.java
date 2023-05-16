public class Main {
    public static void main(String[] args) throws Exception {

        Ponto primeiroPonto = new Ponto(5, 2);
        Ponto segundoPonto = new Ponto(1, 3);

        System.out.println("Os pontos sao iguais? " +primeiroPonto.verificaIgual(segundoPonto));
        
        double distanciaPonto = primeiroPonto.calculaDistancia(segundoPonto);
        System.out.println("A distância entre os pontos é: " + distanciaPonto);


    }
}
