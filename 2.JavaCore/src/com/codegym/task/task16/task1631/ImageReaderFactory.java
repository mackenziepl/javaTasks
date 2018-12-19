package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes imageTypes) {
        ImageReader image = null;
        try {
                if(imageTypes.equals(ImageTypes.JPG)) image = new JpgReader();
                else if(imageTypes.equals(ImageTypes.BMP)) image = new BmpReader();
                else if(imageTypes.equals(ImageTypes.PNG)) image = new PngReader();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Unknown image type");
        }
             return image;
    }
}
