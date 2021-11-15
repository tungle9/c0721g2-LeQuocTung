package codegym.model;

public class User {
    String name;
    String born;
    String gender;
    String cmnd;
    String vehicle;
    String vehicleNumber;
    String dateStart;
    String dateEnd;
    String infor14days;
    //địa chỉ liên lạc
    String city;
    String address;
    String phoneNumber;
    String email;
    //triệu chứng
    String sign;
    //lịch sử nhiễm bệnh
    String situation;

    public User() {

    }

    public User(String name, String born, String gender, String cmnd, String vehicle,
                String vehicleNumber, String dateStart, String dateEnd, String infor14days, String city,
                String address, String phoneNumber, String email, String sign, String situation) {
        this.name = name;
        this.born = born;
        this.gender = gender;
        this.cmnd = cmnd;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.infor14days = infor14days;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sign = sign;
        this.situation = situation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getInfor14days() {
        return infor14days;
    }

    public void setInfor14days(String infor14days) {
        this.infor14days = infor14days;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
