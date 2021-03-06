/*    */ package jparanoia.shared;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class JPURLs
/*    */ {
/*    */   public static final String URLS_URL_STRING = "http://www.paranoia-live.net/jpreg/jparanoia/urls.html";
/* 10 */   public static URL URLS_URL = null;
/*    */   public static URL gameRegistrarURL;
/*    */   
/*    */   static
/*    */   {
/*    */     try {
/* 16 */       URLS_URL = new URL("http://www.paranoia-live.net/jpreg/jparanoia/urls.html");
/*    */     }
/*    */     catch (MalformedURLException localMalformedURLException) {
/* 19 */       JParanoia.errorMessage("Malformed master URL", "There is a problem with the master URL.\nPlease submit a bug report on\nhttp://byronbarry.com/jparanoia");
/*    */       
/*    */ 
/*    */ 
/* 23 */       localMalformedURLException.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public static void getURLs()
/*    */     throws java.io.IOException
/*    */   {
/* 30 */     BufferedReader localBufferedReader = http.HttpGetter.getFromURL(URLS_URL);
/*    */     
/*    */ 
/*    */ 
/* 34 */     String str1 = "";
/* 35 */     int i = -1;
/*    */     
/* 37 */     String str2 = null;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 42 */       while ((str1 = localBufferedReader.readLine()) != null)
/*    */       {
/* 44 */         if (str1.indexOf("GAME-REGISTRAR:") != -1) {
/* 45 */           str2 = "GAME-REGISTRAR";
/* 46 */           gameRegistrarURL = new URL(str1.substring(str1.indexOf(":") + 1));
/*    */         }
/*    */       }
/*    */     }
/*    */     catch (MalformedURLException localMalformedURLException)
/*    */     {
/* 52 */       JParanoia.errorMessage("Malformed URL", "There is a problem with the " + str2 + " URL.\n" + "Please submit a bug report on\n" + "http://www.byronbarry.com/jparanoia");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\noahc\Desktop\JParanoia(1.31.1)\JParanoia(1.31.1).jar!\jparanoia\shared\JPURLs.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */