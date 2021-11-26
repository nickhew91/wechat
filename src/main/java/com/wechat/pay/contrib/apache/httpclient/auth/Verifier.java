package com.wechat.pay.contrib.apache.httpclient.auth;

import java.security.cert.X509Certificate;

/**
 * @author xy-peng
 */
public interface Verifier {

    boolean verify(String serialNumber, byte[] message, String signature);

    /**
     * 该方法已废弃，请使用 getLatestCertificate 代替
     */
    @Deprecated
    X509Certificate getValidCertificate();

    /**
     * 获取最新的证书
     *
     * @return
     */
    X509Certificate getLatestCertificate();

}
