package com.restrainfurniture.BoniiKwiiDz.threads;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;

import java.util.*;

public class DownloadImg extends Thread 
{
    public DownloadImg(String skin_name){
        RestrainMod.logger.info("thread downloader has started....");
        RestrainMod.logger.info("For player: " + skin_name + " fetch");
        RestrainMod.logger.info("https://minecraftskinstealer.com/api/v1/skin/download/skin/"+skin_name);
        
    }
}