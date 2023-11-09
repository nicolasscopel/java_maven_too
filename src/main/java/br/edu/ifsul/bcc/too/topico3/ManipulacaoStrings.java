
package br.edu.ifsul.bcc.too.topico3;

import java.lang.String;

/**
 *
 * @author telmo
 */

public class ManipulacaoStrings {
    
    public ManipulacaoStrings(String t, String t2, String t3, String t4){ //construtor        
        testeComparacaoStrings(t, t2, t3, t4);//chamada de método.
        testeSplit("1,2,3,4,5,6,7,a,b,c,8");
        teste2Split("{codigo= 1},{codigo= 22},{codigo= 300}");
    }
    
    private void teste2Split(String param){
        
        param = param.trim();
         
    }
    private void testeSplit(String param){
        String[] meuVetor;        
        meuVetor = param.split(",");
        for(int i=0; i < meuVetor.length; i++){
            try{
                Integer item = Integer.parseInt(meuVetor[i]);
                System.out.println(item);
                
            }catch(NumberFormatException e){
                System.out.println("-");
            }
            
        }
        //alternativa.
        /*
        for(String s: meuVetor){
            
            
        }
        */
        System.out.println("length: "+meuVetor.length); //tamanho do vetor
        
        
        //utilizando o método java.lang.String.split, imprima uma lista de informações inteiras
        //na saida padrão, caso não seja possível converter para inteiro
        //imprima a informação -
        //exemplo
        /*
        1
        2
        3
        4
        5
        6
        7
        -
        -
        -
        8        
        */
        
    }
    
    //metodo 
    private void testeComparacaoStrings(String t, String t2, String t3, String t4){   
        
        // ==  : testa as instâncias
        if(t == t2){
            System.out.println("t tem a mesma instancia de t2");
        }else{
            System.out.println("t e t2 não tem a mesma instância");
        }
        
        if(t == t3){
            System.out.println("t tem a mesma instancia de t3");
        }else{
            System.out.println("t e t3 não tem a mesma instância");
        }
        
        // equals : testa o conteúdo.
         if(t.equals(t2)){
            System.out.println("t tem o mesmo conteudo de t2");
        }else{
            System.out.println("t e t2 não tem o mesmo conteudo");
        }
        
        if(t.equals(t3)){
            System.out.println("t tem o mesmo conteudo de t3");
        }else{
            System.out.println("t e t3 não tem o mesmo conteudo");
        }
        
    }
    //metodo main
    public static void main(String[] args) {   
        
        
        
        String texto = "Qualquer texto entre aspas é uma String";        
        String texto2 = new String("Qualquer texto entre aspas é uma String");        
        String texto3 = "Qualquer texto entre aspas é uma String";        
        String texto4 = new String("Qualquer texto entre aspas é uma String");
        
        /*
            Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas 
            características que podem não ser óbvias para quem está tendo o seu primeiro contato com ela.        
            Por exemplo, um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. 
            Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja 
            criada contendo a nova versão dele. Essas características serão o assunto que abordaremos primeiro.        
        */        

        
        new ManipulacaoStrings(texto, texto2, texto3, texto4);
        
        //Testando igualdade entre Strings   
        //comando: ==, equals, equalsIgnoreCase, compareTo, compareToIgnoreCase
        
        //Principais métodos da classe String: concat, String.valueOf, Length, startsWith endsWith, 
        //indexOf, substring, replace, trim
        
        
        //Implementar um construtor para essa classe
        //No método main criar uma instancia de ManipulacaoStrings
        //No construtor desta classe, chamar o método testeComparacaoStrings.
        //No método testeComparacaoStrings implementar rotinas para testar os seguintes comandos
        // ==, equals, equalsIgnoreCase, compareTo, compareToIgnoreCase
        //usando as variávies texto, texto2 e texto3, texto4.
    }
    
    
}


    /*
        Fontes: 
            
            https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
            
    */  