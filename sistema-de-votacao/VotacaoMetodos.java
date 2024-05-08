import java.io.*;
import javax.swing.*;
public class VotacaoMetodos {
    public Votacao[] FCadastraVotacao(Votacao[] votacao){
        int i;
        for(i=0;i<200;i++){
            votacao[i] = new Votacao();
        }
        for(i=0;i<200;i++){
            votacao[i].NumeroSecao = (int)(Math.random()*10);
            votacao[i].NumeroCandidato = (int)(Math.random()*300);
        }
        return votacao;
        //Usar bubble sort para ordenar os registros.
    }
    public void FClassificaSecao(Votacao[] votacao){
        int i, j, aux;
        
    }
    public void FGravaVotacao(Votacao[] votacao)throws IOException{
        String nomearquivo = "votacao.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(nomearquivo));
        int i;
        for(i=0;i<200;i++){
            gravar.write(Integer.toString(votacao[i].NumeroSecao));
            gravar.newLine();
            gravar.write(Integer.toString(votacao[i].NumeroCandidato));
            gravar.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        gravar.close();
    }
}
