package ru.check;

/*\
 Check file correctness in case of sort Type of file

 */

public abstract class Checker {

    private String str;


    public Checker(String str) {
        this.str = str;
    }

    public  abstract void check();
}
