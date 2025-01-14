import java.math.BigDecimal;

public enum RoomTypes {
    SINGLE(new BigDecimal(10000)),
    DOUBLE(new BigDecimal(15000)),
    SUITE(new BigDecimal(20000));

    final BigDecimal amount;

    RoomTypes(BigDecimal amount) {
        this.amount = amount;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public BigDecimal getPercentAmount( BigDecimal percent) {
        BigDecimal amount = this.amount.multiply(percent).divide(BigDecimal.valueOf(100));
        return amount;
    }

}

