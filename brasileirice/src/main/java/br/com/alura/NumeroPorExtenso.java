package br.com.alura;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	public static void main(String[] args) {
		//formatando um n?mero escrevendo ele por extenso
		//formatoDeReal ele no final adiciona a palavra Real(s) e Centavos caso tenha
		//numerciConverter informa at? os centavos tamb?m
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());

		//trabalhando com BigDecimal
		//quando estiver trabalhando com moeda ? o mais recomendado
		//BigDecimal ? uma API melhorada
		BigDecimal valor = new BigDecimal("75.00");
		
		//bigdecimal que ? String sendo passado para doubleValue
		String valorPorExtenso = conversor.toWords(valor.doubleValue());
		
		System.out.println(valorPorExtenso);
	}

}
