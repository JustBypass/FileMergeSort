package ru.sort.strings;

import ru.sort.common.Sorter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StringSorter extends Sorter {

    public StringSorter(boolean sType, String oFile, String[] iFiles) {
        super(sType, oFile, iFiles);
    }

    @Override
    public void sortCouple(File wr,File f1, File f2) throws IOException {
        FileReader fr1 = new FileReader(f1);

        BufferedReader reader1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader(f2);

        BufferedReader reader2 = new BufferedReader(fr2);

        PrintWriter pw = new PrintWriter(wr);

        String str1 = reader1.readLine();
        String str2 = reader2.readLine();
        while(str1!=null&&str2!=null)
        {
            if((str1).compareTo(str2)>0&&str1.length()<=str2.length()){
                pw.println((str1));
                str1 = reader1.readLine();
            }
           else if((str1).compareTo(str2)>0&&str1.length()>=str2.length()){
                pw.println((str2));
                str2 = reader2.readLine();
            }
            else if((str1).compareTo(str2)<0&&str1.length()>=str2.length()){
                pw.println((str2));
                str2 = reader2.readLine();
            }
            else if((str1).compareTo(str2)<0&&str1.length()<=str2.length()){
                pw.println((str1));
                str1 = reader1.readLine();
            }
            else if(str1.compareTo(str2) == 0&&str1.length()==str2.length())
            {
                pw.println((str1));
                pw.println((str1));

                str1 = reader1.readLine();
                str2 = reader2.readLine();
            }
        }
        if(str1!= null){
            while(str1!=null){
                pw.println((str1));
                str1 = reader1.readLine();
            }
        }
        else if(str2!= null){
            while(str2!=null){
                pw.println((str2));
                str2 = reader2.readLine();
            }
        }
        pw.close();
    }
}
