package asw1009.viewmodel.request;

public class LoginRequestViewModel {

    private String username;
    private String password;
    private String remember;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public String getRemember() {
        return this.remember;
    }
}
