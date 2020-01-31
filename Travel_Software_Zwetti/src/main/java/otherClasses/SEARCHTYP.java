
package otherClasses;


public enum SEARCHTYP {
    ZIP("zip"),
    NAME("q");

    private String action;

    public String getAction() {
        return this.action;
    }

    // enum constructor - cannot be public or protected 
    private SEARCHTYP(String action) {
        this.action = action;
    }
}
