package vacislav.baluyev.U5_Patterns.esercizzio1;

public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds ){
        nomeCompleto= ds.getNomeCompleto();
        eta=ds.getEta();
    }
}
