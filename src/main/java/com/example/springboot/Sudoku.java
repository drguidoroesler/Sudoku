package com.example.springboot;

import java.io.Serializable;

public class Sudoku implements Serializable {

    private static final long serialVersionUID = -1764970284520387975L;

    private String newPuzzle;
    private String solvedPuzzle;
    
    public Sudoku() {}

    public String getNewPuzzle() {
        return this.newPuzzle;
    }

    public void setNewPuzzle(String newPuzzle) {
        this.newPuzzle = newPuzzle;
    }

    public String getSolvedPuzzle() {
        return this.solvedPuzzle;
    }

    public void setSolvedPuzzle(String solvedPuzzle) {
        this.solvedPuzzle = solvedPuzzle;
    }

}