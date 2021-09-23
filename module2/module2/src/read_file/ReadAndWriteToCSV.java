package read_file;


import c.dichvu.Employee;

import java.io.*;
import java.util.List;

public class ReadAndWriteToCSV {
    public static void write(List<Employee> employeeList, String pathFile, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, true); //append true : cho phép ghi tiếp, false thì ghi đè
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         for(Employee employee : employeeList){
      bufferedWriter.write(employee.toString());
      bufferedWriter.newLine();
         } // ghi
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        File file = new File("src\\read_file\\file.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true); //append true : cho phép ghi tiếp, false thì ghi đè
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();
            String string = bufferedReader.readLine();
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("lỗi đọc file");
        }


    }
}
