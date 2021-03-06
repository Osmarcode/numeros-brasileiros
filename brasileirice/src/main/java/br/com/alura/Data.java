package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
	public static void main(String[] args) {
		//retorna a data atual
		//ofPattern recebe a String que queremos criar o padr?o
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatadorHora));
		
		//criando um formatador de hora que n?o precisa criar o ofPattern
		//SHORT OU MEDIUM LOCALIZEDDATETIME
		//criando um novo locale que ? do tipo ENUM
		//esse Locale vai ser respeitado em m?quinas que estejam em qualquer l?ngua
		//vai respeitar esse Locale em pt
		DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));           
		System.out.println(agora.format(formatadorCurto));
		
		//minus e plus para trabalhar com horas, minutos e segundos
		//api do java para trabalhar com horas
		//subtraindo horas como se fosse um fuso-hor?rio
		System.out.println(agora.minusHours(5));
		
		//adicionando horas
		System.out.println(agora.plusHours(10));
		
		
			
	}

}
