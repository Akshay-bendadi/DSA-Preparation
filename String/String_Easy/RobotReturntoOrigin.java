package String_Easy;
//https://leetcode.com/problems/robot-return-to-origin/description/

public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String moves = "RL";
        System.out.println(judgeCircle(moves));
    }
    static boolean judgeCircle(String moves)
    {
        int countL = 0;
        int countR = 0;
        int countU = 0;
        int countD = 0;
        for (int i = 0; i < moves.length(); i++)
        {
            switch (moves.charAt(i)) {
                case 'L' -> countL++;
                case 'R' -> countR++;
                case 'U' -> countU++;
                default -> countD++;
            }
        }
        int countleftrightmoves = countL - countR;
        int countupdownmoves = countU - countD;

        return countleftrightmoves == 0 && countupdownmoves == 0 ? true : false;
    }
}
