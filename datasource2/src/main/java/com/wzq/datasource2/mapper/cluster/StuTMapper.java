package com.wzq.datasource2.mapper.cluster;


import com.wzq.datasource2.entity.cluster.StuT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author virus_plus
 * @since 2019-06-29
 */
@Mapper
public interface StuTMapper {

    List<StuT> getAllStuT();

}
