package com.shuyx.shuyxuser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shuyx.shuyxuser.dto.FileDTO;
import com.shuyx.shuyxuser.entity.FileEntity;

public interface FileService extends IService<FileEntity> {
    Object update(FileDTO dto);

    Object delete(Integer id,String fileName,String bucketName);

    Object add(FileDTO dto);

    Object findBy(FileDTO dto);

    Object pagelist(FileDTO dto);
}
