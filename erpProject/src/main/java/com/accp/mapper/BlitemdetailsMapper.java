package com.accp.mapper;

import com.accp.domain.Blitemdetails;
import com.accp.domain.BlitemdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlitemdetailsMapper {
    int countByExample(BlitemdetailsExample example);

    int deleteByExample(BlitemdetailsExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Blitemdetails record);

    int insertSelective(Blitemdetails record);

    List<Blitemdetails> selectByExample(BlitemdetailsExample example);

    Blitemdetails selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Blitemdetails record, @Param("example") BlitemdetailsExample example);

    int updateByExample(@Param("record") Blitemdetails record, @Param("example") BlitemdetailsExample example);

    int updateByPrimaryKeySelective(Blitemdetails record);

    int updateByPrimaryKey(Blitemdetails record);
}