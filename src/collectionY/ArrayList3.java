package collectionY;

import java.util.ArrayList;

/*
集合遍历
 */
public class ArrayList3 {
    public ArrayList3(){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("hahash");
        arr.add("niha");
        arr.add("12355");
        for (int i=0;i<arr.size();i++){
            String a=arr.get(i);
            System.out.println(a);
        }
    }
}
