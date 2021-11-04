package model;

public class Employee extends Human{


    public Employee(int id, String name, String email, String birthday, int phone) {
        super(id, name, email, birthday, phone);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public int getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone);
    }
}
