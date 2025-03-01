package sevensegmentdisplay;

public class MainDisplay {
    public static void main(String[] args) {
        Board sevenSegmentDisplay = new Board();
//        System.out.print(sevenSegmentDisplay.display("11111111")[3][4]);

        System.out.println();

        for(int i=0; i<sevenSegmentDisplay.display("11111111").length-1; i++) {
                System.out.print(" "+ sevenSegmentDisplay.display("11111111"));

        }

//        String[][] board = {
//                {"#", "#", "#", "#"},
//                {" ", " ", " ", "#"},
//                {"#", "#", "#", "#"},
//                {" ", " ", " ", "#"},
//                {"#", "#", "#", "#"}
//        };
//    for(int i=0; i<board.length; i++) {
//        for(int j=0; j<board[i].length; j++) {
//            System.out.print(" "+board[i][j]);
//        }
//        System.out.println();
//
//
////    }
//
    }

}
