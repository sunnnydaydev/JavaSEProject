package com.funny.fake.call.utils

import java.io.File
import java.io.IOException

/**
 * Created by biaozhang on 2019/9/20 14:31
 *
 */
class ModifyFileName {

    companion object {
        /**
         * @function 用户指定文件夹路径（磁盘绝对路径），修改文件夹下的png文件名。
         * @param fileDirPath 文件夹绝对路径
         * @param srcStr 要替换的字符换
         * @param modifyFile2 修改文件名为
         * */
        fun modify(fileDirPath: String, srcStr: String, modifyFile2: String): Boolean {
            val file = File(fileDirPath)
            if (file.exists()) {
                val subFile = file.listFiles()
                for (f in subFile) {
                    if (f.isFile && isPhoto(f)) {
                        val tempName = f.name.replace(srcStr, modifyFile2)
                        val newFile = File(fileDirPath + tempName)
                        f.renameTo(newFile)
                    }
                }
            } else {
                throw IOException("input an Incorrect path,please ensure your path is right")
            }
            return true
        }

        /**
         * 判断是否是png或者jpg图片
         * */
        private fun isPhoto(file: File): Boolean {
            return file.name.endsWith(".png") || file.name.endsWith(".jpg")
        }
    }


}



