    Problema:
O problema original era que Avestruz herdava de Ave, mas não podia voar, violando o Princípio da Substituição de Liskov, que diz que uma subclasse deve poder substituir a superclasse sem quebrar o comportamento esperado.

    Para corrigir:
Criar uma classe abstrata AveQueVoa para separar aves que realmente podem voar.
Andorinha herda de AveQueVoa e implementa voar().
Avestruz herda diretamente de Ave, mas sem um método voar(), pois ela não voa.
No main(), usar correr() em Avestruz e voar() em Andorinha, garantindo que cada classe tenha comportamentos corretos.