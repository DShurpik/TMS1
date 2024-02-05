package tms.lesson5;

public class User{
    User(){
        this.name = name;
        this.login = login;
    }
    public String name;

    public String login;

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Имя " + name + " login " + login ;
    }
}
