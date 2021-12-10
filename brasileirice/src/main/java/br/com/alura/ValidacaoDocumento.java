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
		
		//valida com ou sem m�scara
		
		String cpf = "87897240037" ; 
		//um validador de CPF que j� est� no pacote da StellaCaelum
		//CPFValidator validador = new CPFValidator();
		//validando o cpf com try catch exception
		try {//passando o validador e o documento
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF V�LIDO.");
			
		}catch(InvalidStateException e) {
			System.out.println("CPF INV�LIDO : " + e); //'e' chamando a exception
		}
		
		
		String cnpj = "01209895000131";
		try { //passando validador e documento
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ V�LIDO. ");
			
		}catch(InvalidStateException e) {
			System.out.println("CNPJ INV�LIDO: " + e);
			
		}
		
		String titulo = "413713140884";
		try {//passando o validador com par�metro
			validarDocumentos(new TituloEleitoralValidator(), titulo);
			System.out.println("T�TULO DE ELEITOR V�LIDO");
			
		}catch(InvalidStateException e) {
		
			System.out.println("T�TULO DE ELEITOR INV�LIDO : " + e);
			
		}
		
		String nit = "441.34005.13-8";
		try {
			validarDocumentos(new NITValidator(), nit);
			System.out.println("NIT V�LIDO");
			
		}catch(InvalidStateException e) {
			
			System.out.println("NIT INV�LIDO");
		}
		
		

	}
	
	//utilizando o assertValidator em apenas um lugar que ir� replicar para os outros
	//como todos os docs s�o Strings facilitou
	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
	

}


//