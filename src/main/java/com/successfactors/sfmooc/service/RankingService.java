package com.successfactors.sfmooc.service;

import com.successfactors.sfmooc.domain.Points;
import com.successfactors.sfmooc.domain.RankingItem;

import java.util.List;

public interface RankingService {

    List<RankingItem> getRankingListBySeason(String season);
    List<Points> getPointsDetailForUser(String userId);
    int updatePointsForHost(Integer sessionId, String userId);
    int updatePointsForCheckin(Integer sessionId, String userId);
    int updatePointsForLottery(Integer sessionId, Integer luckyNumber);
    int getTotalPoints(String userId);

}
