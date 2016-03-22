package com.catchingnow.tinyclipboardmanager;


import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jayson p on 22/03/2016.
 */
public class FolderObject {

    private ArrayList FolderContents;
    private String name;
    private Date creationDate;

    public FolderObject(String fName, Date cDate) {
        name = fName;
        creationDate = cDate;
        FolderContents = new ArrayList();
    }

    public ArrayList getFolderContents() {
        return FolderContents;
    }

    public void setFolderContents(ArrayList folderContents) {
        FolderContents = folderContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Getter ans setter for specific items in a folder
     * @param i
     * @return
     */
    public Object getItem(int i){
        return FolderContents.get(i);
    }

    public void setitem(int i, Object newItem){
        FolderContents.set(i, newItem);
    }


}
