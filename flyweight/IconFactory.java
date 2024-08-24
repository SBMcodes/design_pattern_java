package main.DesignPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    public static Map<String,Icon> iconCache = new HashMap<>();

    public static Icon getIcon(String iconName){
        if(iconCache.containsKey(iconName)){
            return iconCache.get(iconName);
        }
        else{
         if(iconName=="file"){
             iconCache.put("file",new FileIcon("File",new Image("./File.jpg")));
             return iconCache.get("file");
         } else if (iconName == "folder") {
             iconCache.put("folder",new FolderIcon("Folder",new Image("./Folder.jpg")));
             return iconCache.get("folder");
         }
        }
        return null;
    }
}
