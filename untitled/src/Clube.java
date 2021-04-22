import java.util.Date;
import java.util.Scanner;

public class Clube {

    private String Time = "";
    private String Estado = "";
    private String estadio = "";
    private String CT = "";
    private int torcida = 0;
    private int qtdElenco = 0;
    private String Presidente= "";
    private Date dataFundacao;
    private Jogador jogador;
    Scanner sc = new Scanner(System.in);

    public Clube() {}

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCT() {
        return CT;
    }

    public void setCT(String CT) {
        this.CT = CT;
    }

    public int getTorcida() {
        return torcida;
    }

    public void setTorcida(int torcida) {
        this.torcida = torcida;
    }

    public int getQtdElenco() {
        return qtdElenco;
    }

    public void setQtdElenco(int qtdElenco) {
        this.qtdElenco = qtdElenco;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String presidente) {
        Presidente = presidente;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void clube(){
        int qtdCaracteresTime = getTime().length();
        int qtdCaracteresEstado = getEstado().length();
        int qtdCaracteresEstadio = getEstadio().length();
        int qtdCaracteresCT = getCT().length();
        String torcida = Integer.toString(getTorcida());
        String elenco = Integer.toString(getQtdElenco());
        int qtdTorcida = torcida.length();
        int qtdElenco = elenco.length();
        int qtdInfos = 0;

        if (qtdCaracteresTime < 1){
            System.out.println("Informe o Time");
            qtdInfos++;
        }

        if (qtdCaracteresEstado < 1){
            System.out.println("Informe o Estado");
            qtdInfos++;
        }

        if (qtdCaracteresEstadio < 1){
            System.out.println("Informe o Estádio");
            qtdInfos++;
        }

        if (qtdCaracteresCT < 1){
            System.out.println("Informe o CT");
            qtdInfos++;
        }

        if (qtdTorcida < 1){
            System.out.println("Informe a Torcida");
            qtdInfos++;
        }

//        if (qtdElenco < 1){
//            System.out.println("Informe o Elenco");
//            qtdInfos++;
//        }

//        if (qtdInfos == 0 ){
//            System.out.println("Deu Bom");
//        }else{
//            System.out.println("Deu Ruim");
//        }

    }

    public void folhaDePagamento(){
        double valor = 0, total = 0;
        String nome;
        int qtd = elenco();
        for(int i = 0; i < qtd; i++) {
                        System.out.println("Informe o nome do jogador");
            nome = sc.next();
            System.out.println("Informe o valor ");
            valor = sc.nextDouble();
            total += valor;
        }
        System.out.println(total);
    }

    public int elenco(){
        System.out.println("Informe a quantidade de jogadores");
        qtdElenco = sc.nextInt();
        return qtdElenco;
    }

}
