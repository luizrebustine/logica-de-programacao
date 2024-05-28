class Eleicao{
    int Secao;
    int CodigoCandidato;
    int NumeroEleitor;
    Eleicao(){
        this(0,0,0);
    }
    Eleicao(
        int sec,
        int codcad,
        int numeleitor
    )
    {
        Secao = sec;
        CodigoCandidato = codcad;
        NumeroEleitor = numeleitor;
    }
}
