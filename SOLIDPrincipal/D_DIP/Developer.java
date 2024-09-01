package SOLIDPrincipal.D_DIP;

//Low level module
public class Developer implements Workers{
    @Override
    public void work() {
        System.out.println("Developer is developing software");
    }
}
