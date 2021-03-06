package br.com.alura;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetaryOperators;
import org.javamoney.moneta.spi.MoneyAmountFactory;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class Dinheiro {
	public static void main(String[] args) {
		CurrencyUnit moeda = Monetary.getCurrency("BRL"); //criando a moeda, uma vari?vel, moeda corrente
		MonetaryAmount valorDaParcela = Money.of(75, moeda); //criando um valor, m?todo que recebe valor e moeda
		System.out.println(valorDaParcela);
		//trabalhando com multiplica??es valor total fica valorDaParcela x 12
		MonetaryAmount valorTotal = valorDaParcela.multiply(12); 
		//essa classe monetary amount tem as opera??es (*, /, +)
		System.out.println(valorTotal);
		
		
		//criando as moedas e atribuindo valores
		CurrencyUnit dolar = Monetary.getCurrency("USD");
		CurrencyUnit real = Monetary.getCurrency("BRL");
		MonetaryAmount valorProdutoDolar = Money.of(90, dolar);
		MonetaryAmount valorImpostoReal = Money.of(30, real);
		
		//provider que vai pegar a cota??o
		ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);
		
		//pegando a convers?o atual(do dia)
		CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);
		
		//convertendo o valor do imposto de real para dolar
		MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);
		
		//valor do imposto j? est? dolar, agora podemos somar com o valor inicial do produto
		MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);
		
		System.out.println(valorFinalProdutoDolar);
		
		//trabalhando com porcentagem ex: desconto na classe operator
		MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
		System.out.println(desconto);
		
		//convertendo monetaryamount		
		NumberValue descontoSemMoeda = desconto.getNumber();
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		//convertendo para ficar por extenso porque estava como double 
		String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
		System.out.println(valorPorExtenso);
		System.out.println("Ol? Aluno. Ganhe " + valorPorExtenso + "ouvindo nosso Podcast. LINK");
		
		
	}

}
