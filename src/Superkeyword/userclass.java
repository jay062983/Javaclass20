package Superkeyword;

public class userclass {
    /*Write program: userClass  that has a constructor that initializes instance variable name
    and mobile number.
    Create a subclass  userInfo that will have user address variable
    and it also being initialized through constructor call. Print users name,
    mobile number and address in userDetails method. Test your code.  */

String name;
long mobilenumber;

userclass(String name,long mobilenumber){
    this.name=name;
    this.mobilenumber=mobilenumber;
    System.out.println("name"+" "+mobilenumber);
}

}
class userInfo extends userclass{
    String useraddress;

    userInfo(String useraddress,String name,long mobilenumber){
        super(name,mobilenumber);
        this.useraddress=useraddress;

    }
    void display(){
        System.out.println(name+" "+useraddress+" "+mobilenumber);

    }
}