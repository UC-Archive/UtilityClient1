/*    */ package de.gamingcraft;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ 
/*    */ 
/*    */ public class Macros
/*    */ {
/* 11 */   public static File macro_file = new File("macros.txt");
/*    */   public static String loaded_config;
/* 13 */   public static ArrayList<Macro> macros = new ArrayList<>();
/* 14 */   public static ArrayList<KeyBinding> keyBinds = new ArrayList<>();
/* 15 */   private static String default_config = "Hub:/hub:45;Spawn:/spawn:48;GG:Good Game!:35";
/* 16 */   private static int i = 0;
/*    */   
/*    */   public static void onStart() throws IOException {
/* 19 */     if (Utils.createFile(macro_file)) {
/* 20 */       Utils.saveFile(macro_file, default_config);
/* 21 */       loaded_config = default_config;
/*    */     } else {
/* 23 */       loaded_config = Utils.loadFile(macro_file);
/*    */     } 
/* 25 */     macros = Utils.formatConfig(loaded_config);
/*    */     
/* 27 */     for (Macro m : macros) {
/* 28 */       addMacro(m);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void addMacro(Macro macro) {
/* 33 */     keyBinds.add(macro.getKeyBind());
/* 34 */     UtilityClient.keyBinds.add(macro.getKeyBind());
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\Macros.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */