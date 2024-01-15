package it.epicode.week2.day1;

public class ContoOnline extends ContoCorrente{
    double maxPrelievo;
    ContoOnline(String titolare,double saldo,double maxPrelievo){
        super(titolare, saldo);
        this.maxPrelievo=maxPrelievo;
    }

    @Override
    public String toString() {
        return "ContoOnline{" +
                "maxPrelievo=" + maxPrelievo +
                ", titolare='" + titolare + '\'' +
                ", nMovimenti=" + nMovimenti +
                ", maxMovimenti=" + maxMovimenti +
                ", saldo=" + saldo +
                '}';
    }

    void preleva(double x) throws BancaException {
        if(x<=maxPrelievo){
            super.preleva(x);
        }else{
            throw new BancaException("Il prelievo non è disponibile");
        }
    }
}
