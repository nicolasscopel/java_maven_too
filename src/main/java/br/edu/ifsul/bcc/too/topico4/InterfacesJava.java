package br.edu.ifsul.bcc.too.topico4;

import com.sun.jdi.InterfaceType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author telmo
 */
public class InterfacesJava implements ExemploInterface {

    InterfacesJava() {

        try {

            System.out.println("Data: " + getDataAtual());
            System.out.println("Ano Atual: " + getAnoAtual());
        } catch (Exception ex) {
            Logger.getLogger(InterfacesJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //https://www.devmedia.com.br/interfaces-programacao-orientada-a-objetos/18695
    /*
    Podemos definir como interface o contrato entre a classe e o mundo exterior. 
    Quando uma classe implementa uma interface, se compromete a fornecer o comportamento publicado por esta interface.
    
    As classes ajudam a definir um objeto e seu comportamento e as interfaces que auxiliam na definição dessas classes. 
    As interfaces são formadas pela declaração de um ou mais métodos, os quais obrigatoriamente não possuem corpo.
    
    As operações específicas para cada um desses métodos são realizadas pela classe que implementa. De um modo geral, 
    podemos dizer que as interfaces definem certas funcionalidades, as quais dependem das classes que implementam as interfaces 
    para que os métodos existam.    
     */
    public static void main(String args[]) {

        new InterfacesJava();

    }

    @Override
    public String getDataAtual() throws Exception {

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(c.getTime());

    }

    @Override
    public int getAnoAtual() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        
        return Integer.valueOf(formatador.format(cal.getTime())) ;
        // return c.get(Calendar.YEAR);
        }
}
