/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20222PF.CC0019
 * 
 * 3) Crie a classe Questao3 no mesmo pacote da questão anterior. O método main
deverá criar uma instância desta classe. O construtor deverá chamar o método datas().
No método datas. Adicione os seguintes horários em uma lista do tipo java.util.List
de java.util.Calendar: (Peso: 2,0)
17:20:00
18:20:00
19:20:00
06:00:00
02:59:00
Sendo assim, cada horário deve ser convertido com base no formato: HH:mm:ss.
Após, implemente uma rotina para encontrar na lista e imprimir na saída padrão o
maior horário.
 */


public class Questao3 {
    
       private SimpleDateFormat formatador = new SimpleDateFormat ("HH:mm:ss");
   
    
    public Questao3(){
        datas();
    }
    
    public void datas(){
        
        List<Calendar> listhorarios = new ArrayList();
        
        try {
            
            Calendar emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("17:20:00").getTime());
            
            listhorarios.add(emissao);
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("18:20:00").getTime());
            
            listhorarios.add(emissao);
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("19:20:00").getTime());
            
            listhorarios.add(emissao);
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("06:00:00").getTime());
            
            listhorarios.add(emissao);
            
             emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("02:59:00").getTime());
            
            listhorarios.add(emissao);
            
            
            Calendar maior = listhorarios.get(0);
            
            for(Calendar maiorhorario: listhorarios){
                
                if(maiorhorario.getTimeInMillis() > maior.getTimeInMillis()){
                    maior = maiorhorario;
                }
                
            }
            
            
            
            System.out.println("Maior Horário: "+formatador.format(maior.getTime()));
            
            
        } catch (ParseException e) {
            
        }
        
    }
    
    
    
    public static void main(String[] args) {

        new Questao3();
    }
    
}
