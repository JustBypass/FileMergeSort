package ru.params;

import ru.sort.common.Sorter;

import ru.sort.digits.DigitSorter;
import ru.sort.strings.StringSorter;


public class paramReader {

    private Sorter sorter = null;

    private boolean isOptionExist(String option){
        return true;
    }

    public Sorter getSorterType(){
        return sorter ;
    }
    private void initSorter(String[] args){
        String[] inputFiles = new String[args.length-2];
        String outputFile = args[1];
        for(int i = 0;i<args.length-2;i++){
            inputFiles[i] = args[i+2];
        }
        if(args[0] == "-s"){
            sorter = new StringSorter(outputFile,inputFiles);
        }
        else {
            sorter = new DigitSorter(outputFile,inputFiles);
        }

    }
    public paramReader(String[] args) throws Exception {
        if(args.length == 0)
            throw new Exception();
        initSorter(args);
    }
}
