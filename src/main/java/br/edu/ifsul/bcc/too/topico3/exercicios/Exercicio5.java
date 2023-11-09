
package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author telmo
 */
public class Exercicio5 {
    
    private String strDados = " A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    private String aux1 = "1";
    private String aux2 = "2";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */    
    //constutor da classe.
    public Exercicio5(){                      
              manipulaString();
    }  
    
    private void manipulaString(){//metodo da classe
        System.out.println("1) Exemplo de utilização do método concat:");
        String r = strDados.concat(" !");
        r = "# ".concat(r);        
        System.out.println(r);
        System.out.println("\tO metodo concat realiza a junção entre duas Strings.");
        System.out.println("2) Exemplo de utilização do método valueOf");
        System.out.println("String.valueOf(true): "+String.valueOf(true));
        System.out.println("\t converte para String");
        System.out.println("3) Método startsWith : "+strDados.startsWith("A"));
        System.out.println("Retorno true ou false se a string começar com o prefixo.");
        
        System.out.println("Posicao do caracter s : "+strDados.indexOf("´", 5+1));
        
        System.out.println("Substring :"+strDados.substring(5, 14));
        
        System.out.println("Replace: "+strDados.replace('a', 'A'));
        
        System.out.println("Trim ::"+strDados.trim());
        
        //private String aux1 = "A";
        //private String aux2 = "B";
        System.out.println("compareTo: "+aux1.compareTo(aux1));
    }
    
    public static void main(String args[]){//metodo main
        
        int a;
        float b;
        boolean c;
        Integer aa;
        
        Exercicio5 e5;//cria o objeto
        
        //e5 = null; // inicializa com o null
        
       // e5 = "7"; // atribuicao (erro de tipos incompatíveis)
        
        e5 = new Exercicio5();//inicialização do objeto e5
        
        //System.out.println(" acessando o atributo da instancia: "+e5.strDados);
        
        //e5.manipulaString();
        
        //e5.manipulaString();//chamada do metodo a partir do objeto.
        
       // Exercicio5 e_5  = new Exercicio5(); //cria e inicializa o e_5
        
        //  new Exercicio5(); //criacao do instacia sem atribuicao.
        
    }
    
    
    
    
    
}
