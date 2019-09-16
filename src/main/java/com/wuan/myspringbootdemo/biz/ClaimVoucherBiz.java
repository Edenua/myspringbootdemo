package com.wuan.myspringbootdemo.biz;



import com.wuan.myspringbootdemo.entity.ClaimVoucher;
import com.wuan.myspringbootdemo.entity.ClaimVoucherItem;
import com.wuan.myspringbootdemo.entity.DealRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ClaimVoucherBiz {

    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);

    List<ClaimVoucher> getForSelf(String sn);
    List<ClaimVoucher> getForDeal(String sn);

    void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    void submit(int id);
    void deal(DealRecord dealRecord);
}
