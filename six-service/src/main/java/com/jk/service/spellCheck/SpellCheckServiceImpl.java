package com.jk.service.spellCheck;

import com.jk.entity.spellCheck.SpellCheck;
import com.jk.mapper.spellCheck.SpellCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Janan on 2017/5/27.
 */
@Service
public class SpellCheckServiceImpl implements SpellCheckService{
    @Autowired
    private SpellCheckMapper spellCheckMapper;

    @Override
    public List<SpellCheck> getKeyWord(String keyWord) {
        return spellCheckMapper.getKyeWord(keyWord);
    }
}
