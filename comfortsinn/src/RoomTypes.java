import java.math.BigDecimal;

public enum RoomTypes {
    SINGLE(new BigDecimal(10000), 20),
    DOUBLE(new BigDecimal(15000), 10),
    SUITE(new BigDecimal(20000), 10);

    final BigDecimal amount;
    final int numbersOfRooms;

    RoomTypes(BigDecimal amount,int numbersOfRooms) {
        this.amount = amount;
        this.numbersOfRooms = numbersOfRooms;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }
    public BigDecimal getPercentAmount( BigDecimal percent) {
        BigDecimal amount = this.amount.multiply(percent).divide(BigDecimal.valueOf(100));
        return amount;
    }

}

