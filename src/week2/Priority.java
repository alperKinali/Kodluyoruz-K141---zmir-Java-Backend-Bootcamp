package week2;

public enum Priority {
    HIGH(3) , MEDİUM(2) , LOW(1);

    private  int value;

    public int getValue() {
        return value;
    }

    Priority(int value) {
        this.value = value;
    }
}
