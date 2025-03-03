package sevensegmentdisplay;


public class

Board {

    private SegmentA segmentA = new SegmentA(0, 0);
    private SegmentB segmentB = new SegmentB(0, 3);
    private SegmentC segmentC = new SegmentC(2, 3);
    private SegmentD segmentD = new SegmentD(4, 3);
    private SegmentE segmentE = new SegmentE(4, 0);
    private SegmentF segmentF = new SegmentF(2, 0);
    private SegmentG segmentG = new SegmentG(2, 0);
    private char segmentH = '0';
    private final char[][] board = {
            {' ',' ',' ',' '},
            {' ',' ',' ',' '},
            {' ',' ',' ',' '},
            {' ',' ',' ',' '},
            {' ',' ',' ',' '}
    };


    public boolean isOff() {
        return this.segmentH == '0';
    }

    public char[][] display(String number) {
        if (number.length() != 8) throw new IllegalArgumentException("invalid Combination");
        this.segmentH = number.charAt(7);
        //validateInput(number);
        if (number.charAt(0) == '1' && !isOff()) this.segmentA.turnOn(board);
        if (number.charAt(1) == '1' && !isOff()) this.segmentB.turnOn(board);
        if (number.charAt(2) == '1' && !isOff()) this.segmentC.turnOn(board);
        if (number.charAt(3) == '1' && !isOff()) this.segmentD.turnOn(board);
        if (number.charAt(4) == '1' && !isOff()) this.segmentE.turnOn(board);
        if (number.charAt(5) == '1' && !isOff()) this.segmentF.turnOn(board);
        if (number.charAt(6) == '1' && !isOff()) this.segmentG.turnOn(board);
        return board;
    }

    public SegmentA getSegmentA() {
        return segmentA;
    }

    public SegmentB getSegmentB() {
        return segmentB;
    }

    public SegmentC getSegmentC() {
        return segmentC;
    }

    public SegmentD getSegmentD() {
        return segmentD;
    }

    public SegmentE getSegmentE() {
        return segmentE;
    }

    public SegmentF getSegmentF() {
        return segmentF;
    }

    public SegmentG getSegmentG() {
        return segmentG;
    }

//    private void validate(String numbers) {
//        for(int index = 1; index < numbers.length(); index++) {
//            if (numbers.charAt(index) != '1' && numbers.charAt(index) != '0') throw new IllegalArgumentException("invalid Combination");
//        }
//
//    }

    private void validateInput(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) != '0' | numbers.charAt(i) != '1')
                throw new IllegalArgumentException("invalid Combination");
        }
    }


}