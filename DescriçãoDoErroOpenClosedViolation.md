# Refatoração para atender ao Princípio Aberto/Fechado (OCP)

**Princípio Violado**: **O - Open/Closed Principle (OCP)**  

O código viola o princípio aberto/fechado porque a classe `DiscountCalculator` não está aberta para extensão e fechada para modificação. Para adicionar novos tipos de clientes, seria necessário modificar diretamente a classe, o que reduz sua flexibilidade e escalabilidade.  

## Problema  

No código atual:  
- A classe `DiscountCalculator` utiliza verificações condicionais (`if-else`) para determinar o desconto com base no tipo de cliente.  
- Isso faz com que qualquer nova regra de desconto exija alterações na classe, violando o princípio OCP.  
- O acoplamento da lógica de desconto dentro da classe torna o sistema menos modular e mais difícil de manter.  

## Sugestão de Melhoria  

Para corrigir o problema:  
1. Usar o **Princípio Aberto/Fechado** (Open/Closed Principle - OCP) para permitir a adição de novos tipos de desconto sem modificar a classe existente.  
2. Criar uma abstração (`DiscountStrategy`) para representar diferentes estratégias de desconto.  
3. Implementar classes separadas para cada tipo de cliente (`RegularDiscount`, `VIPDiscount`, etc.).  
4. Utilizar **Inversão de Dependência** para que a classe `DiscountCalculator` dependa de abstrações, e não de implementações concretas.  

Essa abordagem torna o sistema flexível, extensível e mais fácil de testar.  
