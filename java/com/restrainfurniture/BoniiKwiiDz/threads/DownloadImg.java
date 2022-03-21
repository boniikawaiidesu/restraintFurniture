package com.restrainfurniture.BoniiKwiiDz.threads;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;

import java.util.*;

import java.util.List;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class DownloadImg extends Thread 
{
    public DownloadImg(String skin_name){
        RestrainMod.logger.info("thread downloader has started....");
        RestrainMod.logger.info("For player: " + skin_name + " fetch");
        RestrainMod.logger.info("https://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
        
    }
}