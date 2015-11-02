package br.vos.nos.eu.testeiicontece.Util;

import android.graphics.Bitmap;
import android.util.LruCache;


/**
 * Created by Lucas on 24/10/2015.
 */
public class BitMapCache extends LruCache<String,Bitmap> { //implements ImageLoader.ImageCache {

    public BitMapCache() {
        super(getDefaultLruCacheSize());
    }

    public static int getDefaultLruCacheSize() {
        final int maxMemory = (int)(Runtime.getRuntime().maxMemory()/1024);
        return maxMemory/8;
    }
}
