class Estatistica{
int codigo;
String nome;
int acidentes;
Estatistica()
{
    this(0," ", 0);
}
Estatistica(
    int codcid,
    String nomecid,
    int qtdacd
)
{
    codigo = codcid;
    nome = nomecid;
    acidentes = qtdacd;
}
}