package de.ropemc.api.wrapper.net.minecraft.client.stream;

//import tv.twitch.broadcast.FrameBuffer;
//import tv.twitch.AuthToken;
//import tv.twitch.broadcast.IngestServer;
//import tv.twitch.broadcast.PixelFormat;
//import tv.twitch.broadcast.VideoParams;
//import tv.twitch.ErrorCode;
//import tv.twitch.broadcast.IngestList;
//import tv.twitch.broadcast.ChannelInfo;
//import tv.twitch.broadcast.StreamInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.stream.BroadcastController")
public interface BroadcastController {

    //void captureFramebuffer(FrameBuffer var0);

    boolean func_152817_A();

    //boolean func_152818_a(String var0, AuthToken var1);

    void func_152820_d(String var0);

    void func_152821_H();

    //FrameBuffer func_152822_N();

    boolean func_152823_L();

    //void func_152824_a(IngestServer var0);

    //PixelFormat func_152826_z();

    //void func_152827_a(BroadcastController$BroadcastState var0);

    boolean func_152828_a(String var0, String var1, String var2);

    void func_152831_M();

    void func_152832_e(String var0);

    //IngestServer func_152833_s();

    //VideoParams func_152834_a(int var0, int var1, float var2, float var3);

    void func_152835_I();

    //boolean func_152836_a(VideoParams var0);

    //IngestServerTester func_152838_J();

    boolean func_152840_a(String var0, long var1, String var2, String var3);

    //void func_152841_a(BroadcastController$BroadcastListener var0);

    void func_152842_a(String var0);

    long func_152844_x();

    boolean func_152845_C();

    boolean func_152847_F();

    boolean func_152848_y();

    boolean func_152849_q();

    boolean func_152851_B();

    //boolean func_152853_a(ErrorCode var0);

    boolean func_152854_G();

    //IngestList func_152855_t();

    boolean func_152858_b();

    long func_177946_b(String var0, long var1, String var2, String var3);

    boolean func_177947_a(String var0, long var1, long var2, String var3, String var4);

    //ChannelInfo getChannelInfo();

    //ErrorCode getErrorCode();

    //StreamInfo getStreamInfo();

    boolean isBroadcastPaused();

    boolean isBroadcasting();

    boolean isIngestTesting();

    //IngestServerTester isReady();

    boolean isReadyToBroadcast();

    boolean requestCommercial();

    void setPlaybackDeviceVolume(float var0);

    void setRecordingDeviceVolume(float var0);

    void statCallback();

    boolean stopBroadcasting();

    //ErrorCode submitStreamFrame(FrameBuffer var0);

}
