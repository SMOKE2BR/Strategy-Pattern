package strategy;

public class FretePAC implements Frete {
    @Override
    public double calcular(double peso) {
        return peso * 5.0;
    }

    @Override
    public String descricao() {
        return "Frete via PAC";
    }
}
