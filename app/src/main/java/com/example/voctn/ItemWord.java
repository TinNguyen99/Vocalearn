package com.example.voctn;

public class ItemWord {
    private String EngWord;
    private String VieWord;
    private String state;

    public ItemWord(String engWord, String vieWord, String State) {
        EngWord = engWord;
        VieWord = vieWord;
        state = State;
    }

    public void changeState(String text){
        state = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEngWord() {
        return EngWord;
    }

    public void setEngWord(String engWord) {
        EngWord = engWord;
    }

    public String getVieWord() {
        return VieWord;
    }

    public void setVieWord(String vieWord) {
        VieWord = vieWord;
    }
}
