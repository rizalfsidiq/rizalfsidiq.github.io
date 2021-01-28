package rfs.coverlagu.felixirwan.config;


import rfs.coverlagu.felixirwan.BuildConfig;

public class Pengaturan {

    /*
            Untuk remots ads (iklan online) menggunakan JSON maka ON_OFF_IKLAN ="1",
            sedangkan ON_OFF_IKLAN ="0" adalah mode iklan offline yang semua data di ambil dari Pengaturan.java
             */
    public static String ON_OFF_IKLAN ="1";


    /*
       Untuk remots ads (mo3 online) menggunakan JSON maka DATA_AUDIO ="1",
       sedangkan DATA_AUDIO ="0" adalah mode mp3 offline yang semua data di ambil dari folder asset
        */
    public static String DATA_AUDIO="0";


    /*
      ON_OFF_CATEGORI digunakan untuk memunculkan dan menyembunyikan kategori
      gunakan angka 0 untuk menyembunyikan dan angka 1 untuk memunculkan kategori
        */
    public static String ON_OFF_CATEGORI="1";


    /*PENGATURAN_IKLAN="1" untuk Admob,
      PENGATURAN_IKLAN="2" untuk FAN,
      PENGATURAN_IKLAN="3" untuk STARTAPP,
      PENGATURAN_IKLAN="4" untuk Mopub,
      PENGATURAN_IKLAN="5" untuk UNITY,
    */
    public static String PENGATURAN_IKLAN="1";



    /*
    json untuk Guide, More App, Iklan
     */
    public static final String URL_DATA = "https://iman24.github.io/rfs/alien_audio.json";

    /*Admob ID, jika aplikasi mada mode offline maka semua data iklan akan mengambil data dari Pengaturan.java
   Data pada pengaturan.java akan digantikan apabila anda bpada mode online,
   data akan digantikan dari adsremot_online.json
     */

    public static String ADMOB_INTER = "ca-app-pub-7436225079503837/1299934766";
    public static String ADMOB_BANNER = "ca-app-pub-7436225079503837/7163485591";
    public static String OPENADS = "ca-app-pub-7436225079503837/1299934766";

    /*Redirect App, ubah STATUS = "1" untuk melakukan redirect ke aplikasi baru, fitur ini harus tetap dalam
    kedaaan STATUS = "0"; selama aplikasi masih live
     */
    public static String STATUS = "0";
    public static String LINK = "https://play.google.com/store/apps/details?id=com.alquranterjemahanindonesia.guruandroid";



    /*
    Update App - mode online - hanya digunakan jika anda menggunakan mode online dan uplaod json ke hosting
    contoh pada Builde Gradle versioncode = 1 maka di json harus version_json = 1
    saat anda melakukan update versioncode = 2 maka di jason juga harus di ubah version_json = 2
    dengan kondisi ini, maka pengguna versioncode = 1 akan mendapatkan notifikasi

    */

    public static String FAN_INTER="YOUR_PLACEMENT_ID";
    public static String FAN_BANNER = "YOUR_PLACEMENT_ID";

    public static String STARTAPPID = "123456789";

    /*
    VERSI_APP = BuildConfig.VERSION_CODE; jangan di ubah tetap default
     */
    public static int VERSI_APP = BuildConfig.VERSION_CODE;

    /*
    silahkan ubah dengan link GDPR
     */
    public static String URL_GDPR="https://www.your.com/privacyurl";


    public static  boolean TESTMODE_FAN = false;

   public  static  int INTERVAL = 5;
   public static int counter =0;

    /*
    ID Mopub
    */
    public static String BANNER_MOPUB = "b195f8dd8ded45fe847ad89ed1d016da" ;
    public static String INTER_MOPUB = "24534e1901884e398f1253216226017e" ;


    public static  boolean TESTMODE_UNITY_ADS = false;
    public static String unityGameID = "3984905";
    public static String Unity_INTER = "interstitial";
    public static String Unity_BANNER = "Banner";

}

