package abc.Students;

public class ManangerStudents {
    private String name;
    private int msv;
    private int born;
    private double point;

    public ManangerStudents(String name, int msv, int born, double point) {
        this.name = name;
        this.msv = msv;
        this.born = born;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "ManangerStudents{" +
                "name='" + name + '\'' +
                ", msv=" + msv +
                ", born=" + born +
                ", point=" + point +
                '}';
    }
}
