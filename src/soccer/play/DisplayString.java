package soccer.play;

public class DisplayString implements IDisplayDataItem {

    private String value;

    public DisplayString(String value) {
        this.value = value;
    }

    public boolean isDetailAvailable() {
        return false;
    }

    public String getDisplayDetail() {
        return value;
    }

    public int getID() {
        return value.hashCode();
    }

    public String getDetailType() {
        return "String";
    }

    public String toString() {
        return value;
    }

}


