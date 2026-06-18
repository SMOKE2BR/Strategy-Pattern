package strategy;

public class Main {
    static void main(String[] args) {
        Pedido pedido = new Pedido(2.5);

        pedido.setFrete(new FretePAC());
        System.out.println(pedido.descricaoFrete() + ": R$" + pedido.calcularFrete());

        pedido.setFrete(new FreteSedex());
        System.out.println(pedido.descricaoFrete() + ": R$" + pedido.calcularFrete());

        pedido.setFrete(new FreteMotoboy());
        System.out.println(pedido.descricaoFrete() + ": R$" + pedido.calcularFrete());
    }
}
