package lotto.view;

import java.util.List;
import java.util.Map;
import lotto.domain.Lotto;
import lotto.domain.Rank;
import lotto.utils.GameMessage;

public class OutputView {
    public static void printException(Exception exception) {
        System.out.println(exception.getMessage());
    }

    public static void printTicketCount(int ticketCount) {
        System.out.println();
        System.out.printf(GameMessage.PURCHASED_TICKET_COUNT.getMessage(), ticketCount);
        System.out.println();
    }

    public static void printUserLottos(List<Lotto> userLottos) {
        for (Lotto lotto : userLottos) {
            System.out.println(lotto.getNumbers());
        }
    }

    public static void printRankCount(Map<Rank, Integer> rankCount) {
        System.out.println(); // 빈줄(삭제금지)
        System.out.println("당첨 통계");
        System.out.println("---");
        for (Rank rank : Rank.values()) {
            if (rank == Rank.MATCH_5_BONUS) {
                System.out.printf("5개 일치, 보너스 볼 일치 (%,d원) - %d개\n", rank.getPrize(), rankCount.getOrDefault(rank, 0));
            } else {
                System.out.printf("%d개 일치 (%,d원) - %d개\n", rank.getCountOfMatch(), rank.getPrize(),
                        rankCount.getOrDefault(rank, 0));
            }
        }
    }

    public static void printEarningRate(double earningRate) {
        System.out.printf("총 수익률은 %.1f%%입니다.", earningRate);
    }
}
