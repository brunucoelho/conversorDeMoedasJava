# Conversor de Moedas 🪙

Este é um projeto de um conversor de moedas desenvolvido em Java, utilizando a API de taxa de câmbio [ExchangeRate-API](https://www.exchangerate-api.com/). O projeto foi desenvolvido no IntelliJ IDEA. E é o desafio de projeto da formação Java do Alura.
Mais informações você pode encontrar [aqui](https://cursos.alura.com.br/formacao-java) .

## Descrição 📝

O conversor de moedas permite que os usuários convertam valores entre diferentes moedas. As taxas de câmbio são obtidas em tempo real usando a API do ExchangeRate-API.

## Funcionalidades ⚙️

- Conversão de Euro (EUR) para Dólar (USD)
- Conversão de Dólar (USD) para Euro (EUR)
- Conversão de Real (BRL) para Dólar (USD)
- Conversão de Dólar (USD) para Real (BRL)
- Conversão de Pesos Argentinos (ARS) para Dólar (USD)
- Conversão de Dólar (USD) para Pesos Argentinos (ARS)

## Estrutura do Projeto 

O projeto está dividido em duas classes principais:

1. `Main`: Contém o método `main` e a lógica de interação com o usuário.
2. `BuscadorMoeda`: Contém o método `converterMoeda` que realiza a conversão de moedas usando a API.

## Como Usar

1. Clone este repositório:
    ```bash
    git clone https://github.com/brunucoelho/conversor-moedas.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd conversor-moedas
    ```
3. Abra o projeto no IntelliJ IDEA.
4. Execute a classe `Main` para iniciar o conversor de moedas.
5. Siga as instruções no menu para selecionar a conversão desejada e insira o valor a ser convertido.

<h3 style="color: red;"> OBSERVAÇÕES </h3>
Caso tenha intesse no folk do projeto, lembre-se de criar uma conta no [ExchangeRate-API](https://www.exchangerate-api.com/), para ter acesso ao Tolken da API.

## Ferramentas Utilizadas

- Java
- IntelliJ IDEA
- ExchangeRate-API
- Biblioteca GSON para manipulação de JSON

## Autor 👨🏽‍💻

Desenvolvido por [brunucoelho](https://github.com/brunucoelho).

