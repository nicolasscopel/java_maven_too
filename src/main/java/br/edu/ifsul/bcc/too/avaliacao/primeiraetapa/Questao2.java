/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 20222PF.CC0019
 *
 * 2) Finalize a implementação da classe Questao2 no mesmo pacote da questão
 * anterior. O método classificacao, deverá converter e adicionar todos os
 * elementos do vetor dados em uma Collection para que sejam classificados
 * (automaticamente) em ordem crescente a medida que forem sendo adicionados. Se
 * não for possível converter, adicione o valor 0 (zero). Por fim, imprima na
 * tela os elementos classificados. (Peso: 1,5)
 */
public class Questao2 {

    private String[] dados = {"80", "1500", "b", "-2", "c", "-50", "22", "6"};
    private Set<Integer> st;

    private void classificacao() {

        Collection<Integer> valores = new TreeSet();
        Integer val;
        int i = 0;
        while (i < dados.length) {

            try {
                String cod = dados[i];
                val = Integer.parseInt(cod);
                valores.add(val);
                
               

            } catch (Exception e) {
                valores.add(0);
            }

            //System.out.println(dados[i]);
            i++;

        }
        System.out.println(valores);
       

    }

    public Questao2() {
        classificacao();

    }

    public static void main(String[] args) {

        new Questao2();
    }

}
