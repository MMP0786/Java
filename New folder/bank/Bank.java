package bank;

public class Bank {
    protected String name;
    public int age;
        
    public static void main(String args []){
        Account account1 =new Account();
            account1.name = "Panwar";
            account1.setPassword("12345@ggg");
            System.out.println(account1.getPass());
        }
        
    }
    class Account {
       protected String name;
        int age;
        private String pass;

        public String getPass(){
            return this.pass;
        }
    
        public void setPassword(String passw){
            this.pass = passw;
        }
    
    }
