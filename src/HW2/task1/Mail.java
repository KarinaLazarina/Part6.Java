package HW2.task1;

import java.sql.SQLOutput;

public class Mail {
    String site;
    String login;
    String password;

    public Mail() {
    }

    public Mail(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String login, String password){
        if (this.password == password && this.login == login){
            System.out.println("You log in!");
        }else{
            System.out.println("Your password or email are not correct");
        }

    }
}
