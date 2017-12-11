package extthread.simple;

/**
 * Created by sijiansheng on 2017/4/24.
 */
public class LoginSevlet {

    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username,String password){

        try{
            usernameRef = username;

            if(username.equals("a")){
                Thread.sleep(5000);
            }

            passwordRef = password;
            System.out.println("username="+usernameRef+",password="+passwordRef);
        }catch (InterruptedException e){
          e.printStackTrace();
        }

    }
}
