package HW_8;

    /* Character recognition software is widely used to digitise printed texts.
     Thus the texts can be edited, searched and stored on a computer.
     When documents (especially pretty old ones written with a typewriter),
     are digitised character recognition software often make mistakes.

     Correct the errors in the digitised text. You only have to handle the following mistakes:
        S is misinterpreted as 5
        O is misinterpreted as 0
        I is misinterpreted as 1 */

public class HW_8_05 {

    public static String correct(String string) {
        return string.replace('1','I').replace('5','S').replace('0','O');
    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        System.out.println(correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"));
        System.out.println(correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME"));
        System.out.println(correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL"));
        System.out.println(correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5"));
        System.out.println(correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"));
        System.out.println(correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA"));
        System.out.println(correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"));
        System.out.println(correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5"));
        System.out.println(correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA"));
        System.out.println(correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN"));
        System.out.println(correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE"));
        System.out.println(correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA"));

    }
}
