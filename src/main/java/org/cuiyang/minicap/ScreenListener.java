package org.cuiyang.minicap;

/**
 * 屏幕监听
 *
 * @author cuiyang
 * @since 2018/3/6
 */
public interface ScreenListener {

    /**
     * 映射
     * @param frame 一帧画面
     */
    void projection(byte[] frame);

}
