package com.string;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class StringTest {
    public static void main(String[] args) {
        //StringChar();
        //isSame("emre", "emre");
        //test();
        //stringEquals();
        //stringLength();
        //stringCharAt();
        //stringSubstring();
        //stringConcat();
        //stringIndexOf();
        //stringReplace();
        //stringToLowerCase();
        //stringToUpperCase();
        //stringFormat();
        //regex();
        //codePointCount();
        //codePointAt();
        //codePointBefore();
        //offSetByCodePoints();
        //getChars();
        //stringSplit();
        //splitExample();
        //isEmpty();
        //getBytes();
        //contentEquals();
        //equalsIgnoreCase();
        //compareTo();
        //compare();
        //regionMatches();
        //startsWith();
        //endsWith();
        //join();
        //trim();
        //toCharArray();
        valueOf();
        copyValueOf();

    }

    private static final String fullName = "Yunus Emre Çiftçi";

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

    public static void contentEquals() {
        StringBuilder stringBuffer = new StringBuilder();
        StringBuilder yunusEmre = stringBuffer.append("Yunus Emre çiftçi");
        System.out.println(fullName.contentEquals(yunusEmre));
    }

    public static void equalsIgnoreCase() {
        String name = "yunus emre çiftçi";

        //equalsIgnoreCase büyük küçük harf duyarlılığı olmadan içerik eşleşmesi yapar.
        boolean b = fullName.equalsIgnoreCase(name);
        System.out.println(b);
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
        fullName.indexOf(1);


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

    public static void codePointCount() {
        String fullName = "Yunus Emre Çiftçi";
        //codePointCount metodu, Unicode karakterlerini sayar ve int tipinde bu veriyi tutar.
        //Parametre olarak başlangıç ve bitiş yeri alır. 2 tane int değer.
        int i = fullName.codePointCount(0, fullName.length());
        //17 değerini döndürecek.
        System.out.println("Codepoint metodu çıktısı: " + i);
        int i1 = fullName.codePointCount(2, fullName.length());
        //15 değerini döndürecek.
        System.out.println("Codepoint metodu çıktısı: " + i1);
        int length = fullName.length();

        //codePointCount ile length arasındaki fark: codePointCount, metindeki karakterlerin Unicode sayısını hesaplayan bir metotdur.
        //Arasındaki fark örneği
        String example = "👨‍👩‍👧‍👦";
        int example1 = example.length();
        int example2 = example.codePointCount(0, example.length());
        System.out.println("Difference between length and codePointCount: \nlength:  " + example1 + "\ncodePointCount: " + example2);
    }

    public static void codePointAt() {
        //codePointAt metodu bir parametre alır. Verilen parametre (örnek: 2) ilgili String'in
        //karakter indis değerini alır ve int bir değere o indise karşılık gelen karakterin Unicode değerini atar.
        System.out.println("Aşağıda fullName'in her bir karakterinin Unicode karşılığını dönen for döngüsü var. ");
        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            int j = fullName.codePointAt(i);
            System.out.println(c + ": " + j);

        }

    }

    public static void codePointBefore() {
        //Kendinden önceki karakterin unicode değerini alır kendine atar.
        //Y'nin unicode değeri: 89. u'nun: 117
        int i2 = fullName.codePointBefore(1);
        //1.indexte u harfi var ama u harfi codePointBefore metodundan sonra 117 dönmez 89 döner.
        System.out.println(i2);
        //Bu metot'la sıralama işlemi yaparken 1. indeksten başlamamak lazım. Çünkü hata alınır.
        for (int i = 1; i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            int j = fullName.codePointBefore(i);
            System.out.println(c + ": " + j);
        }

    }

    public static void offSetByCodePoints() {
        //ofsetByCodePoints metodu ilk verilen indeksten ikinci verilen parametredeki değer kadar kaydırma yapar.
        for (int i = fullName.offsetByCodePoints(0, 8); i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            int j = fullName.codePointAt(i);
            System.out.println(c + ": " + j);
        }
    }

    public static void getChars() {
        //getChars bir Stringteki karakterleri bir char array'ine atama işi yapar.

        //5 elemanlı char arrayi oluşturduk.
        char[] newName = new char[5];

        //fullName'deki karakterlerin 0. sından 5.sine kadar (5.index hariç) karakteri newName'in 0.indeksinden itibaren newName'e atadık.
        fullName.getChars(0, 5, newName, 0);
        System.out.println(newName);
    }

    public static void stringSplit() {
        //.split metodu paramtere olarak verilen string ifadeyi alır ve String'in içinde bu ifadeyi bulur ve stringi string dizisine çevirir yani böler.

        String country = "Turkey USA Italy England";
        String[] split = country.split(" ");
        for (String string : split) {
            System.out.println(string);
        }

        //USA döner.
        System.out.println(split[1]);

        //parametre olarak verilen limit değeri: mesela 2 verilde en fazla 2 parçaya böler split metodu. boş bırakılırsa bölebildiği kadar böler.
        String[] split1 = country.split(",", 2);
        for (String s : split1) {
            System.out.println(s);
        }
    }

    public static void splitExample() {
        String infoTurkey = "Turkey (Turkish: Türkiye, pronounced [ˈtyɾcije]), officially the Republic of Türkiye " +
                "(Turkish: Türkiye Cumhuriyeti [ˈtyɾcije dʒumˈhuːɾijeti] (listen)), is a transcontinental country " +
                "located mainly on the Anatolian Peninsula in West Asia, with a small portion on the Balkan Peninsula " +
                "in Southeast Europe. It borders the Black Sea to the north; " +
                "Georgia to the northeast; Armenia, Azerbaijan, and Iran to the east; Iraq to the southeast; " +
                "Syria and the Mediterranean Sea to the south; the Aegean Sea to the west; and Greece and Bulgaria to the northwest. " +
                "Cyprus is off the south coast. Most of the country's citizens are ethnic Turks, while Kurds are the largest ethnic minority.[4] " +
                "Ankara is Turkey's capital and second-largest city; Istanbul is its largest city and main financial centre.";
        String[] s = infoTurkey.split(" ");
        String longestWord = "";
        for (String country : s) {
            if (country.length() > longestWord.length()) {
                longestWord = country;
            }
        }
        System.out.println("Longest Word is: " + longestWord + " Number: " + longestWord.length());

    }

    public static void isEmpty() {
        //isEmpty everilen stringin dolu mu boş mu olduğunu kontrol eder. eğer String değer boşsa true döner.
        if (fullName.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        ;
    }

    public static void getBytes() {
        //fullName'in ASCII değerlerini alır bytes arrayine atar.
        byte[] bytes = fullName.getBytes();
        for (Byte b : bytes) {
            System.out.println(b);
        }
        //ASCII dışında başka bir yapıya dönüştürülmesini isterseniz StandardCharesets. metodunu kullanıp ekleyebiliriz..
        System.out.println("\n");
        byte[] bytes1 = fullName.getBytes(StandardCharsets.ISO_8859_1);
        for (byte b : bytes1) {
            System.out.println(b);
        }
    }

    public static void compareTo() {
        String name = "USA";
        String name2 = "UAE";

        //compareTo metodu leksikografik sıraya göre hesaplama yapar.
        //name2 ile name1 arasında alfabetik sıraya göre hareket eder.
        //USA U'su UAE'nin U'su ile eşleşti. S ile A eşleşmedi. S'nin ASCII tablosunda char sayısını A'nın ASCII tablsoundaki A sayısından çıkartıp ekrana yazar ve metot biter.
        //Sonu negatif sayı da olabilir.
        int i = name.compareTo(name2);
        System.out.println(i);
    }

    public static void compare() {
        //Büyük küçük harf duyarlılığı sağlar. comapreTo ile aynı işlevi görür.
        String s = "uSA";
        String d = "UAE";
        int i = s.compareToIgnoreCase(d);
        System.out.println(i);
    }

    public static void regionMatches() {
        String name = "Yunus Emre";

        //regionMatches metodu iki stringin belirli indekslerini karşılaştırır.
        /*1. parametre: fullName'in hangi indexinden başlanacağı,
         * 2. parametre: hangi değişkenle karşılaşacağını yazma,
         * 3. parametre: name'in hangi indexinden başlayacağı
         * 4. parametre: İki stringin kaç index karşılaştıracağı
         * */
        boolean b = fullName.regionMatches(0, name, 0, 5);
        System.out.println("Büyük küçük harf duyarlı: " + b);

        String name1 = "yunus Emre";

        //Karşılaştırılan String'lerin büyük küçük harf duyarlılığına sahip olmasını istemezseniz parametrelerin başına true yazabilirsiniz.
        boolean b1 = fullName.regionMatches(true, 0, name1, 0, 5);
        System.out.println("Büyük küçük harf duyarsız: " + b1);
    }

    public static void startsWith() {
        //startsWith Metodu String karşılaştırma yapar.
        boolean b = fullName.startsWith("Yunus Emre");
        System.out.println(b);

        //toffset parametresi ise ilk String'in hangi indexinden karşılaştırma yapacağımızı belirleriz.
        boolean b1 = fullName.startsWith("Yunus Emre", 0);
        System.out.println(b1);

    }

    public static void endsWith() {
        //endWith metodu fullName'in sondaki indexlerine bakarak eşitleme yapar. fulName'in sonunda Çiftçi vardı. tçi'yi kontrol edersek true alırız.
        //Büyük küçük harf duyarlıdır.
        boolean b = fullName.endsWith("tçi");
        System.out.println(b);
    }
    public static void join(){
        //join metodu dizi ve listelerin elemanlarını birleştirip tek bir String'te tutmamızı sağlar.
        //join metodu String sınııfından çağrılır. delimiter parametresi her eleman arasına ne ifade koyacağımızı belirler.
        //Dizi örneği
        String [] food = new String[]{"Patato, fish"};
        String join = String.join(" ", food);
        System.out.println(join);

        //Liste örneği
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Fenerbahçe");
        arrayList.add("Galatasaraya");
        arrayList.add("Beşiktaş");
        String join1 = String.join(" ", arrayList);
        System.out.println(join1);
    }
    public static void trim (){
        //trim metodu String'in başındaki ve sonundaki boşlukları kaldırır.
        String name = "   Yunus Emre ÇİFTÇİ   ";
        String trim = name.trim();
        System.out.println(trim);
    }
    public static void toCharArray(){
        //toCharArray metodu String değişkeni char arrayine dönüştürür.
        char[] charArray = fullName.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
    public static void valueOf(){
        //valueOf metodu veri türlerini belirli kısımlarını alır String olarak tutar.
        /*1. parametre: hangi char Arrayinin dönüştüreceğimiz.
        * 2. parametre: hangi indexten başlayacağımız.
        * 3. parametre: diziden kaç eleman çekeceğimiz(Sırayla çekilir.)
        * */
        char[] charArray = fullName.toCharArray();
        String s = String.valueOf(charArray,1,4);
        System.out.println(s);

        String s1 = String.valueOf(4);
        //4 sayısı s1 değişkeninde tutulan bir String'tir artık.
        System.out.println(s1);
    }
    public static void copyValueOf(){
        //valueOf ile aynı mantık ama sadece char array'lerini String'e çevirir.
        char[] charArray = fullName.toCharArray();
        String s = String.copyValueOf(charArray,0,5);
        System.out.println(s);
    }

}
