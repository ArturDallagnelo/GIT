import java.util.Date;

public class Clube {

    private String Time = "";
    private String Estado = "";
    private String estadio = "";
    private String CT = "";
    private int torcida = 0;
    private int qtdElenco = 0;
    private String Presidente= "";
    private Date dataFundacao;

    public Clube(String time, String estado, String estadio, String CT, int torcida, int qtdElenco, String presidente, Date dataFundacao) {
        this.Time = time;
        this.Estado = estado;
        this.estadio = estadio;
        this.CT = CT;
        this.torcida = torcida;
        this.qtdElenco = qtdElenco;
        this.Presidente = presidente;
        this.dataFundacao = dataFundacao;
    }

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

        if (qtdElenco < 1){
            System.out.println("Informe o Elenco");
            qtdInfos++;
        }

//        if (qtdInfos == 0 ){
//            System.out.println("Deu Bom");
//        }else{
//            System.out.println("Deu Ruim");
//        }


    }
}
