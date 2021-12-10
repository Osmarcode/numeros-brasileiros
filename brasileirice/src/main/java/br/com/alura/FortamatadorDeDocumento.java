package br.com.alura;

import java.text.Format;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;
import br.com.caelum.stella.validation.Validator;

public class FortamatadorDeDocumento {
public static void main(String[] args) {
	String cpf = "878.972.400-37" ; //vamos tirar a formata��o
	String cnpj = "98.610.832/0001-24"; //tirar a formata��o
	String titulo = "413713140884"; //formatar
	String nit = "44134005138";
	
	//classe que formata o CPF
	//chamando a classe e instanciando um objeto
	//chamando o m�todo que formata
	//criando um atributo que recebe a formata��o
//	CPFFormatter formatadorCPF = new CPFFormatter();
//	String cpfSemFormatacao = formatadorCPF.unformat(cpf);
//	System.out.println(cpf);//o cpf normal com formata��o
//	System.out.println(cpfSemFormatacao);//o cpf recebendo o unformat
	
	
	CNPJFormatter formatadorCNPJ = new CNPJFormatter();
	String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);
	System.out.println(cnpj);
	System.out.println(cnpjSemFormatacao);
	
	TituloEleitoralFormatter formatadorTitulo = new TituloEleitoralFormatter();
	String tituloComFormatacao = formatadorTitulo.format(titulo);
	System.out.println(titulo);
	System.out.println(tituloComFormatacao);
	
	NITFormatter formatadorNIT = new NITFormatter();
	String nitComFormatacao = formatadorNIT.format(nit);
	System.out.println(nit);
	System.out.println(nitComFormatacao);
	
	
	
   }
	private String formatarDocumento(Formatter formatador, String documento) {
		return formatador.format(documento);
	}
       
}


//alguns sites n�o aceitam esses documentos formatados
//apenas n�meros como o paypal por exemplo