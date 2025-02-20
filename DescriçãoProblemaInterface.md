    Problema Identificado:
A interface Machine força todas as classes a implementarem métodos que podem não ser necessários.
Se uma nova impressora for criada e não precisar da função de fax, ainda assim terá que implementá-la, o que resulta em código desnecessário ou com implementações vazias.
    Correção Necessária:
Dividir a interface Machine em interfaces menores e mais específicas para que as classes implementem apenas os métodos que realmente utilizam.