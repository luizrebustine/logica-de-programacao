class Cadastro {
    int NumeroEleitor;
    String NomeEleitor;
    int Secao;
    Cadastro(){
        this(0," ",0);
    }
    Cadastro(
        int numeleitor,
        String nome,
        int sec
    )
    {
        NumeroEleitor = numeleitor;
        NomeEleitor = nome;
        Secao = sec;
    }
}
