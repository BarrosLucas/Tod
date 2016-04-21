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

class ReconhecerInstrucao{
	ReceberCode cP = new ReceberCode();
	AvaliarParametros c2 = new AvaliarParametros();
	ExecutaCode c3 = new ExecutaCode();
	void reconhecerComando(String comando,int indice){
		String instrucao = "";
		int ind = indice;
		if(comando.length() > ind){
			while(comando.charAt(ind) != '{' && comando.charAt(ind) != '(' && comando.charAt(ind) != '}' && comando.charAt(ind) != ')' && ind != comando.length()){
				instrucao += comando.charAt(ind);
				ind ++;
			}
		}
		cP.compararComando(instrucao, ind);
	}
}