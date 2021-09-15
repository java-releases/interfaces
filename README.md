![](https://github.com/ocpjp-study/local-variable-inference/blob/main/ocpjp.png)

[Preparação para o Exame 1Z0-817](https://education.oracle.com/pt_BR/upgrade-ocp-java-6-7-8-to-java-se-11-developer/pexam_1Z0-817)

### Tópico: Interfaces
### Objetivos
- Criar e usar métodos na interface;
- Definir e escrever interface funcional;

<hr>

### Resumo <br/><br/>

> #### Método Default 
  - Existe desde o Java 8;
  - A principal motivação foi para poder adicionar um novo método na interface, sem ter que modificar as suas implementações;
  - É um tipo de membro por instância;
  - Deve ser declarado apenas dentro de uma interface;
  - Deve conter a palavra chave “default”, e incluir um corpo no método;
  - É implicitamente public;
  - Não pode ser abstract, final, ou static;
  - Pode ser subscrito por uma classe, que implementa a interface;
  - Se uma classe herdar 2 ou mais métodos “default” com a mesma assinatura, então a classe deverá subscrever o método;
  <br/><br/>
  
> #### Método Static
  - Existe desde o Java 8;
  - É um tipo de membro por Classe;
  - Deve conter a palavra chave “static”, e incluir um corpo no método;
  - É implicitamente public;
  - Não pode ser abstract, ou final;
  - Não é herdado e não pode ser acessado na classe de implementação sem uma referência ao nome da interface;
  <br/><br/>
  
> #### Método Private
- Existe desde o Java 9;
- É um tipo de membro de instância;
- Deve conter a palavra chave private, e incluir um corpo no método;
- Um método privado, pode ser chamado apenas por um default ou um private (não static);
- Não pode ser abstract (já que nunca serão herdados);
<br/><br/>

> #### Método Private Static
- Existe desde o Java 9;
- Deve ter as palavras chave private, e static. E deve incluir um corpo no método;
- Pode ser chamado por outro método; 
- Não pode chamar um método private;
<br/><br/>

> #### Interface Funcional 
  - É quando uma interface possui apenas 1 método abstrato;
  - O uso da anotação @FunctionalInterface é opcional;
  - Caso existir somente alguns dos métodos abaixo, a interface não será considerada funcional:
    - String toString();
    - boolean equals(Object o);
    - int hashCode();
