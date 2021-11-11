package model;

public class Service extends AbService{

    public Service(String id, String name, String area, String people, String standardRoom, String description) {
        super(id, name, area, people, standardRoom, description);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
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
    public String getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(String area) {
        super.setArea(area);
    }

    @Override
    public String getPeople() {
        return super.getPeople();
    }

    @Override
    public void setPeople(String people) {
        super.setPeople(people);
    }

    @Override
    public String getStandardRoom() {
        return super.getStandardRoom();
    }

    @Override
    public void setStandardRoom(String standardRoom) {
        super.setStandardRoom(standardRoom);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}
