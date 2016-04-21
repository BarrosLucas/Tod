/*
Andar pra frente         = andarFrente(int passos)        = 0    = instrucao0
Girar pra esquerda       = girarEsquerda(int grauDeGiro)  = 1    = instrucao1
Girar pra direita        = girarDireita(int grauDeGiro)   = 2    = instrucao2
Abrir m�o                = abrirMao()                     = 3    = instrucao3
Fechar m�o               = fecharMao()                    = 4    = instrucao4
Olhar pra frente         = olharFrente()                  = 5    = instrucao5
Se                       = se(condicao){bloco}            = null = instrucao6
Senao                    = senao{bloco}                   = null = instrucao7
Enquanto                 = enquanto(condicao){bloco}      = null = instrucao8
Procedimento             = procedimento(argumento){bloco} = null = instrucao9
Tem vazio na frente      = vazioFrente()                  = 10   = instrucao10
Tem obst�culo na frente  = obstaculoFrente()              = 11   = instrucao11
A m�o est� aberta        = maoAberta()                    = 12   = instrucao12
A m�o est� fechada       = maoFechada()                   = 13   = instrucao13
*/

//CLASSE RESPONS�VEL POR IDENTIFICAR E CHAMAR INSTRU��ES

class ReceberCode{
	ExecutaCode c3 = new ExecutaCode();
	AvaliarParametros c2 = new AvaliarParametros();
	
	int mao = 0;
	
	//Reconhece in�cio e fim de uma instru��o
	//Esse m�todo vai receber todo o c�digo do usu�rio e pegar as instru��es
	void reconhecerComando(String comando){
		String instrucao = "";
		int ind = 0;
		if(comando.length() > ind){
			while(comando.charAt(ind) != '{' && comando.charAt(ind) != '(' && comando.charAt(ind) != '}' && comando.charAt(ind) != ')' && ind != comando.length()){
				instrucao += comando.charAt(ind);
				ind ++;
			}
		}
		compararComando(instrucao, ind);
	}
	//Esse m�todo vai reconhecer se o comando que o usu�rio digitou est� incluso nos comandos do Tod
	void compararComando(String comando, int indice){
		String[] instrucoes = {"andarFrente","girarEsquerda","girarDireita","abrirMao","fecharMao","olharFrente","se","senao","enquanto","procedimento","vazioFrente","obstaculoFrente"};
		int ind = 0;
		while ((comando.equals(instrucoes[ind]) == false) && ind < 10){
			ind ++;
		}
		if (ind == 0){
			c3.instrucao0(comando,indice);
		}
		else if (ind == 1){
			c3.instrucao1(comando,indice);
		}
		else if (ind == 2){
			c3.instrucao2(comando,indice);
		}
		else if (ind == 3){
			c3.instrucao3(comando,indice);
		}
		else if (ind == 4){
			c3.instrucao4(comando,indice);
		}
		else if (ind == 5){
			c3.instrucao5(comando,indice);
		}
		else if (ind == 6){
			c3.instrucao6(comando,indice);
		}
		else if (ind == 7){
			c3.instrucao7(comando,indice);		
		}
		else if (ind == 8){
			c3.instrucao8(comando,indice);
		}
		else if (ind == 9){
			c3.instrucao9(comando,indice);
		}
		else if (ind == 10){
			c3.instrucao10(comando,indice);
		}
		else if (ind == 11){
			c3.instrucao11(comando,indice);
		}
		else if (ind == 12){
			c3.instrucao12(comando,indice);
		}
		else if (ind == 13){
			c3.instrucao13(comando,indice);
		}
		else{
			//Informar mensagem de erro ao usu�rio
		}
	}
}