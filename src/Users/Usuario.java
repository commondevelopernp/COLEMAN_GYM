package Users;

public abstract class Usuario {
    protected int edad;
    protected String sexoBiologico;
    protected String email;
    protected String password;
    protected AdapterLogin adapterLogin = new LoginExterno();

    public String loguearse(String email, String password){
        return adapterLogin.login(email, password);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public String getSexoBiologico() {
        return this.sexoBiologico;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

}
