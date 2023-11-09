
package br.edu.ifsul.bcc.too.topico3;

import br.edu.ifsul.bcc.too.topico3.util.Aluno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author telmo
 * Documentacao: https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
 */
public class Colecoes {
    
    /*
        A partir de Java 1.2, foi criado um conjunto de interfaces e classes denominado Collections Framework, 
        que faz parte do pacote java.util. 
    
        Collections Framework é um conjunto bem definido de interfaces e classes para representar e 
        tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. 
        A Collections Framework contém os seguintes elementos:
            Interfaces: tipos abstratos que representam as coleções. 
            Implementações: são as implementações concretas das interfaces;
            Algoritmos: são os métodos que realizam as operações sobre os objetos das coleções.     
    
        Interfaces:
    
            Collection - define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
            Set - interface que define uma coleção que não permite elementos duplicados. SortedSet: possibilita a 
                  classificação natural dos elementos, tal como a ordem alfabética;
            
    */
        
    //atributo de instância.
    private Set<Object> st;
            
    /*
            List  – define uma coleção ordenada, podendo conter elementos duplicados. 
               Temos o controle total sobre a posição onde cada elemento é inserido e pode recuperá-los 
               através de seus índices.
     
            Map   - mapeia chave para valores.

    */ 

    //atributo de instância.
    private Collection<Integer> minhaLista;
    
    //atributo de instância.
    private List<Integer> lst; // INTERFACE LIST - PODE TER: ArrayList, Vector, LinkedList   <Integer> diz q só aceita integer
    // private List<Object> -  ACEITA TANTO STRING COMO INT
    
    private Map<String, String> mp;
    
    //construtor        
    protected Colecoes(){
        
        
    }
            
    //construtor 
    public Colecoes(Integer tipo){
        
         //System.out.println(tipo);
        // é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são.
        lst = new ArrayList();
        
        lst.add(1);
        lst.add(20);
        lst.add(0);
        lst.add(15);
        lst.add(8);
        lst.add(3);
        lst.add(150);
        lst.add(15);//elemento duplicado.
        
        lst.remove(7);  // remocao de elemento por índice.
        
        //System.out.println(lst); [1, 20, 0 ...]
        
        
        for(int i=0; i < lst.size(); i++){

            System.out.println("Elemento da List: " + lst.get(i));//List possibilita a recuperacao pelo indice.
        }         
        
        //System.out.println("Contem o elemento com o valor 150: " + lst.contains(150));
        
       /* for(Integer i : lst){
            System.out.println(i);
        }*/
              
    }
    
    //construtor 
    public Colecoes(String tipo){      
        
       
        //Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural
        st = new TreeSet();
        
        st.add("Nova Zelandia");
        st.add("França");
        st.add("Brasil");
        st.add("Belgica");
        st.add("Japão");
        st.add("Brasil");    
        
        
        for( Object o : st){            
            // casting : modelagem de Object para String
            
            System.out.println("Elemento do Set: " + (String)  o ); // precisa do (String) para transformar o "o" de object p/ string
        }      
        
    }
    
    
    public void metodoHashmap(){
        
        // Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). 
        mp = new HashMap();
        
        mp.put("id", "1");
        mp.put("uz", "0000134");
        mp.put("cpf", "0000134");
        mp.put("id", "100000");
        
        
        for (Map.Entry<String, String> m : mp.entrySet()) {        
            System.out.println("Chave "+m.getKey() + " Valor : "+ m.getValue());    
        } 
        
        
        System.out.println("chave uz: " + mp.get("uz")); 
        System.out.println("chave id: " + mp.get("id")); 
    }
    
    public void metodoClassificacaoMap(){

        //Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
        SortedMap<String, Aluno> map = new TreeMap();
        
        
        map.put("0" , new Aluno("456a","junior"));
        map.put("1" , new Aluno("789a","fulano"));
        map.put("0" , new Aluno("789a","abel"));
        map.put("50" , new Aluno("789a","abel"));
        map.put("3" , new Aluno("123a","telmo"));
        
        
        for (Map.Entry<String, Aluno> m : map.entrySet()) {
        
            System.out.println("Chave "+m.getKey() + " Valor : "+ m.getValue());    
        }         
        
    } 
       
    
    public void metodoClassificacao(){
        
        java.util.List<Aluno> list = new ArrayList();//criando a variavel list.
        
        Aluno a = new Aluno("pf009","telmo");// criacao do objeto/variavael a do tipo Aluno.
        list.add(a);
        
        Aluno b = new Aluno("pf002","junior");
        list.add(b);
        
        Aluno c = new Aluno("pf003","fulano");
        list.add(c);
        
        Aluno d = new Aluno("pf000","Abel");
        list.add(d);
        
        Aluno e = new Aluno("pf01", "Ciclano");//criando a instancia a partir do construtor sem parâmetros.
        list.add(e);
        
        System.out.println(list);//antes
               
        Collections.sort(list);//classificacao com base na método compareTo                
        
        System.out.println(list);//depois
        
    }
    
    
    public static void main(String[] args) {
        
        //criacao da instância invoncando o construtor que recebe um integer.
        //Colecoes colecoes = new Colecoes(0); // ARMAZENA 
       // new Colecoes(0); // SOMENTE EXECUTA O CONSTRUTOR
        
       //criacao da instância invocando o construtor que recebe uma String.        
       // new Colecoes("");
       
       //criacao da instância invocando o construtor sem parâmetros e chama o método metodoHashmap.
       //new Colecoes().metodoHashmap(); 
       
       //Colecoes c = new Colecoes();
       //c.metodoHashmap();
       
       //Colecoes c = new Colecoes();
       //c.metodoClassificacao();
       
       // ou        
       new Colecoes().metodoClassificacao();        
      
       
       //new Colecoes().metodoClassificacaoMap();
       
     
     
    }
    
}
