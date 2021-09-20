package abc.Students;

import java.util.Objects;

public class ManangerStudents implements Comparable<ManangerStudents>{
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
    public ManangerStudents(String name ){
        this.name = name ;
    }  public ManangerStudents(int msv ){
        this.msv = msv ;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManangerStudents students = (ManangerStudents) o;
        return msv == students.msv &&
                Objects.equals(msv, students.msv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, msv, born, point);
    }

    @Override  // hàm so sánh
    public int compareTo(ManangerStudents o) {
        return this.name.compareTo(o.name);
    }
}
