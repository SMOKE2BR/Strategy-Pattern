package strategy;

public class FreteMotoboy implements Frete {
    @Override
    public double calcular(double peso) {
        return 20.0;
    }

    @Override
    public String descricao() {
        return "Frete via Motoboy";
    }
}
