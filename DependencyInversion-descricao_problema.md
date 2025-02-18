# Descrição do Problema

O código fornecido apresenta uma violação do Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP), que faz parte dos princípios SOLID. De acordo com o DIP, os módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, as abstrações não devem depender de detalhes, mas sim os detalhes dependerem de abstrações.

## Problema

No código atual:
- A classe `Switch` depende diretamente da classe concreta `LightBulb`.
- Isso reduz a flexibilidade, pois `Switch` só pode controlar uma `LightBulb` e não qualquer outro tipo de dispositivo (por exemplo, um ventilador, um ar-condicionado, etc.).
- Isso também aumenta o acoplamento entre as classes, dificultando a manutenção e a expansão do sistema.

## Sugestão de Melhoria

Para corrigir a violação do DIP:
1. Criar uma interface `Device` que defina os métodos genéricos `turnOn` e `turnOff`.
2. Fazer com que a classe `LightBulb` implemente a interface `Device`.
3. Modificar a classe `Switch` para depender de `Device` em vez de `LightBulb`.

Essa abordagem garante que o `Switch` seja desacoplado da implementação específica de `LightBulb` e possa controlar qualquer dispositivo que implemente a interface `Device`.
