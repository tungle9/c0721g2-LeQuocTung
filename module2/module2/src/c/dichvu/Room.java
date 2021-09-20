package c.dichvu;

public class Room  extends Service{
    private String dichVufree;

    public Room(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue, String dichVufree) {
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue);
        this.dichVufree = dichVufree;
    }
    public Room(){

    }
    public Room(String dichVufree) {
        this.dichVufree = dichVufree;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("dịch vụ free");
        dichVufree = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+
                "dịch vụ free" + dichVufree;
    }
}
