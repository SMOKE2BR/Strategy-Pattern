package strategy;

public class Pedido {
    private Frete frete;
    private double peso;

    public Pedido(double peso) {
        this.peso = peso;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public double calcularFrete() {
        if (frete == null) {
            throw new IllegalStateException("Nenhum frete definido!");
        }
        return frete.calcular(peso);
    }

    public String descricaoFrete() {
        if (frete == null) {
            return "Frete não definido";
        }
        return frete.descricao();
    }
}
