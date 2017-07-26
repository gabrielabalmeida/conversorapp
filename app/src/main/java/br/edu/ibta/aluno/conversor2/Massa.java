package br.edu.ibta.aluno.conversor2;

import java.math.BigDecimal;
import java.util.ArrayList;


public class Massa {

    public static final BigDecimal[][] TABELA_DE_CONVERSAO = generateTabelaDeConversao();

    private static BigDecimal[][] generateTabelaDeConversao() {
        BigDecimal[][] tabela = new BigDecimal[4][4];

        //DE GRAMA
        tabela[0][0] = new BigDecimal("1.0"); //PARA GRAMA
        tabela[0][1] = new BigDecimal("0.001"); //PARA QUILOGRAMA
        tabela[0][2] = new BigDecimal("0.00220462"); //PARA LIBRA
        tabela[0][3] = new BigDecimal("0.035274"); //PARA ONÇA

        //DE QUILOGRAMA
        tabela[1][0] = new BigDecimal("1000"); //PARA GRAMA
        tabela[1][1] = new BigDecimal("1"); //PARA QUILOGRAMA
        tabela[1][2] = new BigDecimal("2.20462"); //PARA LIBRA
        tabela[1][3] = new BigDecimal("35.274"); //PARA ONÇA

        //DE LIBRA
        tabela[2][0] = new BigDecimal("453.592"); //PARA GRAMA
        tabela[2][1] = new BigDecimal("0.453592"); //PARA QUILOGRAMA
        tabela[2][2] = new BigDecimal("1"); //PARA LIBRA
        tabela[2][3] = new BigDecimal("16"); //PARA ONÇA

        //DE ONÇA
        tabela[3][0] = new BigDecimal("28.3495"); //PARA GRAMA
        tabela[3][1] = new BigDecimal("0.0283495"); //PARA QUILOGRAMA
        tabela[3][2] = new BigDecimal("0.0625"); //PARA LIBRA
        tabela[3][3] = new BigDecimal("1"); //PARA ONÇA

        return tabela;
    }

    public static ArrayList<Unidade> getUnidadesAsKeyValueArray2(String[] unidades) {

        ArrayList<Unidade> pairs = new ArrayList<>();

        for (int i = 0; i < unidades.length; i++) {
            pairs.add(new Unidade(i, unidades[i]));
        }
        return pairs;
    }
}