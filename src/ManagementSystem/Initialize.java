package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
账号密码
 */
public class Initialize {

    private ArrayList<String> Tzhlist = new ArrayList<String>();
    private ArrayList<String> Tmimalist = new ArrayList<String>();
    private ArrayList<String> Szhlist = new ArrayList<String>();
    private ArrayList<String> Smimalist = new ArrayList<String>();

    //初始化账号密码
    public Initialize() {
        Tmimalist.add("1234");
        Tzhlist.add("1234");
        Szhlist.add("123");
        Smimalist.add("123");

    }

    public Initialize(ArrayList<String> tzhlist, ArrayList<String> tmimalist) {
        Tzhlist = tzhlist;
        Tmimalist = tmimalist;
    }



    public void setSzhlist(ArrayList<String> szhlist) {
        Szhlist = szhlist;
    }

    public void setSmimalist(ArrayList<String> smimalist) {
        Smimalist = smimalist;
    }

    public ArrayList<String> getTzhlist() {
        return Tzhlist;
    }

    public ArrayList<String> getTmimalist() {
        return Tmimalist;
    }

    public ArrayList<String> getSzhlist() {
        return Szhlist;
    }

    public ArrayList<String> getSmimalist() {
        return Smimalist;
    }
    public void back(){
        Scanner zh=new Scanner(System.in);
        System.out.println("请输入你要找回密码的账号：");
        String hui=zh.nextLine();
        char[] cha=hui.toCharArray();
        int s=0;
        for(int i=0;i<cha.length;i++){
            if(cha[i]>='0'&&cha[i]<='9'){
                s++;
            }
        }
        if(s==cha.length){
            int t=-1;
            int su=-1;
            for(int i=0;i<Tzhlist.size();i++){
                if (Tzhlist.get(i).equals(hui)){
                    su=i;
                }

            }
            for(int j=0;j<Szhlist.size();j++){
                if (Szhlist.get(j).equals(hui)){
                    t=j;
                }

            }
            if(su>=0){
                Scanner snn=new Scanner(System.in);
                System.out.println("请输入你的新的密码");
                String mimas = snn.nextLine();
                char[] cham = mimas.toCharArray();
                int mi=0;
                for (int j = 0; j < cham.length; j++) {
                    if (cham[j] >= '0' || cham[j] <= '9' || cham[j] >= 'a' || cham[j] <= 'z' || cham[j] >= 'A' || cham[j] <= 'Z') {
                        mi++;
                    }
                }
                if(mi==cham.length){
                    Tmimalist.set(su,mimas);
                    System.out.println("密码修改成功");
                    Scanner shf=new Scanner(System.in);
                    System.out.println("是否登录：1、是 2、否");
                    String hf=shf.nextLine();
                    char [] ar=hf.toCharArray();
                    for(int i=0;i<ar.length;i++){
                        if(ar[i]=='1'){
                            Login lo=new Login(Tzhlist,Tmimalist,Szhlist,Smimalist);

                        }else if(ar[i]=='2'){
                            break;
                        }else {
                            System.out.println("你输入的指令有误");
                        }
                    }

                }
            }else if(t>=0){
                Scanner snn=new Scanner(System.in);
                System.out.println("请输入你的新的密码");
                String mimat = snn.nextLine();
                char[] cham = mimat.toCharArray();
                int mi=0;
                for (int j = 0; j < cham.length; j++) {
                    if (cham[j] >= '0' || cham[j] <= '9' || cham[j] >= 'a' || cham[j] <= 'z' || cham[j] >= 'A' || cham[j] <= 'Z') {
                        mi++;
                    }
                }
                if(mi==cham.length){
                    Smimalist.set(t,mimat);
                    System.out.println("密码修改成功");
                    Scanner shf=new Scanner(System.in);
                    System.out.println("是否登录：1、是 2、否");
                    String hf=shf.nextLine();
                    char [] ar=hf.toCharArray();
                    for(int i=0;i<ar.length;i++){
                        if(ar[i]=='1'){
                            Login lo=new Login(Tzhlist,Tmimalist,Szhlist,Smimalist);
//                            lo.Login();
                        }else if(ar[i]=='2'){
                            break;
                        }else {
                            System.out.println("你输入的指令有误");
                        }
                    }

                }
            }else {
                System.out.println("你要找回密码的账号不存在");
                Scanner shf=new Scanner(System.in);
                System.out.println("是否注册：1、是 2、否");
                String hf=shf.nextLine();
                char [] ar=hf.toCharArray();
                for(int i=0;i<ar.length;i++){
                    if(ar[i]=='1'){
                        Registered re=new  Registered();
                        re.Registered();
                    }else if(ar[i]=='2'){
                        Login lo=new Login(Tzhlist,Tmimalist,Szhlist,Smimalist);
//                        lo.Login();
                    }else {
                        System.out.println("你输入的指令有误");
                    }
                }
            }

        }else {
            System.out.println("你输入的指令有误");

        }
    }

}
