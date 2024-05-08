import java.io.*;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main(String Args[])throws IOException{
        ClasseMétodos m = new ClasseMétodos();
        Estatistica[] estatistica = new Estatistica[10];
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------Menu Estatística--------------------\n1 - Cadastro Estatística\n2 - "
                    + "Consulta por quantidade de acientes\n3 - Consulta por estatísticas de acidentes\n4 - Acidentes acima da"
                    + " média das 10 cidades\n9 - Finaliza"));
            switch(opc){
                case 1:
                    m.cadastraestatistica(estatistica);
                    break;
                case 2:
                    m.buscaacidentes(estatistica);
                    break;
                case 3:
                    m.buscamaiormenor(estatistica);
                    break;
                case 4:
                    m.acimadamedia(estatistica);
                    break;
            }
        }
    }
}
