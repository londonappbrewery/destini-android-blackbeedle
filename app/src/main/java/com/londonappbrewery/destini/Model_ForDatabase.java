package com.londonappbrewery.destini;

public class Model_ForDatabase {

    int mstoryLine;
    int mbuttonTopText;
    int mbuttonBottomText;

    public int getMstoryLine() {
        return mstoryLine;
    }

    public int getMbuttonTopText() {
        return mbuttonTopText;
    }

    public int getMbuttonBottomText() {
        return mbuttonBottomText;
    }

    public Model_ForDatabase(int mstoryLine, int mbuttonTopText, int mbuttonBottomText) {

        this.mstoryLine = mstoryLine;
        this.mbuttonTopText = mbuttonTopText;
        this.mbuttonBottomText = mbuttonBottomText;
    }
}
