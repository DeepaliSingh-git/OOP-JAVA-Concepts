//Prove Immutability

class code2{
    public static void main(String args[]){
        String s="Sachin";
        s.concat(" Tendulkar");
        System.out.println(s);
        String a=s.concat("Tendulkar");
        System.out.println(a);
    }

}