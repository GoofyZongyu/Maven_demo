package Frame;

import java.util.ArrayList;
import java.util.Collections;

public class gameFrame {
    static ArrayList<String> list=new ArrayList<>();
    static {
        String[] color={"♦","♥","♣","♠"};
        String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
    }

    public gameFrame() {
        Collections.shuffle(list);
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> player4=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i%4==0){
                player1.add(list.get(i));
            }else if(i%4==1){
                player2.add(list.get(i));
            }else if(i%4==2){
                player3.add(list.get(i));
            }else {
                player4.add(list.get(i));
            }
        }
    }
}
