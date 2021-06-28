package cn.jpxs;

import org.apache.log4j.Logger;
import org.opencv.core.Core;

/***
 * 初始化运行时环境
 * 动态设置 libopencv_java.so  的运行时位置
 */
public  final   class InitRuntimeEnv {

    static {
        String lib = System.getProperty("java.library.path");
        lib = "./target/classes;" + lib;
        System.setProperty("java.library.path", lib);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    private InitRuntimeEnv(){

    }
}
