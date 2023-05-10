package com.string;

public class StringTest {
    public static void main(String[] args) {
        //StringChar();
        //isSame("emre", "emre");
        //test();
        //stringEquals();
        //stringLength();
        //stringCharAt();
        // stringSubstring();
        //stringConcat();
        //stringIndexOf();
        //stringReplace();
        //stringToLowerCase();
        //stringToUpperCase();
        //stringFormat();
        regex();
    }

    public static void StringChar() {
        char[] ch = {'J', 'A', 'V', 'A'};
        String str1 = new String(ch);
        System.out.println(str1);
    }

    public static void isSame(String str, String str1) {
        String s = new String(str);
        String s1 = new String(str1);
        if (str == str1) {
            System.out.println("Aynı");
        } else {
            System.out.println("aynı değil");
        }
    }

    public static void test() {
        System.out.printf("Yunus Emre, %s", "Yunus Emre \n");
        String surname = "Çiftçi";
        System.out.printf("Yunus Emre %s \n", surname);
        /*Sadece String olarak değil:
         %d: decimal. yani long, int, short, byte
         %b: boolean
         %f: floating point numbers. yani double ve float
         %x: hexadecimal
         %c: char
         %e: scientific notification. Örneğin virgüllü sayıyı 1.22e şeklinde yazması gibi.
        */
    }

    public static void stringEquals() {
        String myFullName1 = "Yunus Emre Çiftçi";
        String myFullName2 = "Yunus Emre Çiftçi";
        String myFullName3 = new String("Yunus Emre Çiftçi");

        boolean equals = myFullName1.equals(myFullName2);
        boolean equals1 = myFullName1.equals(myFullName3);

        System.out.println(equals);
        System.out.println(equals1);


        //equals metodu büyük küçük harfe duyarlıdır.
        String apple = "APPLE";
        String apple1 = "apple";
        System.out.println("Büyük küçük harf duyarlılığı: " + apple.equals(apple1));
        //false döner


        //equals metodu kullanılırken String'lerin null gelme ihtimaline karşı hata konrolü yapmamız gerekir.
        String banana = "banana"; //Buraya null yazılırsa NullPinterException fırlatılır.
        String banana1 = "banana";
        try {
            System.out.println("Try-catch içindeki yazım: " + banana.equals(banana1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  "\"Null olan bir String'i başka bir String nesnesiyle karşılaştıramazsın. " +
        //   "NullPointerException fırlatır. " +
        //   "Bu gibi istenmeyen durumların önüne geçmek için equals metodunu kullanırken hata yönetimi yapmak gerekir.


        //Büyük küçük harf duyarlılığının önüne geçmek için aşağıdaki metot kullanılır.
        String orange = "ORANGE";
        String orange1 = "orange";
        try {
            System.out.println("Büyük küçük harf duyarlığı: " + orange.equalsIgnoreCase(orange1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void stringLength() {
        //String ifadenin uzunluğunu hesaplar. Son string ifadeye gelmek için (length - 1) kullanılır.
        String myFullName = "Yunus Emre Çiftçi";
        String myFullName1 = new String("Yunus Emre Çiftçi");
        System.out.println(myFullName.length());
        System.out.println(myFullName1.length());
    }

    public static void stringCharAt() {
        //Parametre olarak verilen int değerin char'ını döner.
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = new String("Yunus Emre Çiftçi");
        System.out.println(fullName.charAt(2));
        System.out.println(fullName1.charAt(2));
        //iki String ifadenin 2. index'i n olduğu için sonuç n çıkar.
    }

    public static void stringSubstring() {
        // 2 farklı parametre alan 2 farklı metodumuz var.
        // Bir tane parametre alan metodumuz verilen int değerden başlayıp String'in length'ine kadar String ifadeyi yazdırır.
        // İki tane parametre alan metodumuz ise ilk verilen int değerden başlatıp, ikinci verilen değere kadar String ifadeyi yazdırır.
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = new String("Yunus Emre Çiftçi");
        //1 parametre alan metod
        System.out.println(fullName.substring(5));
        //2 parametre alan metod
        System.out.println(fullName1.substring(6, 9));
    }

    public static void stringConcat() {
        //Parametre olarak verilen String'i mevcut String'in (length + 1)'e ekler.
        String name = "Yunus Emre";
        String surname = " Çiftçi";
        System.out.println(name.concat(surname));

    }

    public static void stringIndexOf() {
        String fullName = "Yunus Emre Çiftçi";
        //4 farklı parametre alan indexOf metodumuz var. Bunlardan ilki verilen bir unicode'u değerin (char ya da int olabilir)
        //kaçıncı index'te olduğunu bulur. Bulunan ilk değerin index'ini integer olarak geri döndürür.
        System.out.println(fullName.indexOf(69));
        System.out.println(fullName.indexOf("Yunus", 4));

        //


    }

    public static void stringReplace() {
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = "John Doe";
        System.out.println(fullName.replace('Y', 'M'));
        System.out.println(fullName.replace("Yunus", "Mustafa"));
    }

    public static void stringToLowerCase() {
        String fullName = "Yunus Emre Çiftçi";
        System.out.println(fullName.toLowerCase());
    }

    public static void stringToUpperCase() {
        String fullName = "Yunus Emre Çiftçi";
        System.out.println(fullName.toUpperCase());
    }

    public static void stringFormat() {
        //% işaretinden sonra yazılan ilk sayı kaç birimlik alan açılacağını bildirir.
        //. ifadesi .'lı ifade geliyor anlamına gelir. .'dan sonra yazılan sayı .'dan sonra kaç birim yazılacak onu bildirir. Yazının yanına f yazılması gerekiyor.
        //Çünkü .'lı sayıları ifade etmek için float kullanılır. Çevirme esnasında mantıksal çevirim esastır.
        System.out.print("Virgüllü sayıları formatlama:");
        System.out.printf("%4.2f", 4.5 / 3.0);


        //%5s,d,c ifadesi sağ taraftan 5 birimlik yer açılacağı anlamına gelir. Girilen string ifade 5 birimden büyükse %5s ifadesinin anlamı kalmaz. Girilen ifade yazdırılır.
        //%-5s,d,c gibi bir ifade ise sol taraftan 5 birimlik yer açtırır. Kuralları yukarıdaki ile aynı.
        System.out.print("\nBoşluk bırakma: ");
        System.out.printf("%5s", "Y");
        System.out.printf("%-5s", "E");

        //%010d ifadesi verilen sayının başında kaç tane 0 olacağı anlamına gelir. Fakat verilen sayı 0'ların sonuna eklenir.
        //Yani 10 tane 0 gelmesini istiyorsun. Sayıya da 25 yazdın. Çıktı şöyle olur: 0000000025
        //%'den sonra 0 yazılır ve hemen yanında kaç tane 0 olmasını istiyorsan o yazılır. Daha sonra ifadenin yanında d harfi eklenir.
        //Eğer girilen sayı istenilen 0 sayısından büyükse sayı olduğu gibi yazılır.
        System.out.print("\n0 ile sayıları yazma: ");
        System.out.printf("%09d", 34);

        //Tüm bu ifadeler String.format ile kullanılsa kullanım açısından daha faydalı olur.
        String format = String.format("%05d", 24);
        //Bu şekilde
    }

    public static void regex() {
        // \\d,s,ch vs. ifadesi "" ifadesi içine yazılan ifadenin aynı tipte sadece 1 tane bulunursa true döner.
        System.out.println("1".matches("\\d"));
        // "d" ifadesi "" ifadesi içine sadece d harfi yazılırsa true döner. Aynı olmak zorunda.
        System.out.println("d".matches("d"));
        // \\d,s,ch+ ifadesi ile örneğin d tipinde en az 1 tane sayı varsa true döner.
        System.out.println("1".matches("\\d+"));


        System.out.println("123455".matches("\\d++5"));

        //A{2} ifadesi ile "" ifadesinin içinde sadece A harfinden 2 tane varsa true döner.
        System.out.println("AAAAA".matches("A{5}"));
        //Sayılar için de geçerli.
        System.out.println("11111".matches("1{5}"));

        // A{5,} ifadesi A'dan en az 5 adet bulunursa true döndürür.
        System.out.println("AAAAAAAA".matches("A{5,}"));

        // A{0, 10} ifadesi A'dan en fazla 10 adet bulunursa true döndürür.
        System.out.println("AAAAAAA".matches("A{0,10}"));

        //A{4,10} ifadesi A'dan 4-10 arasında A harfi varsa true döner. (4,5,6,7,8,9,10)
        System.out.println("AAAA".matches("A{4,10}"));

        //"A?" ifadesi ya bir tane A olacak ya da eleman hiç olmayacak. Bu durumda true döner.
        System.out.println("A".matches("A?"));


    }
}
