package com.hrtek.gnas.service.impl;

import com.hrtek.gnas.entity.NewsEntity;
import com.hrtek.gnas.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 新闻service实现类
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2018-01-04 16:17
 */
@Service
public class NewsServiceImpl implements NewsService {



    @Override
    public List<NewsEntity> list() {
//        return newsMapper.list();
        return null;
    }

    @Override
    public List<NewsEntity> getAddress() {
//        return newsMapper.getAddress();
        return null;
    }

    @Override
    public List<String> getTitlesByNewsAddressName(String newsAddressName) {
//        return newsMapper.getTitlesByNewsAddressName(newsAddressName);
        return null;
    }

    @Override
    public NewsEntity getNewsByTitle(String newsTitle) {
//        return newsMapper.getNewsByTitle(newsTitle);
        return null;
    }
}
