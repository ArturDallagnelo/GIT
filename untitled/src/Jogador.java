import java.util.Scanner;

public class Jogador{

    private String nome = "";
    private String sobrenome = "";
    private int idade = 0;

//    public Jogador(String nome, String sobrenome, int idade) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//        this.idade = idade;
//    }

    public Jogador(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void Pessoa(){
        int qtdCaracteresNome = getNome().length();
        int qtdCaracteresSobrenome = getSobrenome().length();
        String CaracteresIdade = Integer.toString(getIdade());
        int qtdCaracteresIdade = CaracteresIdade.length();
        int qtdInfos = 0;

        if (qtdCaracteresNome < 1){
            System.out.println("Informe o Nome");
            qtdInfos++;
        }

        if (qtdCaracteresSobrenome < 1){
            System.out.println("Informe o Sobrenome");
            qtdInfos++;
        }

        if (qtdCaracteresIdade < 1){
            System.out.println("Informe a Idade");
            qtdInfos++;
        }

        if (idade < 15){
            System.out.println("Jogador com Idade Abaixo de 15");
            qtdInfos++;
        }

        if (idade > 45){
            System.out.println(getNome() + " Aposentado");
            qtdInfos++;
        }

        System.out.println(getNome() + " " + getSobrenome() + " " + getIdade());
        System.out.println("");

//        if (qtdInfos == 0 ){
//            System.out.println("Deu Bom");
//        }else{
//            System.out.println("Deu Ruim");
//        }


    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }

}



