package _15_text_file.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
         List<Integer> list = new ArrayList<>();
        try {
            // tạo đường dẫn
            File file = new File(filePath);     //src\_15_text_file\practice\file.text
            if(!file.exists()) {   // kiểm tra file có tồn tại k
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = bufferedReader.readLine())!=null){
              list.add(Integer.parseInt(line));
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("file có lỗi hoặc nội dung k tồn tại");
        }
        return list;
    }
    public void writeFile(String filePath , int max ){
        try{
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer) ;
            bufferedWriter.newLine();

            System.out.println("max là "+ max );  // hiện bên hệ thống
            bufferedWriter.write("max là " + max ); // hiện bên file text
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int  max = numbers.get(0);
        for(int i = 0 ; i < numbers.size();i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers =   readAndWriteFile.readFile("src\\_15_text_file\\practice\\file.text");
       int max = findMax(numbers);
        readAndWriteFile.writeFile("src\\_15_text_file\\practice\\abc",max);


    }
}