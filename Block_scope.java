public class Block_scope {

    public static void main(String[] args){
    int a = 23;
    int b = 20;

        {
            //int a = 10; --> In block scopping we are not allowed to initialize the variable again which is already initialized before as it is shown

            a = 10;
            System.out.println(a); // We can change the value of variable in block code. This will print 10
            int c = 12;
            System.out.println(c); // The value of C here in this block is initialized as 12 so it will print 12

        }

        System.out.println(a); //we changed the value of a in block scope so now it will be 10 here outside of block too
        int c = 22;
        System.out.println(c);/* The value of C was initialized 12 in above given block but here what we have done
                    is that we have initialized the value of C again. So this means that we can initialize the value
                    of any variable which is in a block of our parent block i.e main block and child block here we
                    consider is the unnamed blocked in which we have coded
                    */
    }
}
