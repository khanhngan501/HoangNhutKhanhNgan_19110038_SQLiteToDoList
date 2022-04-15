package hcmute.edu.vn.mssv19110038.hoangnhutkhanhngan_19110038_sqlitetodolist;

public class CongViec {
    private int IdCV;
    private String TenCV;

    public CongViec(int idCV, String tenCV) {
        IdCV = idCV;
        TenCV = tenCV;
    }

    public int getIdCV() {
        return IdCV;
    }

    public void setIdCV(int idCV) {
        IdCV = idCV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String tenCV) {
        TenCV = tenCV;
    }
}
