package try1;
/**
 * 18.01.2022
 * @Rinzler
 */
class candies{
    int Snickers,MnMs,Skittles;
    void getCandies(int snk, int mnm, int skt){
        Snickers = snk;
        MnMs = mnm;
        Skittles = skt;
    }
}
class moreCandies extends candies{
    int LaffyTaffy, MilkyWay;
    void getMoreCandies(int lt, int mw){
        LaffyTaffy = lt;
        MilkyWay = mw;
    }
}
public class Try1 {

    public static void main(String[] args) {
        moreCandies objcandy01 = new moreCandies();
        objcandy01.getCandies(4, 5, 6);
        objcandy01.getMoreCandies(3,5);       
        System.out.println("Candies -->\n\nSnickers : "+objcandy01.Snickers+"\nMnMs : "+objcandy01.MnMs+"\nSkittles : "+objcandy01.Skittles+"\nLaffy Taffy : "+objcandy01.LaffyTaffy+"\nMilkyWay : "+objcandy01.MilkyWay);        
        candies objcandy02 = new candies();
        objcandy02 = objcandy01;
        System.out.println("\nCandies -->\n\nSnickers : "+objcandy02.Snickers+"\nMnMs : "+objcandy02.MnMs+"\nSkittles : "+objcandy02.Skittles);
    }    
}
