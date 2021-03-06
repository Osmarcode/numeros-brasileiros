package br.com.alura;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

/*
 * trabalhando com CEP da API ViaCep que foi inclu?da no pom
 * 
 * */
public class CEP {
	public static void main(String[] args) {

		ViaCEPClient cliente = new ViaCEPClient();
		
		try {
			ViaCEPEndereco endereco = cliente.getEndereco("50860130");
			System.out.println(endereco.getBairro());
			System.out.println(endereco.getLogradouro());
			System.out.println(endereco.getLocalidade());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
