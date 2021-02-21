package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }

    public int avg(int[] purchases) {
        int sum = sum(purchases);
        int result = sum / purchases.length;

        return result;
    }

    public int monthWithMax(int[] purchases) {
        int max = getMax(purchases);
        int monthWithMax = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    public int monthWithMin(int[] purchases) {
        int min = getMin(purchases);
        int monthWithMin = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }

    public int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        return max;
    }

    public int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        return min;
    }


    public int MountCountMoreAverage(int[] purchases) {
        int avg = avg(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int MountCountLessAverage(int[] purchases) {
        int avg = avg(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}

