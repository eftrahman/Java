package netflixproblem010;
import java.util.Scanner;
/**
 * Curtin University mid-term problem
 * @Rinzler 07.04.2022
 */

class ntflxShows{
    public String name;
    int e;
    int flag=0;
    int totalview=0;
    public int[] episodes= new int[20];
    Scanner sc1 = new Scanner(System.in);
    public ntflxShows(String n,int e){
        name = n; 
        this.e = e;
    }
    public void setview(){
        for(int i=1;i<=e;i++){
            System.out.print("Episode "+i+": < view count > ");
            episodes[i] =sc1.nextInt();
            if(episodes[i]<100000){
                episodes[i]=1;
            }
            totalview+=episodes[i];
        }
    }
    public void avgview(){
        int total=0;
        int i=1;
        for(i=1;i<=e;i++){
           total+=episodes[i];
        }
        double avg = total/i;
        System.out.println(name+":"+avg+" views");
    }
    public int maxview(){
        int max=episodes[1];
        
        for(int i=1;i<=e;i++){
            if(episodes[i]>max){
                max=episodes[i];
                flag = i;
            }
        }
        return max;
    }
    public int lastEpisodeview(){
        int lastEpisodeViwe=episodes[e];
        return lastEpisodeViwe;
    }
}

public class Netflixproblem010 {

    public static void main(String[] args) {
        ntflxShows DriveToSurvive = new ntflxShows("Drive To Survive, Season 4",10);
        ntflxShows InventingAnna = new ntflxShows("Inventing Anna",9);
        ntflxShows Bridgerton = new ntflxShows("Bridgerton, Season 2",8);
        System.out.println("**********************************************************");
        System.out.println("| Welcome to the Netflix Season Episode Program Analyser |");
        System.out.println("|      The program tracks views per episode of the       |");
        System.out.println("|              selected series season.                   |");
        System.out.println("**********************************************************\n");
        System.out.println("Data Entry:");
        System.out.println("Please enter the view count per episode for Drive to Survive, season 4:");
        DriveToSurvive.setview();
        System.out.println("\n----------");
        System.out.println("Please enter the view count per episode for Inventing Anna:");
        InventingAnna.setview();
        System.out.println("\n----------");
        System.out.println("Please enter the view count per episode for Bridgerton, season 2:");
        Bridgerton.setview();
        System.out.println("\n===================");
        System.out.println("Data Entry Complete");
        System.out.println("===================\n");
        
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean quit=false;
        while(!quit){
            System.out.println("Menu Choice : ");
            System.out.println("> 1. Display average view count for each series season;");
            System.out.println("> 2. Display episode from all series with the highest view count;");
            System.out.println("> 3. Display the most popular series;");
            System.out.println("> 4. Display show with largest season finale audience with view count;");
            System.out.println("> 5. Exit the program");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                   DriveToSurvive.avgview(); 
                   InventingAnna.avgview();
                   Bridgerton.avgview();
                   break;
                case 2:
                    int maxv=0;
                    if (DriveToSurvive.maxview()>InventingAnna.maxview()&&DriveToSurvive.maxview()>Bridgerton.maxview()){
                        maxv=DriveToSurvive.maxview();
                        System.out.println("Most viewed : Drive To Survive, Season 4, Episode "+DriveToSurvive.flag);
                    }
                    else if(InventingAnna.maxview()>DriveToSurvive.maxview()&&InventingAnna.maxview()>Bridgerton.maxview()){
                        maxv=InventingAnna.maxview();
                        System.out.println("Most viewed : Inventing Anna, Episode "+InventingAnna.flag);
                    }
                    else if(Bridgerton.maxview()>DriveToSurvive.maxview()&&Bridgerton.maxview()>InventingAnna.maxview()){
                        maxv=Bridgerton.maxview();
                        System.out.println("Most viewed : Bridgerton, Season 2, Episode "+Bridgerton.flag);
                    }
                    break;
                case 3:
                    if(DriveToSurvive.totalview>InventingAnna.totalview&&DriveToSurvive.totalview>Bridgerton.totalview){
                        System.out.println(" Display the most popular series :"+DriveToSurvive.name+"\nTotal view : "+DriveToSurvive.totalview);
                    }
                    else if(InventingAnna.totalview>DriveToSurvive.totalview&&InventingAnna.totalview>Bridgerton.totalview){
                        System.out.println(" Display the most popular series :"+InventingAnna.name+"\nTotal view : "+InventingAnna.totalview);
                    }
                    else if(Bridgerton.totalview>DriveToSurvive.totalview&&Bridgerton.totalview>InventingAnna.totalview){
                        System.out.println(" Display the most popular series :"+Bridgerton.name+"\nTotal view : "+Bridgerton.totalview);
                    }
                    break;                    
                case 4:
                    if(DriveToSurvive.episodes[DriveToSurvive.e]>InventingAnna.episodes[9]&&DriveToSurvive.episodes[10]>Bridgerton.episodes[8]){
                        System.out.println(" largest audience for season finale :"+DriveToSurvive.name+"\nEpisode : "+DriveToSurvive.e+"\nviews : "+DriveToSurvive.lastEpisodeview());
                    }
                    else if(InventingAnna.episodes[9]>DriveToSurvive.episodes[10]&&InventingAnna.episodes[9]>Bridgerton.episodes[8]){
                        System.out.println(" largest audience for season finale :"+InventingAnna.name+"\nEpisode : "+InventingAnna.e+"\nviews : "+InventingAnna.lastEpisodeview());
                    }
                    else if(Bridgerton.episodes[8]>DriveToSurvive.episodes[10]&&Bridgerton.episodes[8]>InventingAnna.episodes[9]){
                        System.out.println(" largest audience for season finale :"+Bridgerton.name+"\nEpisode : "+Bridgerton.e+"\nviews : "+Bridgerton.lastEpisodeview());
                    }
                    break;
                case 5:
                    quit=true;
                    break;                   
            }
        }
    }
    
}
