package com.learning.polymorphism.example1;

public class Main {
    public static void main(String[] args) {

        /*
        * Television 1 has 3 special features.
        * and remote 1 is used to access those features.
        * */

        Television1 remote1 = new Television1();
        System.out.println(remote1.prime);
        System.out.println(remote1.zee5);
        System.out.println(remote1.netflix);

        /*
        * Television 2 has 5 special features. 3 features are same as of television 1
        * and 2 new features were added to it.
        *
        * We are using remote 2 to access those features.
        * */
        Television2 remote2 = new Television2();
        System.out.println(remote2.hotstar);
        System.out.println(remote2.jioCinema);


        /*
        * Now we are using remote 1 to access features on television 2
        * we can see the we can only access the features that are available in Television 1.
        * */

        Television1 remote01 = new Television2();
        System.out.println(remote01.prime);
        System.out.println(remote01.zee5);
        System.out.println(remote01.netflix);


        /*
        * now we are using remote 2 to access features on television 1.
        *
        * */
        Television2 remote02 = (Television2) new Television1();
        System.out.println(remote02.netflix);
        System.out.println(remote02.hotstar);
    }
}
