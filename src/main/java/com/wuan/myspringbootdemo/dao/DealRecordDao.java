package com.wuan.myspringbootdemo.dao;

import com.wuan.myspringbootdemo.entity.DealRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dealRecordDao")
@Mapper
public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}
