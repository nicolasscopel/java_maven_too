package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author Prof. Telmo Júnior
 */


import java.util.Scanner;
import java.lang.Exception;

public class Exercicio1 {        
    
    public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
    
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e 
               inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes 
               (rgDados1 e rgDados2) e armazene em rgDados3. 
               Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Digite um valor: ");
               
                    boolean erro = true;
                    while(erro){
                        try{
                            if(sc.hasNext()){
                                int i = Integer.parseInt(sc.next());
                                erro = false; 
                             
                                //System.out.println(i);
                                //System.out.println("\n"); // quebra linha
                                //System.out.println("\t"); // recuo
                                //System.out.print(""); // imprime sem quebrar a linha                             
                            }
                            
                        }catch(NumberFormatException e){
                            //e.printStackTrace();
                            //e.getLocalizedMessage();
                            //e.getMessage();                                                        
                            //System.out.println("Erro: "+e.getLocalizedMessage()+"tente novamente ");
                            erro = true;
                        }
                    }        
                                      
                }                
            }                        
        }              
    
}
