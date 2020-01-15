package com.accp.mapper;

import com.accp.domain.Tprepaydetail;
import com.accp.domain.TprepaydetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TprepaydetailMapper {
    int countByExample(TprepaydetailExample example);

    int deleteByExample(TprepaydetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tprepaydetail record);

    int insertSelective(Tprepaydetail record);

    List<Tprepaydetail> selectByExample(TprepaydetailExample example);

    Tprepaydetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tprepaydetail record, @Param("example") TprepaydetailExample example);

    int updateByExample(@Param("record") Tprepaydetail record, @Param("example") TprepaydetailExample example);

    int updateByPrimaryKeySelective(Tprepaydetail record);

    int updateByPrimaryKey(Tprepaydetail record);
}