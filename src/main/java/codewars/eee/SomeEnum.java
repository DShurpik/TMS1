package codewars.eee;

public enum SomeEnum {
    STRING1 ("String1 item"),
    STRING2 ("String2 item"),
    STRING3("String3 item"),
    STRING4("String4 item");

    private String item;

    SomeEnum(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
