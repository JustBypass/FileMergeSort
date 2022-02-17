package ru.sort.common;

import java.io.File;
import java.io.IOException;

public abstract class Sorter {
    private String oFile;
    private String[] iFiles;
    private boolean sortType;

    public Sorter(String oFile,String[] iFiles) {
        this.oFile = oFile;
        this.iFiles = iFiles;
    }

    public abstract void sortCouple(File write,File f1,File f2) throws IOException;
    public void sort() throws IOException {
        if (sortType == false) {
            File f = new File(oFile);
            if (iFiles.length == 1) {
                f = new File(iFiles[0]);
                return;
            }
            sortCouple(f, new File(iFiles[0]), new File(iFiles[1]));
            int count = 2;
            while (count < iFiles.length) {
                sortCouple(f, f, new File(iFiles[1]));
                count++;
            }
        }
    }

}
