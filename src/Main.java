public class Main {
    public static void main(String[] args) {
        int a = 2147;
        System.out.println(a);
        byte b = 13;
        System.out.println(b);
        short c = -324;
        System.out.println(c);
        long d = 456372L;
        System.out.println(d);
        float e = 3.14f;
        System.out.println(e);
        double f = 3.123312;
        System.out.println(f);

        float nOne = 27.12f;
        System.out.println(nOne);
        long nTwo = 987678965549L;
        System.out.println(nTwo);
        double mOne = 2.786;
        System.out.println(mOne);
        short mTwo = 569;
        System.out.println(mTwo);
        int bOne = -159;
        System.out.println(bOne);
        short bTwo = 27897;
        System.out.println(bTwo);
        byte vOne = 67;
        System.out.println(vOne);

        byte lydPavlovna = 23;
        byte anSergeevna = 27;
        byte ekatAndreevna = 30;
        int allPaper = 400;
        int allLeaner = lydPavlovna + anSergeevna + ekatAndreevna;
        System.out.println("Всего учеников " + allLeaner );
        int sheetsPeperOme = allPaper / allLeaner;
        System.out.println("На каждого ученика расчитано " + sheetsPeperOme + " листов бумаги");

        int bottlesTwoMinutes = 16;
        int bottlesOneMinutes = bottlesTwoMinutes / 2;
        int bottleTwentyMinutes = bottlesOneMinutes * 20;
        System.out.println("Машина производит за 20 минут " + bottleTwentyMinutes + " бутылок");
        int minuteInHours = 60;
        int hoursInDay = 24;
        int minuteInDay =minuteInHours * hoursInDay;
        int bottleOneDay = bottlesOneMinutes * minuteInDay;
        System.out.println("В сутки машина производит " + bottleOneDay + " Бутылок");
        int bottleThreeDays = bottleOneDay * 3;
        System.out.println("За 3 дня машина делает " + bottleThreeDays + " Бутылок");
        int bottleOneMounth = bottleThreeDays * 10;
        System.out.println("Машина за 1 месяц создает " + bottleOneMounth + " Бутылок");

        int potWhitePaint = 1;
        int potBrownPaint = 1;
        int potPaintOneClass = (potBrownPaint * 4) + (potWhitePaint * 2);
        System.out.println( potPaintOneClass + " банок краски на 1 класс нужно" );
        int allPot = 120;
        int allClass = allPot / potPaintOneClass;
        System.out.println(allClass + " классов в школе");
        int potWhitePainOneClass = 2;
        int potBrownPainOneClass = 4;
        int allPotWhitePaint = potWhitePainOneClass * allClass;
        int allPotBrownPaint = potBrownPainOneClass * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно "
                + allPotWhitePaint + " банок белой краски и " + allPotBrownPaint + " банок коричневой краски!" );

        int weightOneBananasGrams = 80;
        int weightIceCreamOneBrickGrams = 100;
        int weighOneEggGrams = 70;
        int weightOneCupMilkGrams = 105;
        int bananas = 5;
        int milk = 2;
        int iceCreamBrick = 2;
        int eggs = 4;
        int allBananas = bananas * weightOneBananasGrams;
        int allMilk = weightOneCupMilkGrams * milk;
        int allIceCream = iceCreamBrick * weightIceCreamOneBrickGrams;
        int allEggse = eggs * weighOneEggGrams;
        int allWeightProductsGrams = allBananas + allEggse + allMilk + allIceCream;
        System.out.println("В рецепте " + allWeightProductsGrams + " грамм продуктов");
        int gramsPerKg = 1000;
        double allWeightProductsKg = allWeightProductsGrams / (double)gramsPerKg;
        System.out.println("В рецепте " + allWeightProductsKg + " кг продуктов");

        int resultWeightKg = 7;
        gramsPerKg = 1000;
        int resultWeight = resultWeightKg * gramsPerKg;
        int oneWeightRation = 250;
        int twoWeightRation = 500;
        int oneResultDay = resultWeight / oneWeightRation;
        System.out.println("При употреблении 250 грамм еды в день, спортсмен похудеет за "
                + oneResultDay + " дней." );
        int twoResultDay = resultWeight / twoWeightRation;
        System.out.println("При употреблении 500 грамм еды в день, спортсмен похудеет за " +
                twoResultDay + " дней.");
        int averageResultDay = (oneResultDay + twoResultDay) / 2;
        System.out.println("В среднем спортсмен похудеет за " + averageResultDay + " дня.");

        int SalaryMaria = 67760;
        int SalaryDenis = 83690;
        int SalaryKris = 76230;
        double boostMounth =0.1;
        double boostSalaryMaria = (SalaryMaria * boostMounth) + SalaryMaria;
        double boostSalaryDenis = (SalaryDenis * boostMounth) + SalaryDenis;
        double boostSalaryKris = (SalaryKris * boostMounth) + SalaryKris;
        int oneYear = 12;
        double boostAnnualSalaryMaria = boostSalaryMaria * oneYear;
        double boostAnnualSalaryDenis = boostSalaryDenis * oneYear;
        double boostAnnualSalaryKris = boostSalaryKris * oneYear;
        int lastAnnualSalaryMaria = SalaryMaria * oneYear;
        int lastAnnualSalaryDenis = SalaryDenis * oneYear;
        int lastAnnualSalaryKris = SalaryKris * oneYear;
        double gapSalaryMaria = boostAnnualSalaryMaria - lastAnnualSalaryMaria;
        System.out.println("Маша теперь получает " + boostSalaryMaria + " рублей." + " Годовой доход вырос на " + gapSalaryMaria + " рублей");
        double gapSalaryDenis = boostAnnualSalaryDenis -lastAnnualSalaryDenis;
        System.out.println("Денис теперь получает " + boostSalaryDenis + " рублей." + " Годовой доход вырос на " + gapSalaryDenis + " рублей");
        double gapSalaryKris = boostAnnualSalaryKris - lastAnnualSalaryKris;
        System.out.println("Кристина теперь получает " + boostSalaryKris + " рублей." + " Годовой доход вырос на " + gapSalaryKris + " рублей");

        System.out.println("Задание выполнено! благодарю за проверку!");


















    }
}