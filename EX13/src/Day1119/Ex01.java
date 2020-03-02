package Day1119;

import java.util.ArrayList;

public class Ex01 {

}
class SearchExam {
	 
    public static final String search = "재무1팀/인사담당";
    //public static final String search = "재무1팀/재무2팀";
    public static String[][] deptInfo = {
                                          {"CEO","-"},
                                          {"CTO","CEO"},
                                          {"CFO","CEO"},
                                          {"CHO","CEO"},
                                          {"기술담당","CTO"},
                                          {"품질담당","CTO"},
                                          {"재무담당","CFO"},
                                          {"회계담당","CFO"},
                                          {"인사담당","CHO"},
                                          {"교육담당","CHO"},
                                          {"교사담당","CHO"},
                                          {"기술1팀","기술담당"},
                                          {"기술2팀","기술담당"},
                                          {"기술3팀","기술담당"},
                                          {"재무1팀","재무담당"},
                                          {"재무2팀","재무담당"},
                                        };
 
 
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        String result = commonDeptSearch2(deptInfo, search);
        System.out.println("검색부서 : " + search);
        System.out.println("공통부서 : " + result);
    }
 
 
    public static String commonDeptSearch2(String[][] deptInfo, String search)
    {
        String [] searchKey =  search.split("/");
        String resultKey = null;
        String nextKey = "";
        System.out.println("검색부서 : " + searchKey[0]);
        System.out.println("검색부서 : " + searchKey[1]);
 
        ArrayList<String> tree1 = new ArrayList<String>();
        ArrayList<String> tree2 = new ArrayList<String>();
 
        nextKey = searchKey[0];
        tree1.add(nextKey);
 
        boolean loop = true ;
        int i = 0 ;
        while(loop){
            if(nextKey.equals(deptInfo[i][0])){
                nextKey =  deptInfo[i][1];
 
                if(deptInfo[i][1].equals("-")){
                    loop = false;
                }else{
                    tree1.add(nextKey);
                }
                i = 0;
                continue;
            }
            i++ ;
        }
 
        System.out.println("tree1  :" + tree1);
 
        nextKey = searchKey[1];
        tree2.add(nextKey);
        loop = true ;
        i = 0 ;
        while(loop){
            if(nextKey.equals(deptInfo[i][0])){
                nextKey =  deptInfo[i][1];
 
                if(deptInfo[i][1].equals("-")){
                    loop = false;
                }else{
                    tree2.add(nextKey);
                }
                i = 0;
                continue;
            }
            i++;
        }
        System.out.println("tree2  :" + tree2);
 
        int cnt = 0;
        for(String tmp : tree1){
            for(String tmp2 : tree2){
                cnt++;
                if(tmp.equals(tmp2)){
                    resultKey = tmp;
                    break;
                }
            }
 
//          if(!resultKey.isEmpty()){
//              break;
//          }
        }
 
        return resultKey;
    }
}