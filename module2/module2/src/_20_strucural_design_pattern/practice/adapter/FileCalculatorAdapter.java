package _20_strucural_design_pattern.practice.adapter;


import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {

    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}