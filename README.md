# 🏦: Sistema de validação de Contas Bancárias
Este projeto é uma aplicação Java cujo objetivo é implementar um sistema de apoio à validação de contas bancárias. O sistema garante que o formato das contas informadas esteja de acordo com as diretrizes da instituição financeira.

## ⚙️ Instalação das dependências
Para instalar as dependências do projeto, execute o comando `mvn install`. Isso fará o download das dependências configuradas no `pom.xml`, além de baixar as dependências indiretas.

## 🔍 Testes
Para executar os testes, execute o comando `mvn test`.

## 🧹 Linter (Checkstyle)
O Checkstyle é usado para fazer a análise estática do código. Este projeto já vem com as dependências relacionadas ao linter configuradas no arquivo `pom.xml`. O Checkstyle já é executado jutamente aos testes. No entanto, caso deseje rodar o Checkstyle manualmente, basta executar o comando `mvn checkstyle:check`.

## ✅ Funcionalidades implementadas
### 1. Adicionar dependência no projeto
Levando em consideração que o gerenciador de dependências do projeto é o Maven, foi adicionada a dependência [Apache Commons Lang versão 3.11](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3) no arquivo `pom.xml`. Essa dependência possui a classe de utilitários `StringUtils`, que fornece vários métodos para trabalhar com strings em Java.

### 2. Implementar formatação do número da conta
No método `formatAccountNumber` da classe `AccountNumberFormatter`, é feita a formatação do número da conta de acordo com as seguintes regras:
- conta < 6 dígitos: são adicionados zeros à esquerda até atender ao tamanho de 6 números;
- conta > 6 dígitos: são removidos todos os números antes dos 6 últimos;
- conta == 6 dígitos: já está aderente, o valor permanece inalterado.

Para realizar essa formatação, foi utilizada a biblioteca Apache Commons Lang, mais especificamente os métodos `leftPad` e `right` da classe `StringUtils`.

### 3. Ler a conta no terminal
A partir da classe `Application`, é possível interagir com o sistema por meio do console (terminal) e
- Receber o número da conta bancária (apenas números) no console.
- Validar se o número da conta é válido, rejeitando valores não numéricos.
- Formatar o número da conta de acordo com as diretrizes da instituição financeira.
- Exibir o resultado da validação e formatação no console.

## ℹ️ Considerações finais
Este projeto é apenas para fins educacionais. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato.
