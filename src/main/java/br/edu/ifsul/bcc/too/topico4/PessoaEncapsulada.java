package br.edu.ifsul.bcc.too.topico4;

//import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.*;
import java.util.Calendar;

/**
 *
 * @author telmo
 */
//classe é uma especificação para um objeto. 
//Classe ou tipo, permite especificar o formato dos objetos que poderão ser criados futuramente. (variáveis do tipo da classe).
//Ou seja, classe é como se fosse um molde para objetos. 
//instância de uma classe é equivalente a objeto da classe.
public class PessoaEncapsulada {

    /* atributos de instância ou de objeto: definem o estado do objeto em um determinado instante.*/
    private String cpf;//atributos privados e métodos públicos é uma forma de encapsulamento.
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;
    private Integer idade;

    /*
      Acessibilidade: permite implementar o encapsulamento. Ou seja, encapsular (ocultar) a complexidade (código) 
      que não é relevante para o restante da implementação e disponibilizar o que é revelante. 
    
      private: visível apenas dentro da classe.
      protected: visível apenas dentro do pacote.
      public: totalmente visível. 
     */
    //construtor padrão da classe: protegido e sem parâmetros.
    protected PessoaEncapsulada() {

        //esse método será executado na criação da instância.
    }

    //https://www.devmedia.com.br/sobrecarga-e-sobreposicao-de-metodos-em-orientacao-a-objetos/33066
    //polimorfismo: possibilita a reutilização de codigo fonte, uma vez que um objeto pode assumir várias formas.
    //Existem dois tipos de polimorfismo: sobrecarga (orverload) e sobreposição (override).
    //Sobrecarga: permite a existencia de mais de um método com o mesmo nome, porém, 
    //com assinatura diferente (quantidade e tipo de argumentos/parâmetros)
    protected PessoaEncapsulada(String cpf, String nome, String corOlhos, String corCabelo, Float altura, Integer idade) {

        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.altura = altura;
        this.idade = idade;
    }

    //Sobreposição: permite reescrever um método em uma subclasse que possua comportamento diferente
    //do método de mesma assinatura na superclasse.
    @Override
    public String toString() {

        return "CPF: " + this.cpf + " - Idade: " + this.idade ;
    }

    //encapsulamento: restringe o acesso ao atributo da instância e libera o acesso vai método público.
    //dessa forma é possível controlar o que será retornado.
    public String getCPF() {  // GET RETORNAR
        return this.cpf;
    }

    public void setCPF(String cpf) {  //SET ALTERAR
        if(cpf.length() == 11){
        this.cpf = cpf;
       
    }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Integer setIdade(Integer idade) {
        return this.idade;
    }

    public void setDataNascimento(java.util.Calendar dataNascimento) {

        this.dataNascimento = dataNascimento;
        int age;

        //calcula para descobrir a idade
        int anonasc = dataNascimento.get(Calendar.YEAR);

        Calendar c = Calendar.getInstance();
        int anoatual = c.get(Calendar.YEAR);

        age = anoatual - anonasc;

        if (c.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            age--;
        } else {
            if (c.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && c.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                age--;
            }
        }

        this.idade = age;
    }

    public String getcorOlhos() {
        return this.corOlhos;
    }

    public void setcorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getcorCabelo() {
        return this.corOlhos;
    }

    public void setcorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public Float getaltura() {
        return this.altura;
    }

    public void setaltura(Float altura) {
        this.altura = altura;
    }

}
