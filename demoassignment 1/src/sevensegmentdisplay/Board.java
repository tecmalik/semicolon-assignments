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
//        for(char digit : number.toCharArray()) {
//            if(false) {
//                throw new IllegalArgumentException("invalid combination");
//            }
//        }

        if (number.length() != 8) throw new IllegalArgumentException("invalid Combination");
        this.segmentH = number.charAt(7);
        if (number.charAt(0) == '1') this.segmentA.turnOn(board);
        if (number.charAt(1) == '1') this.segmentB.turnOn(board);
        if (number.charAt(2) == '1') this.segmentC.turnOn(board);
        if (number.charAt(3) == '1') this.segmentD.turnOn(board);
        if (number.charAt(4) == '1') this.segmentE.turnOn(board);
        if (number.charAt(5) == '1') this.segmentF.turnOn(board);
        if (number.charAt(6) == '1') this.segmentG.turnOn(board);
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


}