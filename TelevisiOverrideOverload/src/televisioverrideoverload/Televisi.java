package televisioverrideoverload;

public class Televisi {
    private String deskripsi;
    private int jumlahChannel, channelAktif, volume;
    private String[] channels;

    public Televisi(String deskripsi, int jumlahChannel) {
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public void setChannels(String[] channels) {
        if (channels.length > jumlahChannel) {
            System.out.println("Maaf tv ini hanya dapat menyimpan " + jumlahChannel + " channel");
            return;
        }
        this.channels = channels;
        System.out.println("Informasi channel berhasil diupdate!");
    }

    public void setChannelAktif(int channelAktif) {
        if (channelAktif > channels.length) {
            System.out.println("Channel yang anda inginkan belum diset!");
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Pindah channel ke : " + channels[this.channelAktif]);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Intensitas volume sekarang: "+ volume);
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String[] getChannels() {
        if (channels == null) {
            System.out.println("Belum ada channel yang diset!");
        }
        return channels;
    }
    
}
