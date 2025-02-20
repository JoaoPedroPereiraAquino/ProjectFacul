# Refatoração para atender ao Princípio de Responsabilidade Única (SRP)

**Princípio Violado**: **S - Single Responsibility Principle (SRP)**  

O código viola o princípio da responsabilidade única porque a classe `Invoice` possui múltiplas responsabilidades. Ela não apenas representa uma fatura, mas também gerencia a exibição e a persistência dos dados. Isso reduz a coesão da classe e dificulta a manutenção.  

## Problema  

No código atual:  
- A classe `Invoice` é responsável por múltiplas funções: armazenar os dados da fatura, imprimir a fatura e salvar no banco de dados.  
- Essa mistura de responsabilidades torna a classe menos modular e mais difícil de modificar ou expandir.  
- Caso seja necessário alterar a forma de salvar a fatura (por exemplo, armazenar em um arquivo em vez de um banco de dados), a classe `Invoice` precisaria ser alterada, violando o SRP.  

## Sugestão de Melhoria  

Para corrigir o problema:  
1. Usar o **Princípio de Responsabilidade Única** (Single Responsibility Principle - SRP) para separar as responsabilidades em classes distintas.  
2. Criar uma classe `InvoicePrinter` responsável por imprimir a fatura.  
3. Criar uma classe `InvoiceRepository` responsável por salvar a fatura no banco de dados.  
4. Manter a classe `Invoice` apenas como uma representação dos dados da fatura.  

Essa abordagem torna o sistema mais modular, facilitando a manutenção e futuras alterações.  
