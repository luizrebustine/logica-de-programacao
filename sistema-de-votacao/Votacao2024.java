import java.io.*;
import javax.swing.JOptionPane;
public class Votacao2024 {
    public static void main(String Args[])throws IOException{
        Votacao[] votacao = new Votacao[200];
        VotacaoMetodos v = new VotacaoMetodos();
        int opc = 0;
        int opc2 = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------Sistema de Votação--------------------\n1 - Carregar Seção"
                    + "/Número Eleitor\n2 - Classificar por Seção\n3 - Gravar Registros\n4 - Mostrar Indicadores\n9 - Finalizar"));
            switch(opc){
                case 1:
                    v.FCadastraVotacao(votacao);
                    break;
                case 2:
                    v.FClassificaSecao(votacao);
                    break;
                case 3:
                    v.FGravaVotacao(votacao);
                    break;
                case 4:
                    while(opc2 != 9){
                        opc2 = Integer.parseInt(JOptionPane.showInputDialog("-------------------Sistema de Votação--------------------\n1 - Quantidade Eleitores por Seção"
                                + "\n2 - Seção com Maior e Menor número de Eleitores\n3 - Quantidade de votos por candidato\n4 - 10 primeiros colocadas (nro cand. e qtd votos)\n9 - Finaliza Consulta"));
                        switch(opc2){
                            case 1:
                                v.FQuantidadeCandidatos(votacao);
                                break;
                            case 2:
                                v.FSeçãoMaiorMenor(votacao);
                                break;
                            case 3:
                                v.FVotosPorCandidato(votacao);
                                break;
                            case 4:
                                v.FDezCandidatos(votacao);
                                break;
                        }
                    }
                break;
            }
        }
    }
}
