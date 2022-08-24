public class Shadowing {
    static int value1 = 101;
    /*
     this variable in this block can be called as parent for all the variables defined and initialized as value1
     It can be initialized as many times as we want. The basic purpose of shadowing is to decouple the local code
     from the surrounding class.
     */
    public static void main(String[] args){

        System.out.println(value1); // Output: 101

        int value1= 201; //value1 initialized again and now it is changed
        System.out.println(value1);// Output: 201
        fun(); // {Output: 101} Static fun will now access value1 from the first value1 why? because fun is inside shadowing block and it access value1 from its own block not from main
        Shadowing s = new Shadowing();
        s.fun(); /* {Output: 101} Object s of fun will now access value1 from the first value1 why?
                   because fun is inside shadowing block and it access value1 from its own block not from main
                  */

    }
    static void fun(){
        System.out.println(value1);
    }

}
