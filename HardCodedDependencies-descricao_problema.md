**Princípio Violado**: **O - Open/Closed Principle (OCP)**  

O código viola o princípio aberto/fechado porque a classe `Report` não está aberta para extensão e fechada para modificação. Para suportar novos formatos de relatórios, seria necessário alterar o código da classe, o que reduz sua flexibilidade e escalabilidade.

## Problema

No código atual:
- A classe `Report` está diretamente acoplada à lógica de geração de relatórios no formato PDF.
- Isso impede que a classe suporte facilmente outros formatos de relatórios (como HTML ou CSV) sem alterar o código da classe `Report`.
- Esse acoplamento dificulta a escalabilidade e reduz a flexibilidade, uma vez que a funcionalidade de geração de relatórios está fixa na classe.

## Sugestão de Melhoria

Para corrigir o problema:
1. Usar o **Princípio Aberto/Fechado** (Open/Closed Principle - OCP) para permitir a extensão de funcionalidades sem modificar o código existente.
2. Introduzir uma abstração (interface ou classe abstrata) para a lógica de geração de relatórios.
3. Implementar diferentes classes para suportar múltiplos formatos de relatórios (PDF, HTML, etc.).
4. Utilizar **Inversão de Dependência** para que a classe `Report` dependa de abstrações, e não de implementações concretas.

Essa abordagem torna o sistema flexível, extensível e mais fácil de testar.
