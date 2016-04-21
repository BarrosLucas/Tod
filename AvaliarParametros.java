/*
Andar pra frente        = andarFrente(int passos)        = 0    = instrucao0
Girar pra esquerda      = girarEsquerda(int grauDeGiro)  = 1    = instrucao1
Girar pra direita       = girarDireita(int grauDeGiro)   = 2    = instrucao2
Abrir mão               = abrirMao()                     = 3    = instrucao3
Fechar mão              = fecharMao()                    = 4    = instrucao4
Olhar pra frente        = olharFrente()                  = 5    = instrucao5
Se                      = se(condicao){bloco}            = null = instrucao6
Senao                   = senao{bloco}                   = null = instrucao7
Enquanto                = enquanto(condicao){bloco}      = null = instrucao8
Procedimento            = procedimento(argumento){bloco} = null = instrucao9
Tem vazio na frente     = vazioFrente()                  = 10   = instrucao10
Tem obstáculo na frente = obstaculoFrente()              = 11   = instrucao11
A mão está aberta       = maoAberta()                    = 12   = instrucao12
A mão está fechada      = maoFechada()                   = 13   = instrucao13
*/

//CLASSE PRA AVALIAR PARÂMETROS

class AvaliarParametros{
	ExecutaCode c3 = new ExecutaCode();
	ReceberCode cP = new ReceberCode();
	String[] condicoes = {"vazioFrente","obstaculoFrente","maoAberta","maoFechada"};
	String paraInt(String comando, int indi){
		int ind = indi + 1; //O indici recebido do método é o indice do parêntese do método, adiciona-se um ao indice pra que ele conte a partir dos valores
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
	//Método que avalia se os parâmetros de uma instrução que não recebe argumentos está vazio
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
	//Método que avalia se os métodos de uma instrução que recebe boolean é de fato boolean
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