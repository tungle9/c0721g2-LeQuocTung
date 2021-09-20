package abc.Students;

import java.util.ArrayList;

public class Students {
    private ArrayList<ManangerStudents> list;

    public Students(ArrayList<ManangerStudents> list) {
        this.list = list;
    }

    public Students() {
        this.list = new ArrayList<>();
    } // thêm đối tượng

    public void add(ManangerStudents manangerStudents) {
        list.add(manangerStudents);
    }

    public void clear() {
        list.removeAll(list);
    } // tìm theo tên

    public void find(String name) {
        boolean check = true;
        for (ManangerStudents manangerStudents : list) {
            if (manangerStudents.getName().equals(name)) {
                System.out.println(manangerStudents);
                check = false;
            }
        }
        if (check) {
            System.out.println("không tìm thấy");
        }
    }
    public int result() {
        return list.size();
    } // xóa theo vị trí index

    public void delete(int a) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                list.remove(i);
            }
        }
    }

    public void show() {
        System.out.println(list);
    }

    public boolean check() {
        return list.isEmpty();
    }
}