package abc.dictionary;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
    private TreeMap<String,String> list ;
    public Dictionary(){
        this.list = new TreeMap<>();
    }
    public void add(String TuKhoa,String Ynghia ){
        list.put(TuKhoa,Ynghia);
    }
    public String delete(String TuKhoa){
        list.remove(TuKhoa);
        return "Đã xóa từ " + TuKhoa;

    }
    public String check(String tuKhoa){
        String result = this.list.get(tuKhoa);
        return result;
    }
    public void show(){
        Set<String> show = this.list.keySet();
        System.out.println(Arrays.toString(show.toArray()));
    }
    public int size(){
        return list.size();
    }
    public void deteleAll(){
        list.clear();
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("Hello","XinChao");
        dictionary.add("Swim","Boi");
        dictionary.add("Eat","An");
        System.out.println(dictionary.check("Hello"));
        System.out.println(dictionary.delete("Swim"));
    }
}
