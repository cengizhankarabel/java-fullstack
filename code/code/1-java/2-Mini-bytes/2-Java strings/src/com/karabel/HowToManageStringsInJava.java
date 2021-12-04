package com.karabel;

/*

    strings

        => group of characters ( a-zA-Z , 0-9 , any symbol )

    how to manage Strings in java ?

    using 3 classes

    1. java.lang.String
    2. java.lang.StringBuffer
    3. java.lang.StringBuilder

    ---------------------------------------------------------------------------

    imp notes about java strings

   #1-, every string is an object on java-language
   #2-, we can create string object with /without 'new' operator
   #3-, if we create string object without 'new' operator, obj will get placed in SCP memory

        SCP-memory

        => pre allocated memory
        => can hols unique string objects

   #4-, by default, every string is an 'immutable' object

 */

import java.util.Locale;
import java.util.logging.SocketHandler;
import java.util.prefs.Preferences;

public class HowToManageStringsInJava {
    public static void main(String[] args) {

/*        String s1="abc";
        String s2="abc";

        System.out.println(s1);
        System.out.println(s2);
        String s3=s1.concat("d");

        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

 /*
        String s4=new String("abc");
        String s5=new String("abc");


        System.out.println("s4: "+ s4);
        System.out.println("s5: "+ s5);
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));

        String a="xyz";
        String b="xyz";

        String c=new String("xyz");
        String d=new String("xyz");

        System.out.println(a==b);   //are they same memory/reference?
        System.out.println(a.equals(b));  //are they same value?

        System.out.println(c==d);   //are they same memory? False because references are difference
        System.out.println(c.equals(d));  //are they same value/contents?

        */


      /*
            => '==' operator compares Preferences
            => 'equals' method compare obj's content

        */

        String s="abcdefgh";

        System.out.println(s.length());
        System.out.println(s.charAt(0));

        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        System.out.println(s.indexOf(97));  //97 ='a' , 65 = 'A'
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("cde"));
        System.out.println(s.indexOf("cded")); // => -1 means nothing

        for (int i=0; i<127; i++){
            System.out.println(i+" ->"+ (char)i);
        }

        s=s.concat("a");
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.startsWith("abc")); // => True / False
        System.out.println(s.endsWith("chd"));
        System.out.println(s.contains("cde"));

        int count=0;
        String ss="cdencdecfdjgfdjcdedfgdjfgdjcdekfdhgkdghcdefkghkfcde";
        for(int i=0; i< ss.length(); i++){
            if(ss.charAt(i) == 'c'){
                if(ss.charAt(i+1)=='d'){
                    if(ss.charAt(i+2)=='e'){
                        count+=1;
                    }else{
                        System.out.println(ss.charAt(i));
                    }
                }System.out.println(ss.charAt(i));
            }System.out.println(ss.charAt(i));
        }
        System.out.println(count);

        String x="Abc";
        String y="abc";  // 97 ='a' , 65 = 'A'

        // equalsIgnoreCase()
        System.out.println(x.equalsIgnoreCase(y));

        String name1="cengizhan";
        String name2="karabel";

        System.out.println(y.compareTo(x));

        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

        //trim() remove spaces
        String givenName1 = "    Cengizhan";
        String givenName2 = "Cengizhan";

        System.out.println(givenName1.trim().equals(givenName2));

        String emptyVsBlank = " ";
        System.out.println(emptyVsBlank.isBlank());
        System.out.println(emptyVsBlank.isEmpty());

        // split() remove anything
        String menu="Cengizhan,Karabel,Houston,/,TX";
        String[] menu2 = menu.split(",");
        for(int i=0; i<menu2.length; i++){
            System.out.print(menu2[i]);
        }

        System.out.println();
        String filePath1="c:/dir1/dir2/dir3/filename.jpg";
        String filePath2="c:/dir1/dir2/filename.jpg";

        int lastSlashIdx = filePath1.lastIndexOf("/");
        String FileName1= filePath1.substring(lastSlashIdx+1);
        System.out.println(FileName1);

        System.out.println(filePath1.substring(filePath1.lastIndexOf("/")+1));

        String ww="abc";
        char[] charArray=ww.toCharArray(); // String to char array
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);
        ww=new String(charArray);  // char-array to string
        System.out.println(ww);

        String ssn="123-33-2323";

        //validate given user ssn with format xxx-xx-xxxx , here is digit
        boolean isValid=true;
        if(ssn.length()==11){
            for(int i=0; i<11; i++){
                char ch=ssn.charAt(i);
                if(i==3 || i==6){
                    if(ch !='-'){
                        isValid=false;
                        break;
                    };
                }else{
                    if("1234567890".indexOf(ch)==-1){
                        isValid=false;
                        break;
                    }
                }
            }
        }else{
            isValid=false;
        }

        if(isValid){
            System.out.println("Valid ssn");
        }


        //Solution-2 using 'Regular Expression'
        //use case : pattern matching
        String ssnPattern="\\d{3}-\\d{2}-\\d{4}";
        isValid=ssn.matches(ssnPattern);

        if(isValid){
            System.out.println("Valid ssn");
        }else{
            System.out.println("Invalid ssn");
        }

    }
}
