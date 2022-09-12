# conta-banco
Este repositório é para treinar a habilidade de resolver testes.

Teste: Eu como usuário devo poder criar uma conta no banco. 
Tipos de conta:
* Conta Corrente;
* Conta Poupança;
* Conta Jurídica; 

### Entrada
* nome;
* idade;
* salário;
* documento.

### Saída
* nome;
* tipo de conta;
* número da agência;
* número da conta.

### Regras de Negócio
* Se o documento for CPF e Salário for maior que 2800 -> abrir Conta Corrente;
* Se o documento for CPF e Salário for menor que 2800 -> abrir Conta Poupança;
* Se o documento for CNPJ e Salário for maior que 3000 -> abrir Conta Jurídica;
* Se o documento for CNPJ e Salário for menor que 3000 -> abrir Conta Corrente;
