package _15_io_text_file.practice;

import java.io.*;

public class ReadFileExample {
    public void readfileText(String filePatch) {
        File file = new File(filePatch);
        try {
            if (!file.exists()) { // kiểm tra tồn tại
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ;
            int sum = 0;
            while(true){
                line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
              sum += Integer.parseInt(line);
            }

            bufferedReader.close();
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//                sum += Integer.parseInt(line);
//            }
//            bufferedReader.close();

            System.out.println("Tổng : " + sum);
        } catch (Exception e) {
            System.out.println("file không tồn tại hoặc có lỗi");
        }
    }
    public static void main(String[] args) {
//        System.out.println("nhập đường dẫn");
//        Scanner scanner = new Scanner(System.in);
//        String link = scanner.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readfileText("src\\_15_io_text_file\\practice\\abc");
        //nhập trực tiếp
        //     "src\_15_text_file\practice\file.text"
    }
}