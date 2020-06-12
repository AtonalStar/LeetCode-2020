import java.util.*;

class Solution {
     String[][] hour = {{"0"}, 
                        {"1", "2", "4", "8"},
                        {"3", "5", "6", "9", "10"},
                        {"7", "11"}};
     String[][] minute = {{"00"}, 
                         {"01", "02", "04", "08", "16", "32"}, 
                         {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"},
                         {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"},
                         {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"}, 
                         {"31", "47", "55", "59"}}; 

     public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<String>();
        for (int i=0; i<=3 && i<=num; i++){           //index of hour is 0 to 3
            if(num-i <=5){                            //index of minute is 0 to 5
                for(String h :hour[i]){
                    for(String m:minute[num-i]){
                        list.add(h+":"+m);
                    }
                }
            }
        }
        return list;
    }
}
