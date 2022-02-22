package ru.sort.digits;

import ru.sort.common.Sorter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class DigitSorter extends Sorter {


    public DigitSorter(boolean sType, String oFile, String[] iFiles) {
        super(sType, oFile, iFiles);
    }

    @Override
    public void sortCouple(File wr,File f1, File f2,boolean sType) throws IOException {
        FileReader fr1 = new FileReader(f1);

        BufferedReader reader1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader(f2);

        BufferedReader reader2 = new BufferedReader(fr2);

        PrintWriter pw = new PrintWriter(wr);

        String str1 = reader1.readLine();
        String str2 = reader2.readLine();
        if(sType == true) {
            while (str1 != null && str2 != null) {
                if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
                    pw.println(Integer.parseInt(str2));
                    str2 = reader2.readLine();
                } else if (Integer.parseInt(str1) < Integer.parseInt(str2)) {
                    //  Files.write(Path.of((wr.getPath())),str1.getBytes(StandardCharsets.UTF_8));
                    pw.println(Integer.parseInt(str1));
                    // Files.write(Paths.get(wr.getPath()),("\n").getBytes());
                    str1 = reader1.readLine();
                } else if (Integer.parseInt(str1) == Integer.parseInt(str2)) {
                    pw.println(Integer.parseInt(str1));
                    pw.println(Integer.parseInt(str1));
                    str1 = reader1.readLine();
                    str2 = reader2.readLine();
                }
            }

        }
        else{
            while (str1 != null && str2 != null) {
                if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
                    pw.println(Integer.parseInt(str1));
                    str1 = reader1.readLine();
                } else if (Integer.parseInt(str1) < Integer.parseInt(str2)) {
                    //  Files.write(Path.of((wr.getPath())),str1.getBytes(StandardCharsets.UTF_8));
                    pw.println(Integer.parseInt(str2));
                    // Files.write(Paths.get(wr.getPath()),("\n").getBytes());
                    str2 = reader2.readLine();
                } else if (Integer.parseInt(str1) == Integer.parseInt(str2)) {
                    pw.println(Integer.parseInt(str1));
                    pw.println(Integer.parseInt(str1));
                    str1 = reader1.readLine();
                    str2 = reader2.readLine();
                }
            }
        }
        if (str1 != null) {
            while (str1 != null) {
                pw.println(Integer.parseInt(str1));
                str1 = reader1.readLine();
            }
        } else if (str2 != null) {
            while (str2 != null) {
                pw.println(Integer.parseInt(str2));
                str2 = reader2.readLine();
            }
        }
        pw.close();
    }
}
