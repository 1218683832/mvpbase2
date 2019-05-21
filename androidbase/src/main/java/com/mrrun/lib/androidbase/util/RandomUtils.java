package com.mrrun.lib.androidbase.util;

import java.util.Random;

/**
 * Created by lipin on 2018/1/16.
 * <b>类功能描述:</b><br>
 * 随机数工具类 <br>
 *
 * @author lipin
 * @version 1.0
 */
public class RandomUtils {

    /**
     * 生成在min,max之间的随机整数
     *
     * @param min 最小数
     * @param max 最大数
     * @param hasLeft 包括最小数
     * @param hasRight 包括最大数
     * @return
     */
    public static int returnIntRandom(int min, int max, boolean hasLeft, boolean hasRight) {
        Random random = new Random();
        int result = random.nextInt(max) % (max - min + 1) + min;//生成在[min,max]之间的随机整数
        if (result == min && !hasLeft) {//不包括左边的最小数
            return result + 1;
        }
        if (result == max && !hasRight) {//不包括右边的最大数
            return result - 1;
        }
        return result;//返回随机到的原数
    }
}
