package bai1;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String name, int age, String gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
