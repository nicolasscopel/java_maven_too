
package br.edu.ifsul.bcc.too.topico4;

import br.edu.ifsul.bcc.too.topico4.PessoaEncapsulada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author telmo
 */
public class Polimorfismo {
    
    private List<PessoaEncapsulada>  list = new ArrayList();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar cal = Calendar.getInstance();
    
    protected Polimorfismo(){
        
        testOO();
        
    }
    
    private void testOO(){
        
        try {
            //Exercício: criar 5 objetos do tipo PessoaEncapsulada
            //Adicionar a uma lista
            //Imprimir os elementos da lista num padrão :
            //Imprimir o objeto através do método toString())
            // CPF: XXX.XXX.XXX/XX - Idade: XX
            
            PessoaEncapsulada p1 = new PessoaEncapsulada();
            p1.setCPF("00001359070");
            p1.setNome("Fulano de Tal");
            p1.setcorOlhos("Castanho");
            p1.setcorCabelo("Loiro");
            p1.setaltura(1.89f);
            cal.setTime(sdf.parse("20/12/2002"));
            p1.setDataNascimento(cal);
            
            list.add(p1);
            
            p1 = new PessoaEncapsulada();
            p1.setCPF("00001359067");
            p1.setNome("Siclano de Tal");
            p1.setcorOlhos("Azuis");
            p1.setcorCabelo("Preto");
            p1.setaltura(1.69f);
            cal.setTime(sdf.parse("04/10/2002"));
            p1.setDataNascimento(cal);
            
            
            list.add(p1);
            
            p1 = new PessoaEncapsulada();
            p1.setCPF("61423521082");
            p1.setNome("Tatiana");
            p1.setcorOlhos("Castanhos");
            p1.setcorCabelo("Castanho com luzes");
            p1.setaltura(1.73f);
            cal.setTime(sdf.parse("21/01/1971"));
            p1.setDataNascimento(cal);
            
            
            list.add(p1);
            
            p1 = new PessoaEncapsulada();
            p1.setCPF("52981878091");
            p1.setNome("Roberval");
            p1.setcorOlhos("Verde");
            p1.setcorCabelo("Preto");
            p1.setaltura(1.80f);
            cal.setTime(sdf.parse("22/12/1995"));
            p1.setDataNascimento(cal);
            
            
            list.add(p1);
            
            p1 = new PessoaEncapsulada();
            p1.setCPF("45691265198");
            p1.setNome("Vanderson");
            p1.setcorOlhos("Castanho");
            p1.setcorCabelo("Ruivo");
            p1.setaltura(1.92f);
            cal.setTime(sdf.parse("12/06/1980"));
            p1.setDataNascimento(cal);
            
            
            list.add(p1);
            
            
            for(PessoaEncapsulada p : list){
                
                System.out.println(p);
            }
        } catch (ParseException ex) {
            Logger.getLogger(Polimorfismo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String args[]){
        
        new Polimorfismo();
    }
    
}
