package model;

public abstract class AbService {
    String id ;
    String name;
    String area;
    String people;
    String standardRoom;
    String description;

    public AbService(String id, String name, String area, String people, String standardRoom, String description) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.people = people;
        this.standardRoom = standardRoom;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
