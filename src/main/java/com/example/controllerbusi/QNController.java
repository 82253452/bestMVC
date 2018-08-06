package com.example.controllerbusi;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/qiniu")
public class QNController {
    /**
     * @api {get} rest/qiniu/token 01-查询七牛Token
     * @apiName Qiniu token
     * @apiGroup Qiniu
     * @apiSuccess {String} 1000 操作成功.
     * @apiSuccessExample Success-Response: HTTP/1.1 200 OK
     * {}
     * @apiError {String} 4000 操作失败.
     * @apiErrorExample Error-Response: HTTP/1.1 200
     * {}
     */
    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public JSONObject getToken() {
        JSONObject result = new JSONObject();

        String accessKey = "QGwnW_OYnSO3QR2osJ2mwqManZECHvFZ1tPq8bAv";
        String secretKey = "xQzpa36UhxHWj6PXHgNJJeGiFQifbOxVLDZ5zWue";
        String bucket = "avatar";

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null, 3600, new StringMap()
                .put("returnBody", " {\"key\": $(key), \"hash\": $(etag), \"w\": $(imageInfo.width), \"h\": $(imageInfo.height)}"));

        result.put("uptoken", upToken);
        return result;
    }
}
