package br.edu.ibta.aluno.conversor2;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Temperatura {


    public static final BigDecimal[][] TABELA_DE_CONVERSAO = generateTabelaDeConversao();

    private static BigDecimal[][] generateTabelaDeConversao() {
        BigDecimal[][] tabela = new BigDecimal[3][3];

        //DE CELSIUS
        tabela[0][0] = new BigDecimal("1.0"); //PARA CELSIUS
        tabela[0][1] = new BigDecimal("1.0"); //PARA FAHRENHEIT
        tabela[0][2] = new BigDecimal("1.0");  //PARA KELVIN

        //DE FAHRENHEIT
        tabela[1][0] = new BigDecimal("1.0");  //PARA CELSIUS
        tabela[1][1] = new BigDecimal("1.0"); //PARA FAHRENHEIT
        tabela[1][2] = new BigDecimal("1.0"); //PARA KELVIN

        //DE KELVIN
        tabela[2][0] = new BigDecimal("1.0");//PARA CELSIUS
        tabela[2][1] = new BigDecimal("1.0"); //PARA FAHRENHEIT
        tabela[2][2] = new BigDecimal("1.0");  //PARA KELVIN

        return tabela;

    }

    public static ArrayList<Unidade> getUnidadesAsKeyValueArray(String[] unidades) {

        ArrayList<Unidade> pairs = new ArrayList<>();

        for (int i = 0; i < unidades.length; i++) {
            pairs.add(new Unidade(i, unidades[i]));
        }
        return pairs;
    }
}