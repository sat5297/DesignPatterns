package FileDirectory;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String fileName;
    private List < Directory > subDirectory = new ArrayList<Directory>();

    public Directory(String fileName){
        this.fileName = fileName;
    }

    public void add(Directory d){
        subDirectory.add(d);
    }

    public void remove(Directory d){
        subDirectory.remove(d);
    }

    public List < Directory > getDirectories(){
        return subDirectory;
    }

    public String toString(){
        return ("File : " + fileName);
    }
}
