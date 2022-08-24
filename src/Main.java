public class Main {
    public static void main(String[] args) {
        //Task1.
        System.out.println("Задача 1: Аналогичное задание можно посмотреть на репозитории в первой дз");
        int i = 1;
        System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 2;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 3;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 4L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 0.1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 0.2d;
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();

        //Task2.
        System.out.println("Задача 2");
        float newFloat = 27.12f;
        long newLong = 987_678_965_549L;
        short newShort = 2;
        int newInt = 786;
        boolean bool = false;
        int secondInt = 569;
        int thirdInt = -159;
        int forthInt = 27897;
        int fifth = 67;
        System.out.println("Все инициализированно\n");

        //Task3.
        System.out.println("Задача 3");
        int scholarsLP = 23;
        int scholarsAS = 27;
        int scholarsEA = 30;
        int scholarsTotal = scholarsEA + scholarsAS + scholarsLP;
        int papers = 480;
        int paperPerScholar = papers / scholarsTotal;
        System.out.println("На каждого ученика рассчитано " + paperPerScholar + " листов бумаги");
        System.out.println();

        //Task4.
        System.out.println("Задача 4: некорректное ТЗ. В месяце разное количество дней...");
        int bottleProductivity = 16 / 2;
        int productivityOf20min = 20 * bottleProductivity;
        System.out.println("За 20 минут машина произвела " + productivityOf20min + " штук бутылок");
        int productivityOfDay = 24 * 60 * bottleProductivity;
        System.out.println("За сутки машина произвела " + productivityOfDay + " штук бутылок");
        int productivityOf3Day = 3 * productivityOfDay;
        System.out.println("За 3 дня машина произвела " + productivityOf3Day + " штук бутылок");
        int productivityOfMonth = 30 * productivityOfDay;
        System.out.println("За месяц машины произвела " + productivityOfMonth + " штук бутылок");
        System.out.println();

        //Task5.
        System.out.println("Задача 5");
        int numOfTin = 120;
        int numOfWhite = 2;
        int numOfBrown = 4;
        int numOfClasses = numOfTin / (numOfBrown + numOfWhite);
        System.out.println("В школе, где " + numOfClasses + " классов, нужно "+numOfClasses*numOfWhite+" банок белой краски и "+ numOfClasses*numOfBrown+ " банок коричневой краски");
        System.out.println();

        //Task6.
        System.out.println("Задача 6. Такая же как и в прошлом дз.");
        float bananaCount = 5;
        float oneBananaW = 80;
        float bananasWeight = bananaCount * oneBananaW;
        float milkV = 200;
        float milkDensity = 105f / 100;
        float milkWeight = milkV * milkDensity;
        float iceCount = 2;
        float oneIceW = 100;
        float iceWeight = iceCount * oneIceW;
        int eggCount = 4;
        float oneEggW = 70;
        float eggsWeight = eggCount * oneEggW;
        float totalWeightGrams = bananasWeight + milkWeight + iceWeight + eggsWeight;
        float totalWeightKg = totalWeightGrams / 1000;
        System.out.println("Breakfast weight " + totalWeightKg + " kg\n");

        //Task 6. Lose Weight
        System.out.println("Задача 7. Такая же как и в прошлом дз.");
        float loseWeightKg = 7;
        float gramsToKg = 1000;
        float lose250grams = 250;
        float lose500grams = 500;
        float daysToLose250 = loseWeightKg * gramsToKg / lose250grams;
        float daysToLose500 = loseWeightKg * gramsToKg / lose500grams;
        float meanDays = (daysToLose250 + daysToLose500) / 2;
        System.out.println("On average it tales " + (int) meanDays + " days to lose weight!");
        System.out.println("At worst it takes " + (int) daysToLose250 + " days to lose weight!");
        System.out.println("At best it takes " + (int) daysToLose500 + " days to lose weight!\n");

        //Task 5. Salary
        System.out.println("Задача 7. Такая же как и в прошлом дз.");
        float mashaSalaryPerMonth = 67_760;
        float denisSalaryPerMonth = 83_690;
        float kristinaSalaryPerMonth = 76_230;
        float increasingCoef = 1 + 0.1f;
        float newMashaSalaryPerMonth = mashaSalaryPerMonth * increasingCoef;
        float newDenisSalaryPerMonth = denisSalaryPerMonth * increasingCoef;
        float newKristinaSalaryPerMonth = kristinaSalaryPerMonth * increasingCoef;
        float deltaMashaSalary = (newMashaSalaryPerMonth - mashaSalaryPerMonth) * 12;
        float deltaDenisSalary = (newDenisSalaryPerMonth - denisSalaryPerMonth) * 12;
        float deltaKristinaSalary = (newKristinaSalaryPerMonth - kristinaSalaryPerMonth) * 12;

        System.out.println("Маша теперь получает " + newMashaSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaKristinaSalary + " рублей");
    }
}
