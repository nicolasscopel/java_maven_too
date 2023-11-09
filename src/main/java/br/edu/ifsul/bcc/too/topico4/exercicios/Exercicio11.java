
package br.edu.ifsul.bcc.too.topico4.exercicios;

/**
 *
 * @author telmo
 */
public class Exercicio11 {
    
    /*
    Exercício 11.1: criar um método que retorne uma coleção de Pessoas.       
    Essa coleção deve ter 3 Alunos e 2 Funcionarios.
    No construtor da classe Biblioteca chame o método criado anteriormente e
    imprima na saída padrão todas as Pessoas, ordenadas pela
    Data de nascimento (ordem desc).
    Dica: implementar o implements Comparable<Pessoa> e sobrescrever o método
    compareTo em Pessoa. 
    */
  
    
     /*
        Exercício 11.2: resolver o problema de sintaxe "new Pessoa()", criando
        um construtor na classe Aluno, que receba os parâmetros(String cpf, 
        String rg, String nome, String logradouro, String cep, Integer numero,
        String telefone,Calendar data_cadastro, Calendar data_nascimento e matricula)
        Os primeiros 9 parâmetros deverão ser encaminhados para o construtor
        de Pessoa, utilizando o comando super(cpf, rg, ...).
        O décimo parâmetro deverá ser atribuido para o atributo da instância.
    */    
    /*
        Exercício 11.3: criar um método que retorne uma coleção de Empréstimo. Esse método deverá
        receber por parâmetro uma lista de Funcionario, Aluno e Exemplar. Cada elemento recebido
        por parâmetro deverá ser vinculado a um Empréstimo.   
    */
  
    
    
    
    /*
        Exercicio 11.4: testar o método criado na questão 3 (chamar e imprimir o retorno).
    */
    
    
    
    /*
        Exercicio 11.5: 
        Implementar o relacionamento de agregação por composição. 
        Criar a classe Parcelamento, a enum Situacao.
        Criar um método que receba por pârametro um Funcionario, Aluno e Exemplar
        e um inteiro para representar a quantidade de parcelas.
    
        Definir através de constantes as demais informações.
        
        Calcule o valor do emprestimo em X vezes e adicione na lista de parcelamento.
        Esse método deverá retornar uma instância de Emprestimo.
        
    */
    
    /*
        Exercicio 11.6: testar o método criado na questão 5 (chamar e imprimir o retorno).
    */

   

    
      /* métod estático*/
    public static void main(String args[]){
       
        new Exercicio11();
        //https://plantuml.com/ie-diagram
    }
    
    
}
