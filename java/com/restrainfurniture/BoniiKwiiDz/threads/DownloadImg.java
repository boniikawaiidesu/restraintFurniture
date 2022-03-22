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
    public DownloadImg(String skin_name){
		BufferedImage hskin = null;
        RestrainMod.logger.info("thread downloader has started....");
        RestrainMod.logger.info("For player: " + skin_name + " fetch");
        RestrainMod.logger.info("https://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
        try{
            //URL url = new URL("http://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
        	String page_url = "https://minecraft.tools/download-skin/"+skin_name;
        	URL url = new URL(page_url);
        	File directory = new File("HotCache");
        	if(! directory.exists()){
        	   directory.mkdir();
        	}
            hskin = ImageIO.read(url);
            String file_name = skin_name+"_skin.png";
            File img_out = new File(directory,file_name);
            ImageIO.write(hskin, "png",img_out);
        }catch(IOException e){
            RestrainMod.logger.info("Error Downloading skin for player: "+skin_name);
            e.printStackTrace();
            
        }
    }
}