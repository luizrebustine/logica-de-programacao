class Votacao{
    int NumeroSecao;
    int NumeroCandidato;
    Votacao(){
        this(0,0);
    }
    Votacao(
        int numsec,
        int numcand
    )
    {
        NumeroSecao = numsec;
        NumeroCandidato = numcand;
    }
}
