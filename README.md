Neste projeto da Alura foi apresentada uma API a Stella Caelum que facilita na validação e formatação de documentos que só existem no Brasil como: CPF, CNPJ, Título, NIT. Foram usados alguns exemplos demonstrando como fazer essas chamadas

Trabalhar com valores monetários utilizando a webservice do Moneta que pode ser encontrado no repositório maven https://mvnrepository.com/search?q=moneta dos pacotes javax.javamoney podendo se trabalhar com diversas moedas um exemplo de criação de moedas CurrencyUnit moeda = Monetary.getCurrency("BRL" ou "USD") e foi usado a classe BigDecimal que é mais recomendada para utilizar valores monetários;

Números por extenso utilizando Stella Caelum utilizando NumericToWordsConverter e FormatoDeReal.

Como manipualar datas e configuração no nosso padrão "dd/mm/yyyy" utilizando LocalDate, LacalDateTime da Lib java.time... e algumas outras funções como por exemplo essa essa chamada que retorna a data da execução do código: 
LocalDateTime agora = LocalDateTime.now();
System.out.println(agora);

Foi utilizado também a API ViaCep e mostrada sua forma de retorno de informações endereço tendo como parâmetros logradouro, número, bairro, município, complemento, ibge, UF...  entre outros relacionados à endereços.

Obs.: alguns trechos do código estã comentados para melhor entendimento do projeto. IDE utilizada foi o Eclipse.