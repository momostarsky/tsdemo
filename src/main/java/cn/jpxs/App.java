package cn.jpxs;

import org.dcm4che3.imageio.plugins.dcm.DicomImageReadParam;
import org.dcm4che3.io.DicomInputStream;
import org.opencv.core.Core;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



/**
 * Hello world!
 *
 */
public class App 
{

    static  {
        String lib = System.getProperty("java.library.path");
        lib = "./target/classes;" + lib;
        System.setProperty("java.library.path", lib);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main( String[] args )
    {
        System.out.println("Currrent Working Directory:"+ System.getProperty("user.dir") );
        ImageReader imageReader =  ImageIO.getImageReadersByFormatName("DICOM").next();
        File file =new File("/home/dhz/dcmdata/1.dcm");
        try (DicomInputStream dis = new DicomInputStream(file)) {
            imageReader.setInput(dis);
            DicomImageReadParam param = (DicomImageReadParam) imageReader.getDefaultReadParam();
             BufferedImage imgx = imageReader.read( 0, param);
             System.out.println( imgx != null);
            System.out.println( imgx.getWidth() +"X"+ imgx.getHeight());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ErrorRecord  er=new ErrorRecord();
        er.Test();


    }
}
