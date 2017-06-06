package com.jk.mapper.spellCheck;

import com.jk.entity.Banner;
import com.jk.entity.spellCheck.SpellCheck;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dell on 2017/5/24.
 */
public interface SpellCheckMapper {

    List<SpellCheck> getKyeWord(String keyWord);
}
