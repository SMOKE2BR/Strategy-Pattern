# Strategy Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Strategy** em Java, aplicado ao cálculo de frete.

## 📌 Estrutura

- **Interface**
  - `Frete` → contrato para cálculo e descrição do frete.

- **Classes concretas (estratégias)**
  - `FretePAC` → cálculo via PAC.
  - `FreteSedex` → cálculo via Sedex.
  - `FreteMotoboy` → cálculo via Motoboy.

- **Classe de contexto**
  - `Pedido` → utiliza a interface `Frete` e permite trocar dinamicamente a estratégia.

- **Classe de execução**
  - `Main` → demonstra o uso das diferentes estratégias de frete.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/strategy`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Frete via PAC: R$12.5
Frete via Sedex: R$25.0
Frete via Motoboy: R$20.0


## 🎯 Objetivo

O padrão Strategy permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.  
Neste exemplo, o cálculo de frete pode variar sem alterar a lógica da classe `Pedido`.

