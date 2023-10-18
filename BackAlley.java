public class BackAlley {
    public static boolean DiceGame()
    {
        int dice_val;
        dice_val = dice_roll();

        //checks for return value of dice
        if(dice_val == 7 || dice_val == 11) // ||= or/or statement
        {
            return true;
        }
        else if(dice_val == 2 || dice_val == 3 || dice_val == 12)
        {
            return false;
        }
        else
        {
            int total = dice_val;
            do
            {
                dice_val = dice_roll();
                if(dice_val == 7) //stops when the dice rolls a 7
                    break;

            }while(dice_val != total);
            if(dice_val == total)
            {
                return true; //if the dice roll equals the value of the number of points, the game is a win, or else the player looses
            }
            else
            {
                return false;
            }
        }
    }

    public static int dice_roll() //the dice can only roll up to a 6. this method randomly generates a number between 1-6 to resemble a dice roll
    {
        return ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        int stack_val=20;
        int bet_val;
        int i ;

        for(i = 1; i<=10; i++) {
            bet_val=1;
            stack_val=stack_val-1;


            if(DiceGame()) {
                stack_val += (2*bet_val);
                System.out.println("$" + stack_val + " win");
            }
            else {
                System.out.println("$" + stack_val + " lose");
            }
        }
    }

}

