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

//CLASSE PRA AVALIAR PAR�METROS

class AvaliarParametros{
	ExecutaCode c3 = new ExecutaCode();
	ReceberCode cP = new ReceberCode();
	String[] condicoes = {"vazioFrente","obstaculoFrente","maoAberta","maoFechada"};
	String paraInt(String comando, int indi){
		int ind = indi + 1; //O indici recebido do m�todo � o indice do par�ntese do m�todo, adiciona-se um ao indice pra que ele conte a partir dos valores
		String parametro = "";
		if(comando.length() > ind){
			while(comando.charAt(ind) != ')' && comando.length() != ind){
				parametro += comando.charAt(ind);
				ind ++;
			}
		}
	    try{
            Integer.parseInt(parametro);
            return parametro;
        }catch(Exception e){
            return "error";
        }
    }
	//M�todo que avalia se os par�metros de uma instru��o que n�o recebe argumentos est� vazio
	boolean paraVazio(String comando,int indi){
		int ind = indi++;
		String parametro = "";
		while(comando.charAt(ind) != ')' && comando.length() != ind){
			parametro += comando.charAt(ind);
			ind ++;
		}
		if (parametro.length() > 0){
			return false;
		}else{
			return true;
		}
	}
	//INCOMPLETO
	//M�todo que avalia se os m�todos de uma instru��o que recebe boolean � de fato boolean
	String paraBoolean(String comando, int indi){
		int ind = indi ++;
		String parametro = "";
		if (comando.length() > ind){
			while(comando.charAt(ind) != ')' && comando.length() != ind){
				parametro += comando.charAt(ind);
				ind ++;
			}
		}
		if (parametro.equals("verdadeiro") == true){
			return "verdadeiro";
		}else{
			return "falso";
		}
	}
}