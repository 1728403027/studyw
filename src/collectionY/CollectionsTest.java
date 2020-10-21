package collectionY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
斗地主
 分析：
   首先买牌
   在洗牌
   然后发牌
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //买牌
        //造牌
        //花色集合
        List<String> hua = new ArrayList<>();
        //相同牌的集合
        List<String> xt = new ArrayList<>();
        //造牌
        hua.add("红桃");
        hua.add("黑桃");
        hua.add("梅花");
        hua.add("方块");
        for (int i = 1; i < 14; i++) {
            String t = Integer.toString(i);
            xt.add(t);
        }
        xt.set(0, "A");
        xt.set(xt.size() - 3, "J");
        xt.set(xt.size() - 2, "Q");
        xt.set(xt.size() - 1, "K");
        //把牌放入牌盒
        List<String> he = new ArrayList<>();
        for (int i = 0; i < hua.size(); i++) {
            for (int j = 0; j < xt.size(); j++) {
                he.add(hua.get(i) + xt.get(j));
            }
        }
        he.add("小王");
        he.add("大王");
        //洗牌
        Collections.shuffle(he);
        //打牌的人
        List<String> 张三=new ArrayList<>();
        List<String> 李四=new ArrayList<>();
        List<String> 王五=new ArrayList<>();
        //用随机数代替地主是谁
        Random ran=new Random();
        int number=ran.nextInt(51)+1;
        //发牌
        for (int i = 0; i <he.size()-3 ; i++) {
            if(i%3==0){
               张三.add(he.get(i));
            }else if(i%3==1){
                李四.add(he.get(i));
            }else if(i%3==2){
                王五.add(he.get(i));
            }
        }
        if(number%3==0){
            for (int i = he.size()-3; i <he.size() ; i++) {
                张三.add(he.get(i));
            }
        }else if(number%3==1){
            for (int i = he.size()-3; i <he.size() ; i++) {
                李四.add(he.get(i));
            }
        }else if(number%3==2){
            for (int i = he.size()-3; i <he.size() ; i++) {
                王五.add(he.get(i));
            }
        }
        System.out.println("张三:"+张三);
        System.out.println("李四:"+李四);
        System.out.println("王五:"+王五);
        List di=new ArrayList();
        for (int i = he.size()-3; i <he.size() ; i++) {
            di.add(he.get(i));
        }
        System.out.println("底牌:"+di);
    }
}

