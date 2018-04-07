
//类与类之间的耦合度尽量降到最低


/**
 * 房间
 */
public class Rom {

    public float area;

    public float price;

    public Rom(float area, float price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rom [area = " + area + ", price=" + price + "]";
    }
}

/**
 * 中介
 */
public class Mediator {

    List<Rom> mRoms = new ArrayList<>();

    public Mediator() {
        for (int i = 0; i < 5; i++) {
            mRoms.add(new Rom(14 + i, (14 + i) * 150));
        }
    }

    public Rom rentOut(float area, float price) {
        for (Rom room : mRoms) {
            if (isSuitable(area, price, room)) {
                return room;
            }
        }

        return null;
    }

    //房间是否满足要求
    private boolean isSuitable(float area, float price, Rom room) {
        return room.price <= price && room.area >= area;
    }
}

/**
 * 租户
 */
public class Tenant {

    public void rentRoom(float roomArea, float roomPrice, Mediator mediator) {

        System.out.printf("租到房啦" + mediator.rentOut(roomArea, roomPrice));

    }

}