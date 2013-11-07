package gittutorial;

public class vTest {
	public int vTest(int haveChange, int oneDollar, int fiftyCents, int orangeJuice, int beer){
        if(haveChange == 1){
            if(oneDollar == 1 && fiftyCents == 0){
                if(orangeJuice == 1 && beer == 0){
                    return 1; //light off, 50 cents return, get orange juice
                }
                else if(orangeJuice == 0 && beer == 1){
                    return 2; //light off, 50 cents return, get beer
                }
                else if(orangeJuice == 0 && beer == 0){
                    return 3; //light off, no money return, get nothing
                }
                else{
                    return 10;//invalid
                }
            }
            else if(fiftyCents == 1 && oneDollar == 0){
                if(orangeJuice == 1 && beer == 0){
                    return 4; //light off, no money return, get orange juice
                }
                else if(orangeJuice == 0 && beer == 1){
                    return 5; //light off, no money return, get beer
                }
                else if(orangeJuice == 0 && beer == 0){
                    return 3; //light off, no money return, get nothing
                }
                else{
                    return 10;
                }
            }
            else if(fiftyCents == 0 && oneDollar == 0){
                if(orangeJuice == 1 && beer == 1){
                    return 10;
                }
                else{
                    return 3;
                }
            }
            else{
                return 10;
            }
        }
        else{
            if(oneDollar == 1 && fiftyCents == 0){
                if(orangeJuice == 1 && beer == 0){
                    return 6; //light on, 1 dollar return, get nothing
                } 
                else if(orangeJuice == 0 && beer == 1){
                    return 6; //light on, 1 dollar return, get nothing
                }
                else if(orangeJuice == 0 && beer == 0){
                    return 7; //light on, no money return, get nothing
                }
                else{
                    return 10;
                }
            }
            else if(oneDollar == 0 && fiftyCents == 1){
                if(orangeJuice == 1 && beer == 0){
                    return 8; //light on, no money return, get orangejuice
                }
                else if(orangeJuice == 0 && beer == 1){
                    return 9; //light on, no money return, get beer
                }
                else if(orangeJuice == 0 && beer == 0){
                    return 7;
                }
                else{
                    return 10;
                }
            }
            else if(oneDollar == 0 && fiftyCents == 0){
                if(orangeJuice == 1 && beer == 1){
                    return 10;
                }
                else{
                    return 7;
                }
            }
            else{
                return 10;
            }
        }
}


}
