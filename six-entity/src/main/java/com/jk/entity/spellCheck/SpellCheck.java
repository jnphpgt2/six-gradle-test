package com.jk.entity.spellCheck;

import java.io.Serializable;

/**
 * Created by Janan on 2017/5/27.
 */
public class SpellCheck implements Serializable{
    private Integer wordID;
    private String wordName;

    public Integer getWordID() {
        return wordID;
    }

    public void setWordID(Integer wordID) {
        this.wordID = wordID;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }
}
