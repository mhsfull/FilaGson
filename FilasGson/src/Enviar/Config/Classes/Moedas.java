package Enviar.Config.Classes;

public class Moedas extends CotacaoMoeda {
    public CotacaoMoeda getUSD() {
        return USD;
    }

    public void setUSD(CotacaoMoeda USD) {
        this.USD = USD;
    }

    public CotacaoMoeda getEUR() {
        return EUR;
    }

    public void setEUR(CotacaoMoeda EUR) {
        this.EUR = EUR;
    }

    public CotacaoMoeda getETH() {
        return ETH;
    }

    public void setETH(CotacaoMoeda ETH) {
        this.ETH = ETH;
    }

    public CotacaoMoeda getBTC() {
        return BTC;
    }

    public void setBTC(CotacaoMoeda BTC) {
        this.BTC = BTC;
    }

    private CotacaoMoeda USD;
    private CotacaoMoeda EUR;
    private CotacaoMoeda ETH;
    private CotacaoMoeda BTC;


}
