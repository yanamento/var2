public class Main {
    public static void main(String[] args) {
        byte egg = 5;
        System.out.println(egg);
        short dog = 280;
        System.out.println(dog);
        int cat = 10000;
        System.out.println(cat);
        long pill = 5000000;
        System.out.println(pill);
        float salt = 6.7f;
        System.out.println(salt);
        double pepper = 15.95555555555;
        System.out.println(pepper);

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte x = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int allStudents = lP + aS + eA;
        int allPaper = 480;
        int paperForOne = allPaper / allStudents;
        System.out.println(paperForOne);

        byte bottle2 = 16;
        System.out.println("За 2 минуты машина произвела " + bottle2 + " штук бутылок");
        int bottle20 = bottle2 * 10;
        System.out.println("За 20 минут машина произвела " + bottle20 + " штук бутылок");
        int bottle24 = bottle2 * 720;
        System.out.println("За сутки машина произвела " + bottle24 + " штук бутылок");
        int bottle72 = bottle24 * 3;
        System.out.println("За 3 суток машина произвела " + bottle72 + " штук бутылок");
        int bottle1 = bottle24 * 30;
        System.out.println("За месяц машина произвела " + bottle1 + " штук бутылок");

        byte allPaint = 120;
        byte whitePaintFor1 = 2;
        byte brownPaintFor1 = 4;
        int allPaintFor1 = whitePaintFor1 + brownPaintFor1;
        int allClasses = allPaint / allPaintFor1;
        int allWhitePaint = allClasses * whitePaintFor1;
        int allBrownPaint = allClasses * brownPaintFor1;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

        byte bananas = 5;
        int gramBananas = bananas * 80;
        byte milk = 2;
        int gramMilk = milk * 105;
        byte ice = 2;
        int gramIse = 2 * 100;
        byte eggs = 4;
        int gramEggs = eggs * 4;
        int gramAll = gramBananas + gramMilk + gramIse + gramEggs;
        System.out.println("Вес завтрака составляет " + gramAll + " грамм");
        float kgAll = gramAll / 1000f;
        System.out.println("Вес завтрака составляет " + kgAll + " килограмм");

        int plan = 7000;
        int var1 = 250;
        int var2 = 500;
        int daysVar1 = plan / var1;
        System.out.println("За " + daysVar1 + " дней спортсмен сбросит 7 килограмм, если каждый день будет терять " + var1 + " грамм в день");
        int daysVar2 = plan / var2;
        System.out.println("За " + daysVar2 + " дней спортсмен сбросит 7 килограмм, если каждый день будет терять " + var2 + " грамм в день");
        int middle = (daysVar1 + daysVar2) / 2;
        System.out.println("За " + middle + " день спортсмен сбросит 7 килограмм, если каждый день будет терять 375 грамм в день");


        int masha1 = 67760;
        int mashaYear1 = masha1 * 12;
        int masha2 = masha1 + (masha1 / 10);
        int mashaYear2 = masha2 * 12;
        int differenceMasha = mashaYear2 - mashaYear1;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        int den1 = 83690;
        int denYear1 = den1 * 12;
        int den2 = den1 + (den1 / 10);
        int denYear2 = den2 * 12;
        int differenceDen = denYear2 - denYear1;
        System.out.println("Денис теперь получает " + den2 + " рублей. Годовой доход вырос на " + differenceDen + " рублей");
        int kris1 = 76230;
        int krisYear1 = kris1 * 12;
        int kris2 = kris1 + (kris1 / 10);
        int krisYear2 = kris2 * 12;
        int differenceKris = krisYear2 - krisYear1;
        System.out.println("Кристина теперь получает " + kris2 + " рублей. Годовой доход вырос на " + differenceKris + " рублей");
    }
}