/*    */ package de.gamingcraft;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Utils {
/*    */   public static String loadFile(File file) throws FileNotFoundException {
/* 11 */     Scanner s = new Scanner(file);
/* 12 */     StringBuilder str = new StringBuilder();
/* 13 */     while (s.hasNextLine()) {
/* 14 */       str.append("\n").append(s.nextLine());
/*    */     }
/* 16 */     return str.toString();
/*    */   }
/*    */   
/*    */   public static void saveFile(File file, String string) throws IOException {
/* 20 */     FileWriter fw = new FileWriter(file);
/* 21 */     fw.write(string);
/* 22 */     fw.close();
/*    */   }
/*    */   
/*    */   public static boolean createFile(File file) throws IOException {
/* 26 */     return file.createNewFile();
/*    */   }
/*    */   
/*    */   public static ArrayList<Macro> formatConfig(String raw) {
/* 30 */     ArrayList<Macro> macros = new ArrayList<>();
/* 31 */     String[] t = raw.split(";");
/* 32 */     for (String str : t) {
/* 33 */       String[] f = str.split(":");
/* 34 */       System.out.println("--------------- " + f[0] + " --- " + f[1]);
/* 35 */       macros.add(new Macro(f[0], f[1], new KeyBinding(f[0], Integer.parseInt(f[2]), "Utility Macros")));
/*    */     } 
/* 37 */     return macros;
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */