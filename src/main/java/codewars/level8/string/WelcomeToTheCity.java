package codewars.level8.string;

public class WelcomeToTheCity {
    public static void main(String[] args) {
        WelcomeToTheCity h = new WelcomeToTheCity();
        String[] name = {"John", "Smith"};
        System.out.println(h.sayHello(name, "Phoenix", "Arizona"));

        WelcomeToTheCity h1 = new WelcomeToTheCity();
        String[] name1 = {"John", "Smith", "2"};
        System.out.println(h1.sayHello(name1, "Phoenix", "Arizona"));
    }

    public String sayHello1(String[] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }

    public String sayHello2(String [] name, String city, String state){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello,");
        for(String n : name){
            sb.append(" ");
            sb.append(n);
        }
        sb.append("! Welcome to ");
        sb.append(city);
        sb.append(", ");
        sb.append(state);
        sb.append("!");
        return sb.toString();
    }

    public String sayHello(String [] name, String city, String state){
        if (name.length == 2) return "Hello, " + name[0] + " " + name[1] + "! Welcome to " + city + ", " + state + "!";
        else return "Hello, " + name[0] + " " + name[1] + " " + name[2] + "! Welcome to " + city + ", " + state + "!";
        }


}
