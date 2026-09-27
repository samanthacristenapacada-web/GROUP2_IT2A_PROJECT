package salon.model;

public enum Appointmentstatus {
    PENDING,
    APPROVED,
    CANCELLED;

    @Override
    public String toString() {
        return name();
    }
}