package br.edu.ibta.aluno.conversor2;


import java.math.BigDecimal;
import java.util.ArrayList;

public class Comprimento {

    public static final BigDecimal[][] TABELA_DE_CONVERSAO = generateTabelaDeConversao();

    private static BigDecimal[][] generateTabelaDeConversao() {
        BigDecimal[][] tabela = new BigDecimal[6][6];

        //DE CENTIMETRO
        tabela[0][0] = new BigDecimal("1"); //PARA CENTIMETRO
        tabela[0][1] = new BigDecimal("0.01"); //PARA METRO
        tabela[0][2] = new BigDecimal("0.00001"); //PARA QUILOMETRO
        tabela[0][3] = new BigDecimal("0.393701"); //PARA POLEGADA
        tabela[0][4] = new BigDecimal("0.0328084"); //PARA PE
        tabela[0][5] = new BigDecimal("0.0000062137"); //PARA MILHA

        //DE METRO
        tabela[1][0] = new BigDecimal("100"); //PARA CENTIMETRO
        tabela[1][1] = new BigDecimal("1"); //PARA METRO
        tabela[1][2] = new BigDecimal("0.001"); //PARA QUILOMETRO
        tabela[1][3] = new BigDecimal("0.0254"); //PARA POLEGADA
        tabela[1][4] = new BigDecimal("0.3048"); //PARA PE
        tabela[1][5] = new BigDecimal("0.000621371"); //PARA MILHA

        //DE QUILOMETRO
        tabela[2][0] = new BigDecimal("0.00001"); //PARA CENTIMETRO
        tabela[2][1] = new BigDecimal("0.001"); //PARA METRO
        tabela[2][2] = new BigDecimal("1"); //PARA QUILOMETRO
        tabela[2][3] = new BigDecimal("39370.1"); //PARA POLEGADA
        tabela[2][4] = new BigDecimal("3280.84"); //PARA PE
        tabela[2][5] = new BigDecimal("0.621371"); //PARA MILHA

        //DE POLEGADA
        tabela[3][0] = new BigDecimal("2.54"); //PARA CENTIMETRO
        tabela[3][1] = new BigDecimal("0.0254"); //PARA METRO
        tabela[3][2] = new BigDecimal("0.0000254"); //PARA QUILOMETRO
        tabela[3][3] = new BigDecimal("1"); //PARA POLEGADA
        tabela[3][4] = new BigDecimal("0.0833333"); //PARA PE
        tabela[3][5] = new BigDecimal("0.00015783"); //PARA MILHA

        //DE PE
        tabela[4][0] = new BigDecimal("30.48"); //PARA CENTIMETRO
        tabela[4][1] = new BigDecimal("0.3048"); //PARA METRO
        tabela[4][2] = new BigDecimal("0.0003048"); //PARA QUILOMETRO
        tabela[4][3] = new BigDecimal("12"); //PARA POLEGADA
        tabela[4][4] = new BigDecimal("1"); //PARA PE
        tabela[4][5] = new BigDecimal("0.000189394"); //PARA MILHA

        //DE MILHA
        tabela[5][0] = new BigDecimal("160934"); //PARA CENTIMETRO
        tabela[5][1] = new BigDecimal("1609.34"); //PARA METRO
        tabela[5][2] = new BigDecimal("1.60934"); //PARA QUILOMETRO
        tabela[5][3] = new BigDecimal("63360"); //PARA POLEGADA
        tabela[5][4] = new BigDecimal("5280"); //PARA PE
        tabela[5][5] = new BigDecimal("1"); //PARA MILHA

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
