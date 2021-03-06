package com.alibaba.json.bvt;

import org.junit.Assert;

import com.alibaba.fastjson.util.IOUtils;

import junit.framework.TestCase;


public class Base64Test extends TestCase {
    public void test_base64() throws Exception {
        Assert.assertEquals(IOUtils.decodeFast(new char[0], 0, 0).length, 0);
        Assert.assertEquals(IOUtils.decodeFast("ABC".toCharArray(), 0, 3).length, 2);
    }
}
