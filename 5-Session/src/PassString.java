public class PassString {
    public static void main(String[] args) {
        String name = "Shakespeare";

        //Display the String referenced by the name variable.
        System.out.println("In main, the name is " + name);
        changeName(name);
        //Display the String referenced by the variable.
        System.out.println("back in the main, the name is " + name);
    }

    /**The changeName method acceots a String as its argument.*/

    public static void changeName(String str){
        //Create a String object containing "Dickens"
        //Assign is to the str value
        str = "Dickens";
        System.out.println("In the changeName method, the value");
    }

}
