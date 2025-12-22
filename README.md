🛒 Supermercado em Java (Swing)

Este projeto é uma aplicação simples de supermercado em Java, desenvolvida com Java Swing, que simula a adição de produtos a um carrinho, cálculo do valor total e aplicação automática de desconto.

📌 Funcionalidades

Interface gráfica usando JFrame, JButton e JLabel

Adição de produtos ao carrinho por meio de botões

Cálculo automático do valor total

Cálculo do total com desconto

Regra de desconto aplicada automaticamente

Código organizado com separação de responsabilidades

🧱 Estrutura do Projeto
📂 Classes principais
JanelaSupermercado

Responsável pela interface gráfica:

Cria a janela

Exibe botões e labels

Captura eventos dos botões

Atualiza os valores exibidos na tela

Carrinho

Responsável pela lógica de negócio:

Armazena os produtos adicionados

Calcula o valor total

Aplica a regra de desconto

Produto

Representa um produto do supermercado:

ID

Nome

Preço

🛍️ Produtos disponíveis

Atualmente, a aplicação possui os seguintes produtos:

Produto Preço (R$)
Arroz 40,00
Feijão 7,60
Macarrão 5,50

Cada clique no botão adiciona 1 unidade do produto ao carrinho.

💸 Regra de Desconto

Quando o total da compra é maior ou igual a R$ 100,00

É aplicado um desconto de 15%

Caso contrário, o valor permanece sem desconto

A lógica do desconto está centralizada na classe Carrinho.

🖥️ Interface

A interface exibe:

Total: soma dos preços dos produtos adicionados

Total com desconto: valor final após aplicação da promoção

Os valores são atualizados automaticamente a cada clique em um botão.
