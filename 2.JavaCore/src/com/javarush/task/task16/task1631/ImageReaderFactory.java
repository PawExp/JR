package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes types) {
if (!(types instanceof ImageTypes)) throw new IllegalArgumentException();
    if (types == JPG) {
        return new JpgReader();
    } else if (types == PNG) {
        return new PngReader();
    } else if (types == BMP) {
        return new BmpReader();
    }
    return null;
    }
}
