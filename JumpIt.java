public class JumpIt{
    public static int lowestCost(int []board, int position, int total){
        total+=board[position];
        if(position == board.length -1)
            return total;
        else if(position == board.length -2)
            return lowestCost(board,position+1,total);
        else{
            int rt1 = lowestCost(board,position+1,total);
            int rt2 = lowestCost(board,position+2,total);
            return Math.min(rt1,rt2);
        }
    }
    public static void main(String[] args){
        int[] board = {0,3,80,6,57,10};
        int cost = 0;
        cost = lowestCost(board,0,cost);
        for(int i=0;i < board.length;i++)
            System.out.print(board[i]+" ");
            System.out.println();
            System.out.println("Cheapest cost for board 1: " + cost);
        int board2[] = {0,8,66,1,22,3,7,90,12,600};
        int cost2 = 0;
        cost2 = lowestCost(board2,0,cost2);
        for(int i=0;i < board2.length;i++)
            System.out.print(board2[i]+" ");
            System.out.println();
            System.out.println("Cheapest cost for board 2: " + cost2);
    }
}