package com.ayout.upload.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;



/**
 * @Auther: Noviciate
 * @Date: 2020/4/11/011 22:09
 * @Description: ayout
 * @Version: 0.0.1
 */
@Service
public class UploadService {

    private static final List<String> CONTENT_TYPES = Arrays.asList("image/jpeg", "image/gif","application/x-jpg","image/png");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);

    public String upload(MultipartFile file) {

        String originalFilename = file.getOriginalFilename();
        // 校验文件的类型
        String contentType = file.getContentType();
        if (!CONTENT_TYPES.contains(contentType)){
            // 文件类型不合法，直接返回null
            LOGGER.info(originalFilename, "文件类型不合法：{}");
            System.out.println("1111文件类型不合法");
            return null;
        }

        try {
            // 校验文件的内容
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if (bufferedImage == null){
                LOGGER.info("文件内容不合法：{}", originalFilename);
                System.out.println("222文件内容不合法");

                return null;
            }

            // 保存到服务器
             file.transferTo(new File("F:\\code\\java\\noviciate\\code\\ayout\\image\\" + originalFilename));

            // 生成url地址，返回
            return "http://image.ayoutstore.com/" + originalFilename;
        } catch (IOException e) {
            LOGGER.info("服务器内部错误：{}", originalFilename);
            e.printStackTrace();
        }
        return null;
    }
}
