# Exercício 18 - Calculadora de Potências e Raiz Quadrada

Este programa em Java calcula o quadrado, cubo e raiz quadrada de números positivos informados pelo usuário.

## Funcionalidades

- Solicita ao usuário que digite números positivos repetidamente
- Para cada número positivo informado, calcula:
  - **Quadrado**: número × número
  - **Cubo**: número × número × número  
  - **Raiz quadrada**: usando `Math.sqrt()`
- Exibe os resultados formatados com 2 casas decimais para a raiz quadrada
- O programa continua executando até que o usuário digite um número ≤ 0
- Finaliza com uma mensagem de saída

## Exemplo de uso

```
Digite um numero maior que [0]: 4
O numero 4 ao quadrado e: 16 
Ao cubo: 64
Raiz quadrada: 2.00

Digite um numero maior que [0]: 9
O numero 9 ao quadrado e: 81 
Ao cubo: 729
Raiz quadrada: 3.00

Digite um numero maior que [0]: 0
Saindo...
```

## Estrutura do código

- **Classe**: `Exercicio18`
- **Método principal**: `main(String[] args)`
- **Bibliotecas utilizadas**: `java.util.Scanner` para entrada de dados
- **Estrutura de controle**: Loop `do-while` que executa enquanto o número for positivo

## Variáveis utilizadas

- `num`: número informado pelo usuário
- `quadrado`: resultado do número elevado ao quadrado
- `cubo`: resultado do número elevado ao cubo  
- `raiz`: resultado da raiz quadrada do número

## Compilação e execução

```bash
javac Exercicio18.java
java Exercicio18
```

## Observações

- O programa utiliza um loop `do-while` para garantir que pelo menos uma iteração ocorra
- A condição `if(num > 0)` evita cálculos desnecessários para números não-positivos
- A raiz quadrada é exibida com 2 casas decimais usando `%.2f`
- O programa termina elegantemente com uma mensagem quando o usuário digita um número ≤ 0
