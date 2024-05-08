import java.io.*;
import javax.swing.JOptionPane;
public class Votacao2024 {
    public static void main(String Args[])throws IOException{
        Votacao[] votacao = new Votacao[200];
        VotacaoMetodos v = new VotacaoMetodos();
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------Sistema de Votação--------------------\n1 - Carregar Seção"
                    + "/Número Eleitor\n2 - Classificar por Seção\n3 - Gravar Registros\n4 - Mostrar Indicadores\n9 - Finalizar"));
            switch(opc){
                case 1:
                    v.FCadastraVotacao(votacao);
                    break;
                case 2:
                    break;
                case 3:
                    v.FGravaVotacao(votacao);
                    break;
            }
        }
    }
}
