package com.jk.service.spellCheck;

import com.jk.entity.spellCheck.SpellCheck;

import java.util.List;

/**
 * Created by Janan on 2017/5/27.
 */
public interface SpellCheckService {
    List<SpellCheck> getKeyWord(String keyWord);

}
