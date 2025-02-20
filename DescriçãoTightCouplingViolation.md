# Refatoração para reduzir o acoplamento entre classes

**Princípio Violado**: **D - Dependency Inversion Principle (DIP)**  

O código viola o princípio da inversão de dependência porque a classe `Car` depende diretamente da implementação concreta da classe `Engine`. Isso cria um forte acoplamento entre as classes, dificultando futuras modificações ou extensões, como a substituição do motor por outro tipo (elétrico, híbrido, etc.).  

## Problema  

No código atual:  
- A classe `Car` depende diretamente da classe concreta `Engine`.  
- Isso impede a fácil substituição do motor por outro tipo sem modificar a classe `Car`.  
- Caso seja necessário adicionar um novo tipo de motor (exemplo: `ElectricEngine`), será necessário modificar o código da classe `Car`, violando o princípio aberto/fechado (OCP) também.  

## Sugestão de Melhoria  

Para corrigir o problema:  
1. Usar o **Princípio da Inversão de Dependência** (Dependency Inversion Principle - DIP) para que a classe `Car` dependa de uma abstração em vez de uma implementação concreta.  
2. Criar uma interface `Engine` para definir o comportamento de um motor.  
3. Implementar classes específicas para diferentes tipos de motores (`PetrolEngine`, `ElectricEngine`, etc.).  
4. Modificar a classe `Car` para depender da interface `Engine`, permitindo a injeção de diferentes implementações sem alterar seu código.  

Essa abordagem torna o código mais flexível, facilitando futuras alterações e melhorando a testabilidade.  
