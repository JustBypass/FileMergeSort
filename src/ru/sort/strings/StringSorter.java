package ru.sort.strings;

import ru.sort.common.Sorter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StringSorter extends Sorter {

    public StringSorter(String oFile, String[] iFiles) {
        super(oFile, iFiles);
    }

    @Override
    public void sortCouple(File wr,File f1, File f2) throws IOException {
        FileReader fr1 = new FileReader(f1);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader(f2);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader2 = new BufferedReader(fr2);
       /* int num1 = Integer.parseInt(reader1.readLine());
        int num2 = Integer.parseInt(reader2.readLine());*/
        String str1 = reader1.readLine();
        String str2 = reader1.readLine();
        while(str1!=null&&str2!=null)
        {
            if((str1).compareTo(str2)>0){
                Files.write(Paths.get(wr.getName()),str1.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                str1 = reader1.readLine();
            }
            else if((str1).compareTo(str2)<0){
                Files.write(Paths.get(wr.getName()),str2.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                str2 = reader2.readLine();
            }
            else if(str1.compareTo(str2) == 0){
                Files.write(Paths.get(wr.getName()),str1.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                Files.write(Paths.get(wr.getName()),str1.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                str1 = reader1.readLine();
                str2 = reader2.readLine();
            }
        }
        if(str1!= null){
            str1 = reader1.readLine();
            while(str1!=null){
                Files.write(Paths.get(wr.getName()),str1.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                str1 = reader1.readLine();
            }
        }
        else if(str2!= null){
            str2 = reader2.readLine();
            while(str2!=null){
                Files.write(Paths.get(wr.getName()),str2.getBytes());
                Files.write(Paths.get(wr.getName()),("\n").getBytes());
                str2 = reader2.readLine();
            }
        }
    }
}
