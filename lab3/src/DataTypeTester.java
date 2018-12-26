/*
 * Class for  data types testing.
 * 
 * 
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class DataTypeTester {
    
    public static void testByte(){
        byte a=5 ,b=1, c = 0;
        
        
         System.out.println("\n***** Arithmetical Operators for byte type objects *****");
        //additioin
        c = (byte)(a+b);
        System.out.printf("%d + %d = %d\n", a,b,c);
        //subtraction
        c = (byte) (a-b);
        System.out.printf("%d - %d = %d\n", a,b,c);
        //multiplication
        c= (byte)(a*b);
        System.out.printf("%d * %d = %d\n", a,b,c);
        //division
        c= (byte)(a/b);
        System.out.printf("%d /%d = %d\n", a,b,c);
        // modulus
        c= (byte)(a%b);
        System.out.printf("%d %% %d = %d\n", a,b,c);
        // c = a / 0; --> Arithmetical Exception;
        //c = a % 0; --> Arithmetical Exception
        
        a=6;
        // unary minus
        c = (byte)-a;
        System.out.printf("-%d = %d\n" ,a,c);
        
        // unary plus
        c = (byte)+a;
        System.out.printf("+%d=%d\n", a,c);
        
        
        // prefix increment
        a=6;
        System.out.printf("++%d = %d\n", a,++a);
        
        //postfix increment
        a=6;
        System.out.printf("%d++ = %d\n",a, a++);
        
        //prefix decrement
        a=6;
        System.out.printf("--%d = %d\n",a,--a );
        //postfix decrement
        a=6;
        System.out.printf("%d-- = %d\n", a, a--);
        
        
        System.out.println("\n*****Bitwise operators*****");
        //bitwise AND
        c= (byte)(a&b);
        System.out.printf("%d & %d = %d\n",a, b, c);
        System.out.println("In binary form");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise OR
        c= (byte)(a|b);
        System.out.printf("%d |%d = %d\n",a,b,c);
        System.out.println("In binary form");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise XOR
        c= (byte)(a^b);
        System.out.printf("%d ^ %d = %d\n", a,b,c );
        System.out.println("In binary form");
        
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise unary compliment
        c= (byte)~a;
        System.out.printf("~%d = %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("~%s = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //left shift
        c= (byte)(a<<1);
        System.out.printf("%d << 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s << 1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        c= (byte)(a>>1);
        System.out.printf("%d >> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        a = -5;
        c= (byte)(a>>1);
        System.out.printf("%d >> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        
        //zero fill right shift
        a = 5;
        c= (byte)(a>>>1);
        System.out.printf("%d >>> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
         //zero fill right shift
        a = -5;
        c= (byte)(a>>>1);
        System.out.printf("%d >>> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        System.out.println("\n***** Assignment Operators *****");
        
        c = 7;
        
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a );
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a );
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a );
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a );
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a );
                
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d)&& (%d >0) -->%b\n", a,b,a,
                (a>b)&& (a>0));
        
       // bitwise logical AND
        System.out.printf("(%d > %d)&(%d >0) -->%b\n", a,b,a,
                (a>b)& (a>0)) ;
         // logical OR
        System.out.printf("(%d >= %d)|| (%d !=0) -->%b\n", a,b,b,
                (a>b)|| (a>0));
        
       // bitwise logical OR
        System.out.printf("(%d >= %d)|(%d != 0) -->%b\n", a,b,b,
                (a>b)| (a>0)) ;
        
        // logical XOR
        System.out.printf("(%d >= %d)| (%d !=0) -->%b\n", a,b,b,
                (a>=b)^ (b!=0));
        
        // logical NOT
        System.out.printf("!(%d >= %d) -->%b\n", a,b,!(a >=b));
                
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        
       System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
        (a > b ? a : b));
        System.out.println("\nType Cast Operator:"); 
        
        int i = 320000;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c =(byte)i;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
        c =(byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n",
        bool);
}
        
    public static void testShort(){    
    short a = 5, b = 2, c;
          
         System.out.println("\n***** Arithmetical Operators for Short type objects *****");
        //additioin
        c = (short)(a+b);
        System.out.printf("%d + %d = %d\n", a,b,c);
        //subtraction
        c = (short) (a-b);
        System.out.printf("%d - %d = %d\n", a,b,c);
        //multiplication
        c= (short)(a*b);
        System.out.printf("%d * %d = %d\n", a,b,c);
        //division
        c= (short)(a/b);
        System.out.printf("%d /%d = %d\n", a,b,c);
        // modulus
        c= (short)(a%b);
        System.out.printf("%d %% %d = %d\n", a,b,c);
        // c = a / 0; --> Arithmetical Exception;
        //c = a % 0; --> Arithmetical Exception
        
        a=6;
        // unary minus
        c = (short)-a;
        System.out.printf("-%d = %d\n" ,a,c);
        
        // unary plus
        c = (short)+a;
        System.out.printf("+%d=%d\n", a,c);
        
        
        // prefix increment
        a=6;
        System.out.printf("++%d = %d\n", a,++a);
        
        //postfix increment
        a=6;
        System.out.printf("%d++ = %d\n",a, a++);
        
        //prefix decrement
        a=6;
        System.out.printf("--%d = %d\n",a,--a );
        //postfix decrement
        a=6;
        System.out.printf("%d-- = %d\n", a, a--);
        
        
        System.out.println("\n*****Bitwise operators*****");
        //bitwise AND
        c= (short)(a&b);
        System.out.printf("%d & %d = %d\n",a, b, c);
        System.out.println("In binary form");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise OR
        c= (short)(a|b);
        System.out.printf("%d |%d = %d\n",a,b,c);
        System.out.println("In binary form");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise XOR
        c= (short)(a^b);
        System.out.printf("%d ^ %d = %d\n", a,b,c );
        System.out.println("In binary form");
        
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise unary compliment
        c= (short)~a;
        System.out.printf("~%d = %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("~%s = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //left shift
        c= (short)(a<<1);
        System.out.printf("%d << 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s << 1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        c= (short)(a>>1);
        System.out.printf("%d >> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        a = -5;
        c= (short)(a>>1);
        System.out.printf("%d >> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        
        //zero fill right shift
        a = 5;
        c= (short)(a>>>1);
        System.out.printf("%d >>> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
         //zero fill right shift
        a = -5;
        c= (short)(a>>>1);
        System.out.printf("%d >>> 1= %d\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        System.out.println("\n***** Assignment Operators *****");
        
        c = 7;
        
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a );
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a );
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a );
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a );
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a );
                
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d)&& (%d >0) -->%b\n", a,b,a,
                (a>b)&& (a>0));
        
       // bitwise logical AND
        System.out.printf("(%d > %d)&(%d >0) -->%b\n", a,b,a,
                (a>b)& (a>0)) ;
         // logical OR
        System.out.printf("(%d >= %d)|| (%d !=0) -->%b\n", a,b,b,
                (a>b)|| (a>0));
        
       // bitwise logical OR
        System.out.printf("(%d >= %d)|(%d != 0) -->%b\n", a,b,b,
                (a>b)| (a>0)) ;
        
        // logical XOR
        System.out.printf("(%d >= %d)| (%d !=0) -->%b\n", a,b,b,
                (a>=b)^ (b!=0));
        
        // logical NOT
        System.out.printf("!(%d >= %d) -->%b\n", a,b,!(a >=b));
                
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        
       System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
        (a > b ? a : b));
        System.out.println("\nType Cast Operator:"); 
        
        byte bt = 1;
        int i = -320000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c =(short) i;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
        c = (short)ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n",
        bool);
        
        
        
        
        
        
        
        
        
    }
    
    public static void testChar(){    
    char a = 's', b = 'r', c;
          
         System.out.println("\n***** Arithmetical Operators for Char type objects *****");
        //additioin
        c = (char)(a+b);
        System.out.printf("%c + %c = %c\n", a,b,c);
        //subtraction
        c = (char) (a-b);
        System.out.printf("%c - %c = %c\n", a,b,c);
        //multiplication
        c = (char)(a*b);
        System.out.printf("%c * %c = %c\n", a,b,c);
        //division
        c= (char)(a/b);
        System.out.printf("%c /%c = %c\n", a,b,c);
        // modulus
        c= (char)(a%b);
        System.out.printf("%c %% %c = %c\n", a,b,c);
        //c = a / 0; --> Arithmetical Exception;
        //c = a % 0; --> Arithmetical Exception
        
        a='6';
        // unary minus
        c = (char)-a;
        System.out.printf("-%c = %c\n" ,a,c);
        
        // unary plus
        c = (char)+a;
        System.out.printf("+%c=%c\n", a,c);
        
        
        // prefix increment
        a='6';
        System.out.printf("++%c = %c\n", a,++a);
        
        //postfix increment
        a='6';
        System.out.printf("%c++ = %c\n",a, a++);
        
        //prefix decrement
        a='6';
        System.out.printf("--%c = %c\n",a,--a );
        //postfix decrement
        a='6';
        System.out.printf("%c-- = %c\n", a, a--);
        
        
        System.out.println("\n*****Bitwise operators*****");
        //bitwise AND
        c= (char)(a&b);
        System.out.printf("%c & %c = %c\n",a, b, c);
        System.out.println("In binary form");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise OR
        c= (char)(a|b);
        System.out.printf("%c |%c = %c\n",a,b,c);
        System.out.println("In binary form");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise XOR
        c= (char)(a^b);
        System.out.printf("%c ^ %c = %c\n", a,b,c );
        System.out.println("In binary form");
        
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));
        //bitwise unary compliment
        c= (char)~a;
        System.out.printf("~%c = %c\n",a,c);
        System.out.println("In binary form");
        System.out.printf("~%s = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //left shift
        c= (char)(a<<1);
        System.out.printf("%c << 1= %c\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s << 1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        c= (char)(a>>1);
        System.out.printf("%c >> 1= %c\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        //right shift
        //(char)a = -5;
      //  c= (char)(a>>1);
       // System.out.printf("%d >> 1= %d\n",a,c);
       // System.out.println("In binary form");
        //System.out.printf("%s >>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        
        //zero fill right shift
        a = 5;
        c= (char)(a>>>1);
        System.out.printf("%c >>> 1= %c\n",a,c);
        System.out.println("In binary form");
        System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
         //zero fill right shift
       // a = -5;
       // c= (short)(a>>>1);
      //  System.out.printf("%d >>> 1= %d\n",a,c);
      //  System.out.println("In binary form");
      //  System.out.printf("%s >>>1 = %s\n",Integer.toBinaryString(a),Integer.toBinaryString(c));
        
        System.out.println("\n***** Assignment Operators *****");
        
        c = 'w';
        
        System.out.printf("%c += %c --> c = %c\n", c, a, c+=a );
        System.out.printf("%c -= %c --> c = %c\n", c, a, c-=a );
        System.out.printf("%c *= %c --> c = %c\n", c, a, c*=a );
        System.out.printf("%c /= %c --> c = %c\n", c, a, c/=a );
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c%=a );
                
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%c> %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);
        
        
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%c > %c)&& (%c >0) -->%b\n", a,b,a,
                (a>b)&& (a>0));
        
       // bitwise logical AND
        System.out.printf("(%c > %c)&(%c >0) -->%b\n", a,b,a,
                (a>b)& (a>0)) ;
         // logical OR
        System.out.printf("(%c >= %c)|| (%c !=0) -->%b\n", a,b,b,
                (a>b)|| (a>0));
        
       // bitwise logical OR
        System.out.printf("(%c >= %c)|(%c != 0) -->%b\n", a,b,b,
                (a>b)| (a>0)) ;
        
        // logical XOR
        System.out.printf("(%c >= %c)| (%c !=0) -->%b\n", a,b,b,
                (a>=b)^ (b!=0));
        
        // logical NOT
        System.out.printf("!(%c >= %c) -->%b\n", a,b,!(a >=b));
                
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        
       System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,
        (a > b ? a : b));
        System.out.println("\nType Cast Operator:"); 
        
        byte bt = 1;
        int i = -320000;
        short sh = -3200;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c =(char) bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);
        c =(char) i;
        System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c);
        c = (char)sh;
        System.out.printf("char = char: c = (char)%d --> c = %c\n", sh, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
        //c = (char)bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n",
        bool);
        
        
    }
    
    public static void testInt() {
        int a = 5, b = 2, c;
            System.out.println("\n***** Arithmetical Operators for Int type*****");
            // addition
            c = a + b;
            System.out.printf("%d + %d = %d\n", a, b, c);
            // subtraction
            c = a - b;
            System.out.printf("%d - %d = %d\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%d * %d = %d\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%d / %d = %d\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%d %% %d = %d\n", a, b, c);
            // c = a / 0; --> Arithmetical Exception
            // c = a % 0; --> Arithmetical Exception
            a = 5;
            // unary minus
            c = -a;
            System.out.printf("-%d = %d\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%d = %d\n", a, c);
            // prefix increment
            a = 5;
            System.out.printf("++%d = %d\n", a, ++a);
            // postfix increment
            a = 5;
            System.out.printf("%d++ = %d\n", a, a++);
            // prefix decrement
            a = 5;
            System.out.printf("--%d = %d\n", a, --a);
            // postfix decrement
            a = 5;
            System.out.printf("%d-- = %d\n", a, a--);
            System.out.println("\n***** Bitwise Operators *****");
            c = a & b; // bitwise AND
            System.out.printf("%d & %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = a | b; // bitwise OR
            System.out.printf("%d | %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = a ^ b; // bitwise XOR
            System.out.printf("%d ^ %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = ~a; // bitwise unary compliment
            System.out.printf("~%d = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            c = a << 1; // left shift
            System.out.printf("%d << 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            c = a >> 1; // right shift
            System.out.printf("%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            a = -5;
            c = a >> 1; // right shift
            System.out.printf("%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            a = 5;
            c = a >>> 1; // zero fill right shift
            System.out.printf("%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            a = -5;
            c = a >>> 1; // zero fill right shift
            System.out.printf("%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
            Integer.toBinaryString(c));
            System.out.println("\n***** Assignment Operators *****");
            c = 7;
            System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
            System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
            System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
            System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
            System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
            System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
            System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
            System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
            System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
            System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
            System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
            System.out.println("\n***** Relational Operators *****");
            // greater than
            System.out.printf("%d > %d --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%d < %d --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
            // equal to
            System.out.printf("%d == %d --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%d != %d --> %b\n", a, b, a != b);
            System.out.println("\n***** Logical Operations *****");
            // logical AND
            System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
            (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
            (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
            (a >= b) || (b != 0));
             // bitwise logical OR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
            (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
            (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\nCondition Operator:");
            System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
            (a > b ? a : b));
            System.out.println("\nType Cast Operator:");
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            long l = 100000000000000000L;
            float f = 1.9f;
            double d = 123456789.625;
            boolean bool = true;
            c = bt;
            System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
            c = sh;
            System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
            c = ch;
            System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
            c = (int) l;
            System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
            c = (int) f;
            System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
            c = (int) d;
            System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
            // c = (int)bool;
            System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
            bool);
    }
    
    public static void testLong() {
        long a = 5, b = 2, c;
            System.out.println("\n***** Arithmetical Operators for Long type *****");
            // addition
            c = a + b;
            System.out.printf("%d + %d = %d\n", a, b, c);
            // subtraction
            c = a - b;
            System.out.printf("%d - %d = %d\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%d * %d = %d\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%d / %d = %d\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%d %% %d = %d\n", a, b, c);
            // c = a / 0; --> Arithmetical Exception
            // c = a % 0; --> Arithmetical Exception
            a = 5;
            // unary minus
            c = -a;
            System.out.printf("-%d = %d\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%d = %d\n", a, c);
            // prefix increment
            a = 5;
            System.out.printf("++%d = %d\n", a, ++a);
            // postfix increment
            a = 5;
            System.out.printf("%d++ = %d\n", a, a++);
            // prefix decrement
            a = 5;
            System.out.printf("--%d = %d\n", a, --a);
            // postfix decrement
            a = 550000000;
            System.out.printf("%d-- = %d\n", a, a--);
            System.out.println("\n***** Bitwise Operators *****");
            c = a & b; // bitwise AND
            System.out.printf("%d & %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(b), Long.toBinaryString(c));
            c = a | b; // bitwise OR
            System.out.printf("%d | %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(b), Long.toBinaryString(c));
            c = a ^ b; // bitwise XOR
            System.out.printf("%d ^ %d = %d\n", a, b, c);
            System.out.println("in binary form:");
            System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(b), Long.toBinaryString(c));
            c = ~a; // bitwise unary compliment
            System.out.printf("~%d = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("~%s = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            c = a << 1; // left shift
            System.out.printf("%d << 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            c = a >> 1; // right shift
            System.out.printf("%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            a = -5;
            c = a >> 1; // right shift
            System.out.printf("%d >> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            a = 5;
            c = a >>> 1; // zero fill right shift
            System.out.printf("%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            a = -5;
            c = a >>> 1; // zero fill right shift
            System.out.printf("%d >>> 1 = %d\n", a, c);
            System.out.println("in binary form:");
            System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
            Long.toBinaryString(c));
            System.out.println("\n***** Assignment Operators *****");
            c = 7;
            System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
            System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
            System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
            System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
            System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
            System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
            System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
            System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
            System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
            System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
            System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
            System.out.println("\n***** Relational Operators *****");
            // greater than
            System.out.printf("%d > %d --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%d < %d --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
            // equal to
            System.out.printf("%d == %d --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%d != %d --> %b\n", a, b, a != b);
            System.out.println("\n***** Logical Operations *****");
            // logical AND
            System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
            (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
            (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
            (a >= b) || (b != 0));
             // bitwise logical OR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
            (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
            (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\nCondition Operator:");
            System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
            (a > b ? a : b));
            System.out.println("\nType Cast Operator:");
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            int i = 1000000;
            float f = 1.9f;
            double d = 123456789.625;
            boolean bool = true;
            c = bt;
            System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
            c = sh;
            System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
            c = ch;
            System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
            c =  i;
            System.out.printf("int = long: c = %d --> c = %d\n", i, c);
            c = (long) f;
            System.out.printf("int = float: c = (long)%f --> c = %d\n", f, c);
            c = (long) d;
            System.out.printf("int = double: c = (long)%f --> c = %d\n", d, c);
            // c = (long)bool;
            System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
            bool);
    }
    
    public static void testFloat() {
        float a = 5.5f, b = 2.2f, c;
            System.out.println("\n***** Arithmetical Operators for float type*****");
            // addition
            c =(a + b);
            System.out.printf("%f + %f = %f\n", a, b,c);
            // subtraction
            c = a - b;
            System.out.printf("%f - %f = %f\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%f * %f = %f\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%f / %f = %f\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%f %% %f = %f\n", a, b, c);
            // c = a / 0; --> Arithmetical Exception
            // c = a % 0; --> Arithmetical Exception
            a = 5f;
            // unary minus
            c = -a;
            System.out.printf("-%f = %f\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%f = %f\n", a, c);
            // prefix increment
            a = 5f;
            System.out.printf("++%f = %f\n", a, ++a);
            // postfix increment
            a = 5f;
            System.out.printf("%f++ = %f\n", a, a++);
            // prefix decrement
            a = 5f;
            System.out.printf("--%f = %f\n", a, --a);
            // postfix decrement
            a = 5f;
            System.out.printf("%f-- = %f\n", a, a--);
            System.out.println("\n***** Bitwise Operators *****");
            System.out.println("\n****Bad type for binary operators *****");
            
            System.out.println("\n***** Assignment Operators *****");
            c = 7f;
            System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
            System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
            System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
            System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
            System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
            
            System.out.println("\n***** Relational Operators *****");
            // greater than
            System.out.printf("%f > %f --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%f < %f --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
            // equal to
            System.out.printf("%f == %f --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%f != %f --> %b\n", a, b, a != b);
            System.out.println("\n***** Logical Operations *****");
            // logical AND
            System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
            (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
            (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
            (a >= b) || (b != 0));
             // bitwise logical OR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
            (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
            (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\nCondition Operator:");
            System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
            (a > b ? a : b));
            System.out.println("\nType Cast Operator:");
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            int i = 1000000;
            long l = 10000000;
            double d = 123456789.625;
            boolean bool = true;
            c = bt;
            System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
            c = sh;
            System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
            c = ch;
            System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
            c =  i;
            System.out.printf("float = int: c = %d --> c = %f\n", i, c);
            c = (float) l;
            System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
            c = (float) d;
            System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
            // c = (float)bool;
            System.out.printf("float = boolean: c = (float)%b --> Compile Error\n",
            bool);
    }
    
    public static void testDouble() {
        double a = 5.555, b = 2.222, c;
            System.out.println("\n***** Arithmetical Operators for double type*****");
            // addition
            c =(a + b);
            System.out.printf("%f + %f = %f\n", a, b,c);
            // subtraction
            c = a - b;
            System.out.printf("%f - %f = %f\n", a, b, c);
            // multiplication
            c = a * b;
            System.out.printf("%f * %f = %f\n", a, b, c);
            // division
            c = a / b;
            System.out.printf("%f / %f = %f\n", a, b, c);
            // modulus
            c = a % b;
            System.out.printf("%f %% %f = %f\n", a, b, c);
            // c = a / 0; --> Arithmetical Exception
            // c = a % 0; --> Arithmetical Exception
            a = 5f;
            // unary minus
            c = -a;
            System.out.printf("-%f = %f\n", a, c);
            // unary plus
            c = +a;
            System.out.printf("+%f = %f\n", a, c);
            // prefix increment
            a = 5f;
            System.out.printf("++%f = %f\n", a, ++a);
            // postfix increment
            a = 5f;
            System.out.printf("%f++ = %f\n", a, a++);
            // prefix decrement
            a = 5f;
            System.out.printf("--%f = %f\n", a, --a);
            // postfix decrement
            a = 5f;
            System.out.printf("%f-- = %f\n", a, a--);
            System.out.println("\n***** Bitwise Operators *****");
            System.out.println("\n****Bad type for binary operators *****");
            
            System.out.println("\n***** Assignment Operators *****");
            c = 7f;
            System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
            System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
            System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
            System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
            System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
            
            System.out.println("\n***** Relational Operators *****");
            // greater than
            System.out.printf("%f > %f --> %b\n", a, b, a > b);
            // greater than or equal to
            System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
            // less than
            System.out.printf("%f < %f --> %b\n", a, b, a < b);
            // less than or equal to
            System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
            // equal to
            System.out.printf("%f == %f --> %b\n", a, b, a == b);
            // not equal to
            System.out.printf("%f != %f --> %b\n", a, b, a != b);
            System.out.println("\n***** Logical Operations *****");
            // logical AND
            System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
            (a > b) && (a > 0));
            // bitwise logical AND
            System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
            (a > b) & (a > 0));
            // logical OR
            System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
            (a >= b) || (b != 0));
             // bitwise logical OR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
            (a >= b) | (b != 0));
            // logical XOR
            System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
            (a >= b) ^ (b != 0));
            // logical NOT
            System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\nCondition Operator:");
            System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
            (a > b ? a : b));
            System.out.println("\nType Cast Operator:");
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            int i = 1000000;
            long l = 10000000;
            float fl = 123456789.6f;
            boolean bool = true;
            c = bt;
            System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
            c = sh;
            System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
            c = ch;
            System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
            c =  i;
            System.out.printf("double = int: c = %d --> c = %f\n", i, c);
            c = (double) l;
            System.out.printf("double = long: c = (double)%d --> c = %f\n", l, c);
            c = (double) fl;
            System.out.printf("double = float: c = (double)%f --> c = %f\n", fl, c);
            // c = (double)bool;
            System.out.printf("double = boolean: c = (double)%b --> Compile Error\n",
            bool);
    }
    
    public static void testString() {
        String a = "djdjdjd", b = "jsjdekek", c;
            System.out.println("\n***** Arithmetical Operators for Int type*****");
            // addition
            c = a + b;
            System.out.printf("%s + %s = %s\n", a, b, c);
            
            a = "sjdjdjd";
            
            System.out.println("\n***** Bitwise Operators *****");
            System.out.println("\n****Bad type for binary operators *****");
            
            System.out.println("\n***** Assignment Operators *****");
            
            c = "7jjjj";
            System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
            

            
            System.out.println("\n***** Relational Operators *****");
            System.out.println("\n****Bad type for relational operators *****");
            
          
            System.out.println("\n***** Logical Operations *****");
            System.out.println("\n****Bad type for logical operators *****");
            
            
            System.out.println("\n***** Misc Operators *****");
            System.out.println("\n****Bad type for misc operators *****");
            System.out.println("\n***Condition Operator:");
            System.out.println("\n****Bad type for Condition Operator *****");
            
            System.out.println("\n*****Type Cast Operator:");
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            int i = 320000;
            long l = 100000000000000000L;
            float f = 1.9f;
            double d = 123456789.625;
            boolean bool = true;
             c = String.valueOf(bt);
            System.out.printf("byte to string: c = %d --> c = %s\n", bt, c);
            c = String.valueOf(sh);
             System.out.printf("short to string: c = %d --> c = %s\n", sh, c);  
            c = String.valueOf(ch);
            System.out.printf("char to string: c = %c --> c = %s\n", ch, c);
            c = String.valueOf(i);
             System.out.printf("int to string: c = %d --> c = %s\n", i, c);  
             c = String.valueOf(l);
             System.out.printf("long to string: c = %d --> c = %s\n", l, c);  
             c = String.valueOf(f);
             System.out.printf("float to string: c = %f --> c = %s\n", f, c);
            c = String.valueOf(d);
            System.out.printf("double to string: c = %f --> c = %s\n", d, c);
            c = String.valueOf(bool);
            System.out.printf("boolean to string: c = %b --> c = %s\n", bool, c);
    }
    public static void testBoolean() {
    boolean a = true, b = false, c;
    System.out.println("\n***** Arithmetical Operators *****");
    System.out.println("\n****Bad type for Arithmetical operators *****");

    System.out.println("\n***** Bitwise Operators *****");
    c = a & b; // bitwise AND
    System.out.printf("%b & %b = %b\n", a, b, c);
    c = a | b; // bitwise OR
    System.out.printf("%b | %b = %b\n", a, b, c);
    c = a ^ b; // bitwise XOR
    System.out.printf("%b ^ %b = %b\n", a, b, c);
    System.out.println("\n***** Assignment Operators *****");
    System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
    System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
    System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
    System.out.println("\n***** Relational Operators *****");
    // equal to
    System.out.printf("%b == %b --> %b\n", a, b, a == b);
    // not equal to
    System.out.printf("%b != %b --> %b\n", a, b, a != b);
    System.out.println("\n***** Logical Operations *****");
    c = a && b; // logical AND
    System.out.printf("%b && %b = %b\n", a, b, c);
    c = a || b; // logical OR
    System.out.printf("%b || %b = %b\n", a, b, c);
    c = a ^ b; // logical XOR
    System.out.printf("%b ^ %b = %b\n", a, b, c);
    // logical NOT
    System.out.printf("!%b --> %b\n", a, !a);
    System.out.println("\n***** Misc Operators *****");
     System.out.println("\n****Bad type for Misc operators *****");
    
    System.out.println("\nCondition Operator:");
    System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
    System.out.println("\nType Cast Operator:");
     System.out.println("\n****type only for boolean  *****");
    boolean bool = true;
    c = bool;
    System.out.printf("boolean = boolean: c = (bool)%b --> %b\n",c,bool);
    }
    public static void testStudent() {
        Student a = new Student ();
        Student b = new Student ();
        Student c = new Student ();
      
            System.out.println("\n***** Operators for Student type*****");
            System.out.println("\n****Bad type for Arithmetical operators *****"); // addition
            System.out.println("\n****Bad type for binary operators *****");
            System.out.println("\n*****Bad type for Assignment Operators *****");
            System.out.println("\n****Bad type for relational operators *****");
            System.out.println("\n****Bad type for logical operators *****");
            System.out.println("\n****Bad type for misc operators *****");
            System.out.println("\n****Bad type for Condition Operator *****");
            
            System.out.println("\n*****Bad type for Type Cast Operator:");
            
           
   
            
           
          
           
    }
    
    
    
}
