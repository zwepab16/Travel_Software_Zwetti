
package otherClasses;


public enum SEARCHTYP {
    ZIP("zip"),
    NAME("q");

    private String action;

    public String getAction() {
        return this.action;
    }


    private SEARCHTYP(String action) {
        this.action = action;
    }
}
