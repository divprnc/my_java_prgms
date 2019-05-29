import java.io.*;

class  AlphaOrder
{
    public static void main(String args[]) 
    {
            String str,s1,s2,result="";
            int i,j,len;
                 try{
                      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
                      System.out.print("Enter String : ");
                      System.out.flush();
                      str=obj.readLine();
                      len=str.length();
                      for(i=0;i<len;i++)
                      {
                          for(j=i+1;j<len;j++)
                          {
                              s1=str.charAt(i);
                              s2=str.charAt(j);
                              if(s1 < s2)
                                  result.concat(s1);
                              else
                                  result.concat(s2);
                          }
                      }
                    }
                catch(Exception e) {}
    }
}