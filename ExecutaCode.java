/*
Andar pra frente        = andarFrente(int passos)        = 0    = instrucao0
Girar pra esquerda      = girarEsquerda(int grauDeGiro)  = 1    = instrucao1
Girar pra direita       = girarDireita(int grauDeGiro)   = 2    = instrucao2
Abrir m�o               = abrirMao()                     = 3    = instrucao3
Fechar m�o              = fecharMao()                    = 4    = instrucao4
Olhar pra frente        = olharFrente()                  = 5    = instrucao5
Se                      = se(condicao){bloco}            = null = instrucao6
Senao                   = senao{bloco}                   = null = instrucao7
Enquanto                = enquanto(condicao){bloco}      = null = instrucao8
Procedimento            = procedimento(argumento){bloco} = null = instrucao9
Tem vazio na frente     = vazioFrente()                  = 10   = instrucao10
Tem obst�culo na frente = obstaculoFrente()              = 11   = instrucao11
A m�o est� aberta       = maoAberta()                    = 12   = instrucao12
A m�o est� fechada      = maoFechada()                   = 13   = instrucao13
*/

//CLASSE PRA EXECUTAR INSTRU��ES

class ExecutaCode{
	ReceberCode cP = new ReceberCode();
	AvaliarParametros c2 = new AvaliarParametros();
	ReconhecerInstrucao c4 = new ReconhecerInstrucao();
	//Executa a instru��o andarFrente(int quant)
	void instrucao0(String comando, int ind){
		String parametro = c2.paraInt(comando,ind);
		if(parametro.equals("error") == false){
			int vezes = Integer.valueOf(parametro);
			for(int i = 0; i < vezes; i ++){
				//Comando Android Bluetooth pra mandar o carro pra frente
			}
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}
	//Executa a instru��o girarEsquerda(int grau)
	void instrucao1(String comando, int ind){
		String parametro = c2.paraInt(comando,ind);
		if(parametro.equals("error") == false){
			int grau = Integer.valueOf(parametro);
			//Comando Android pra mandar o carro girar para a esquerda o grau informado
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}
	//Executa a instru��o girarDireita(int grau)
	void instrucao2(String comando, int ind){
		String parametro = c2.paraInt(comando,ind);
		if(parametro.equals("error") == false){
			int grau = Integer.valueOf(parametro);
			//Comando Android pra mandar o carro girar para a direita o grau informado
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}	
	//Executa a instru��o abrirMao()
	void instrucao3(String comando, int ind){
		boolean parametro = c2.paraVazio(comando,ind);
		if(parametro == true && cP.mao == 0){
			//Comando Android pra mandar o carro abrir a m�o
			cP.mao ++;
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}
	//Executa a intru��o fecharMao()
	void instrucao4(String comando, int ind){
		boolean parametro = c2.paraVazio(comando,ind);
		if(parametro == true && cP.mao == 1){
			//Comando Android pra mandar o carro fechar a m�o
			cP.mao --;
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}
	//Executa a instru��o verFrente()
	void instrucao5(String comando, int ind){
		boolean parametro = c2.paraVazio(comando,ind);
		if(parametro == true){
			//Comando para informar a dist�ncia que o carro est� de um obst�culo
		}else{
			//Comando Android pra informar erro ao usu�rio
		}
	}
	void instrucao6(String comando, int ind){
	
	}
	void instrucao7(String comando, int ind){
	
	}
	void instrucao8(String comando, int ind){
	
	}
	void instrucao9(String comando, int ind){
	
	}
	//Executa a instru��o vazioFrente()
	boolean instrucao10(String comando, int ind){
		boolean parametro = c2.paraVazio();
		if (distCarro < 30cm){
			return false;
		}else {
			return true;
		}
	}
	boolean instrucao11(String comando, int ind){
		boolean parametro = c2.paraVazio();
		if (distCarro < 30cm){
			return true;
		}else {
			return false;
		}
	}
	boolean instrucao12(String comando, int ind){
		boolean parametro = c2.paraVazio();
		if (cP.mao == 1){
			return true;
		}else{
			return false;
		}
	}
	boolean instrucao13(String comando, int ind){
		boolean parametro = c2.paraVazio();
		if (cP.mao == 0){
			return true;
		}else{
			return false;
		}
	}
	
}