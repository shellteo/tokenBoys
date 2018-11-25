package com.util;

import com.entity.ElaInfo;

import java.io.*;

public class FileUtil {

    public static File write(ElaInfo elaInfo){

        File file = new File("/" + DateUtil.dateFormat() + ".txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
            bufferedWriter.write("用户昵称：" + elaInfo.getUserName());
            bufferedWriter.newLine();
            bufferedWriter.write("创建时间：" + elaInfo.getMakeTime().toString());
            bufferedWriter.newLine();
            bufferedWriter.write("词条名称：" + elaInfo.getElaName());
            bufferedWriter.newLine();
            bufferedWriter.write("词条内容：" + elaInfo.getElaContent());
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void main(String[] args) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/temp.txt"));
            bufferedWriter.write("abc");
            bufferedWriter.newLine();
            bufferedWriter.write("abc");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
