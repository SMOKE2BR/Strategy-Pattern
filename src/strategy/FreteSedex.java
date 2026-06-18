package strategy;

public class FreteSedex implements Frete {
    @Override
    public double calcular(double peso) {
        return peso * 10.0;
    }

    @Override
    public String descricao() {
        return "Frete via Sedex";
    }
}
