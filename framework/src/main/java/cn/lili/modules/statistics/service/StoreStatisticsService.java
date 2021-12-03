package cn.lili.modules.statistics.service;

import cn.lili.modules.goods.entity.dos.Goods;
import cn.lili.modules.goods.entity.enums.GoodsAuthEnum;
import cn.lili.modules.goods.entity.enums.GoodsStatusEnum;
import cn.lili.modules.store.entity.dos.Store;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 店铺统计业务层
 *
 * @author Bulbasaur
 * @since 2020/12/9 11:06
 */
public interface StoreStatisticsService extends IService<Store> {

    /**
     * 获取待审核店铺数量
     *
     * @return 待审核店铺数量
     */
    Integer auditNum();

    /**
     * 获取所有店铺数量
     *
     * @return 店铺总数
     */
    Integer storeNum();

    /**
     * 获取今天的店铺数量
     *
     * @return 今天的店铺数量
     */
    Integer todayStoreNum();
}