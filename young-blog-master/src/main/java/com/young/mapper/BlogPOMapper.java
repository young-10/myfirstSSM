package com.young.mapper;

import com.young.entity.BlogPO;
import com.young.entity.BlogPOExample;
import com.young.entity.BlogPOWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogPOMapper {
    int countByExample(BlogPOExample example);

    int deleteByExample(BlogPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlogPOWithBLOBs record);

    int insertSelective(BlogPOWithBLOBs record);

    List<BlogPOWithBLOBs> selectByExampleWithBLOBs(BlogPOExample example);

    List<BlogPO> selectByExample(BlogPOExample example);

    BlogPOWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlogPOWithBLOBs record, @Param("example") BlogPOExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogPOWithBLOBs record, @Param("example") BlogPOExample example);

    int updateByExample(@Param("record") BlogPO record, @Param("example") BlogPOExample example);

    int updateByPrimaryKeySelective(BlogPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogPOWithBLOBs record);

    int updateByPrimaryKey(BlogPO record);
}