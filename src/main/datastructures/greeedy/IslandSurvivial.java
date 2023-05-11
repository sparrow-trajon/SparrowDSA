package greeedy;

public class IslandSurvivial {

    public static void main(String[] args) {
        int S = 48;
        int N = 28;
        int M = 27;
        int minDays = minimumDays2(S, N, M);
        System.out.println(minDays);
    }

    static int minimumDays(int S, int N, int M) {
        int totalDays = 0;
        if (M > N || ((M == N) && (S > 6))) {
            return -1;
        } else {
            if ((S > 6) && ((N - M) * 6 < M)) {
                return -1;
            } else {
                int totalFoodRequired = S * M;
                while (totalFoodRequired > 0) {
                    totalDays++;
                    totalFoodRequired -= N;
                }
                return totalDays;
            }
        }
    }

    static int minimumDays2(int S, int N, int M){
        int totalFoodRequired=S*M;
        int totalBuyingDays=S- (S/7);
        int totalDaysFoodToBePurchased=0;
        if(totalFoodRequired%N ==0){
            totalDaysFoodToBePurchased= totalFoodRequired/N;
        }
        else{
            totalDaysFoodToBePurchased= totalFoodRequired/N +1;
        }

        if(totalDaysFoodToBePurchased<totalBuyingDays){
            return totalDaysFoodToBePurchased;
        }
        else {
            return -1;
        }
    }
}
