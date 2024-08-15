# Simulador de Conta Bancária

Este projeto é um simulador simples de conta bancária desenvolvido em Java, aplicando conceitos de Programação Orientada a Objetos (POO). O sistema permite criar contas bancárias, realizar depósitos, saques e verificar o saldo.

## Funcionalidades

- **Criar Conta Corrente**: Permite criar uma conta corrente com um titular e número de conta.
- **Criar Conta Poupança**: Permite criar uma conta poupança com um titular e número de conta.
- **Depositar**: Deposita um valor em uma conta existente.
- **Sacar**: Realiza um saque em uma conta existente, verificando o saldo disponível.
- **Verificar Saldo**: Exibe o saldo atual da conta e detalhes da mesma.

## Conceitos de POO Aplicados

- **Encapsulamento**: Proteção dos atributos das classes e acesso controlado através de métodos públicos.
- **Herança**: Classes `ContaCorrente` e `ContaPoupanca` herdam da classe base `Conta`.
- **Polimorfismo**: Manipulação de diferentes tipos de conta através de uma referência comum à classe `Conta`.

## Estrutura do Projeto

Todas as classes estão no mesmo pacote para simplificar a organização do projeto. A estrutura do código é a seguinte:
```bash
SimuladorContaBancaria
- package: main / Class: Main.java: Classe principal com menu interativo para o simulador
- package: models / Class: Conta.java:  Classe abstrata base para contas bancárias
                           ContaCorrente.java: Classe para contas correntes
                           ContaPoupanca.java: Classe para contas poupança
- package: services / Class: BancoService.java: Serviço que gerencia as operações do banco
```

## Como Executar:

1. **Clone o repositório:**

 ```bash
git clone https://github.com/seu-usuario/simulador-conta-bancaria.git
 ```
2. **Compile o código:**
Navegue até o diretório do projeto e compile os arquivos Java:
 ```bash
cd simulador-conta-bancaria
javac banco/*.java
 ```
3. **Execute o programa:**
Execute a classe Main para iniciar o simulador:
 ```bash
java banco.Main
 ```
4. **Interaja com o sistema:**
   Utilize o menu apresentado para criar contas, depositar, sacar e verificar saldo.

## Requisitos
Java 8+: Certifique-se de ter o Java Development Kit (JDK) instalado na sua máquina.

## Imagens do sistema:
![Captura de Tela (66)](https://github.com/user-attachments/assets/58634962-852d-4e4d-8f37-c01b9b8c4db9)

## Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, fique à vontade para abrir uma issue ou enviar um pull request.
Projeto para fins de estudo acadêmico em Java.

