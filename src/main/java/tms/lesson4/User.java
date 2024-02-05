package tms.lesson4;

public class User {
    public String name;
    public String login;

    public void setName(String name) {
        this.name = name;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String toString(){
        return "Имя: " + name + " Логин: " + login;
    }
}
