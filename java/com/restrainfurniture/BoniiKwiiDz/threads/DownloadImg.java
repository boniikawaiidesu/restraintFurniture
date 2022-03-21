package com.restrainfurniture.BoniiKwiiDz.threads;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;

import java.util.*;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class DownloadImg extends Thread 
{
    BufferedImage hskin = null;

    public DownloadImg(String skin_name){
        RestrainMod.logger.info("thread downloader has started....");
        RestrainMod.logger.info("For player: " + skin_name + " fetch");
        RestrainMod.logger.info("https://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
        try{
            URL url = new URL("https://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
            hskin = ImageIO.read(url);
            ImageIO.write(hskin, "png",new File("/horny_skin_cache/skin_"+skin_name+".png"));
        }catch(IOException e){
            //RestrainMod.logger.info("Error Downloading skin for player: "+skin_name);
            e.printStackTrace();
        }
    }
}