/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author 20222PF.CC0019
 * 1) Codifique a classe Questao1 no pacote br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.
O método extracaoInteiros deverá ser chamado, recebendo como parâmetro a
referência para a variável json. Neste método, implemente uma rotina em java para
extrair os valores (123, 0 e 59) de forma dinâmica. Converta-os para Integer,
adicione-os em uma coleção e retorne. Em seguida implemente um método para
imprimir na saída padrão. Esse método também deverá ser chamado no construtor.
(Peso: 1,5)

 * 
 */
public class Questao1 {
    
    private Collection<Integer> listacomnumeros = new ArrayList();
    
    
    
    public Questao1(String param){
        
       listacomnumeros = extracaoInteiros(param);
       mostra(listacomnumeros);
        
        
 }

 private Collection<Integer> extracaoInteiros(String param){
     
     String d[] = param.split(",");
     int i =0;
     Integer cod;
     Collection<Integer> list = new ArrayList();
     
      while (i < d.length) {

            try {
                String codigo = d[i].substring(d[i].indexOf(":") + 2,
                        d[i].indexOf("}"));
                
                cod = Integer.parseInt(codigo);
                
                list.add(cod);
          
            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
        return list;
     
 }
 
 private void mostra(Collection<Integer> list){
     
     System.out.println(list);
     
 }

 public static void main(String[] args) {
 String json= "[{codigo: 123}, {codigo: 0}, {codigo: 59}, {codigo: 5}]";
 
 new Questao1(json);
 } 
    
    
}
