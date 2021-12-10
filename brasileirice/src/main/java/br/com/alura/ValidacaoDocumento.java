package br.com.alura;

import java.text.Format;
import java.util.Formatter;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.NITValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		
		//valida com ou sem máscara
		
		String cpf = "87897240037" ; 
		//um validador de CPF que já está no pacote da StellaCaelum
		//CPFValidator validador = new CPFValidator();
		//validando o cpf com try catch exception
		try {//passando o validador e o documento
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF VÁLIDO.");
			
		}catch(InvalidStateException e) {
			System.out.println("CPF INVÁLIDO : " + e); //'e' chamando a exception
		}
		
		
		String cnpj = "01209895000131";
		try { //passando validador e documento
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ VÁLIDO. ");
			
		}catch(InvalidStateException e) {
			System.out.println("CNPJ INVÁLIDO: " + e);
			
		}
		
		String titulo = "413713140884";
		try {//passando o validador com parâmetro
			validarDocumentos(new TituloEleitoralValidator(), titulo);
			System.out.println("TÍTULO DE ELEITOR VÁLIDO");
			
		}catch(InvalidStateException e) {
		
			System.out.println("TÍTULO DE ELEITOR INVÁLIDO : " + e);
			
		}
		
		String nit = "441.34005.13-8";
		try {
			validarDocumentos(new NITValidator(), nit);
			System.out.println("NIT VÁLIDO");
			
		}catch(InvalidStateException e) {
			
			System.out.println("NIT INVÁLIDO");
		}
		
		

	}
	
	//utilizando o assertValidator em apenas um lugar que irá replicar para os outros
	//como todos os docs são Strings facilitou
	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
	

}


//