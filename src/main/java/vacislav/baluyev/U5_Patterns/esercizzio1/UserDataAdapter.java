package vacislav.baluyev.U5_Patterns.esercizzio1;

public class UserDataAdapter {
    private  DataSource dataSource;

    public UserDataAdapter(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public void adaptToUserData(UserData userData){
        String nomeCompleto= dataSource.getNomeCompleto();
        int eta= dataSource.getEta();
        
    }
}
