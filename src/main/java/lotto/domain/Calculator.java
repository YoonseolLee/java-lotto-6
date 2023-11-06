package lotto.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    Map<Rank, Integer> rankCount = new HashMap<>();

    public static int calculateTotalPrize(Map<Rank, Integer> rankCount) {
        int totalPrize = 0;
        for (Rank rank : Rank.values()) {
            totalPrize += rank.getPrize() * rankCount.getOrDefault(rank, 0);
        }
        return totalPrize;
    }

    public double calculateEarningRate(int totalPrize, Money money) {
        return ((double) totalPrize / money.getMoney()) * 100;
    }

    public Map<Rank, Integer> calculateRankCount(List<Lotto> userLottos, WinningNumbers winningNumbers,
                                                 BonusNumber bonusNumber) {
        for (Lotto lotto : userLottos) {
            int countOfMatch = 0;
            for (Integer number : lotto.getNumbers()) {
                if (winningNumbers.contains(number)) {
                    countOfMatch++;
                }
            }
            boolean matchBonus = lotto.getNumbers().contains(bonusNumber.getBonusNumber());
            Rank rank = Rank.calculateRank(countOfMatch, matchBonus);
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }
        return rankCount;
    }
}
