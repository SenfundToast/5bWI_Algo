package at.bma.camera;

import java.util.*;

public class File {
    private String name;
    private Date date; 


    public File(String name, Date date) {
        this.name = name; 
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public Date getDate(String[] args) {
        return date;
    }
}