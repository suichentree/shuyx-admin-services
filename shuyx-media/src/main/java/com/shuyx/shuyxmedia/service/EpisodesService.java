package com.shuyx.shuyxmedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuyx.shuyxmedia.dto.EpisodesDTO;
import com.shuyx.shuyxmedia.dto.MediaDTO;
import com.shuyx.shuyxmedia.entity.EpisodesEntity;

public interface EpisodesService extends IService<EpisodesEntity> {
    Object add(EpisodesEntity one);

    Object delete(Integer episodesId);

    Object delete(Integer episodesId,String fileName,String bucketName);

    Object update(EpisodesEntity one);

    Object findBy(EpisodesDTO dto);

    Object pagelist(MediaDTO dto);
}
