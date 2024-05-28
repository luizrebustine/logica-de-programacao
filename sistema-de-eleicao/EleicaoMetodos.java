import java.io.*;
import javax.swing.*;
public class EleicaoMetodos{
    public Cadastro[] cadastraeleitor(Cadastro[] cadastro, int indice) throws IOException{
        String nomearquivo = "cadastro.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(nomearquivo));
        int i;
        for(i=0;i<10;i++){
            cadastro[i] = new Cadastro();
        }
        cadastro[indice].NomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor");
        gravar.write(cadastro[indice].NomeEleitor);
        gravar.newLine();
        cadastro[indice].NumeroEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor"));
        gravar.write(Integer.toString(cadastro[indice].NumeroEleitor));
        gravar.newLine();
        cadastro[indice].Secao = Integer.parseInt(JOptionPane.showInputDialog("Digite a seção"));
        gravar.write(Integer.toString(cadastro[indice].Secao));
        gravar.newLine();
        gravar.close();
        return cadastro;
    }
    /*public int verificaquantidade() throws IOException{
        String linha = "";
        int i = 0;
        String nomearquivo = "cadastro.txt";
        BufferedReader ler = new BufferedReader(new FileReader(nomearquivo));
        while(linha != null){
            i++;
            linha = ler.readLine();
        }
        return i;
    }
    */
}