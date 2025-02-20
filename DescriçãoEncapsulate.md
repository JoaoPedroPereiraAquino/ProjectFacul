    Problema:
Mistura de responsabilidades: A classe Calculator está lidando tanto com a lógica da divisão quanto com o tratamento de exceções. Isso dificulta a manutenção e reutilização do código.
Tratamento de erro genérico: A exceção capturada é Exception, o que engloba qualquer erro, tornando difícil identificar a real causa do problema.
Saída de erro pouco informativa: A mensagem "Something went wrong!" não explica qual foi o erro.
    Correção:
Separar a lógica de cálculo da lógica de tratamento de erros.
Usar exceções específicas (ArithmeticException para divisões por zero).
Lançar a exceção ao invés de capturá-la diretamente, deixando que o código chamador decida como tratá-la.