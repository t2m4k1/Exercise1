/**
 * Created by Thomas-Notebook on 11.04.2017.
 */
public class HelloUser {
    private String username;
    public HelloUser(String username){
        this.username = username;
    }
    public void greetUser(){
        System.out.println("Hello: "+getUsername());
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}
