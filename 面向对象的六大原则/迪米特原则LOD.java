
//������֮�����϶Ⱦ����������


/**
 * ����
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
 * �н�
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

    //�����Ƿ�����Ҫ��
    private boolean isSuitable(float area, float price, Rom room) {
        return room.price <= price && room.area >= area;
    }
}

/**
 * �⻧
 */
public class Tenant {

    public void rentRoom(float roomArea, float roomPrice, Mediator mediator) {

        System.out.printf("�⵽����" + mediator.rentOut(roomArea, roomPrice));

    }

}