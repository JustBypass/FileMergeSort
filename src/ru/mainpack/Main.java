package ru.mainpack;

import ru.params.paramReader;
import ru.sort.common.Sorter;



public class Main {

    public static void main(String[] args){
        /// This is for debugging....we could us args of course
        String[]strings = {"-d","-s","C:\\Users\\Admin\\IdeaProjects\\newone\\docs\\output.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\docs\\file.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\docs\\file2.txt","C:\\Users\\Admin\\IdeaProjects\\newone\\docs\\file3.txt"};
        /// .........................
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
