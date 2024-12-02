interface SignupBonus{
    int  SignupBonus();
}
class Main{
    public static void main(String[]args){
        SignupBonus signupbonus=new SignupBonus() {
            @Override
            public int SignupBonus() {
                return 0;
            }
        };
        signupbonus.SignupBonus();

    }
}