package vacislav.baluyev.U5_Patterns.esercizzio1;

import java.util.Date;

public class InfoAdapter implements DataSource{
    private Info info;
    public InfoAdapter(Info info){this.info= info;}

    @Override
    public String getNomeCompleto(){return info.getNome()+ " " +info.getCognome();}

    @Override
    public int getEta() {
        long diffInMillis= new Date().getTime() - info.getDataDiNascita().getTime();
        long diffInYears= diffInMillis/ (1000L* 60*60*24*365);
        return (int) diffInYears;
    }

}
