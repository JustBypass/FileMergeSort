package ru.mainpack;

import ru.params.paramReader;
import ru.sort.common.Sorter;



public class Main {

    public static void main(String[] args){
        String[]strings = {"-s","C:\\Users\\Admin\\IdeaProjects\\newone\\output.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\file.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\file2.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\file3.txt"};
        try{
            paramReader pRead = new paramReader(strings);
            Sorter sorter = pRead.getSorterType();
            sorter.sort();
        }
        catch(Exception ex){
            System.out.println("Something went wrong...");
        }
    }
}
