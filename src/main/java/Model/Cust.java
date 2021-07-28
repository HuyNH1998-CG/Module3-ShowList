package Model;


public class Cust {
    private String ten;
    private String ngaysinh;
    private String DiaChi;
    private String Pic;

    public Cust() {
    }

    public Cust(String ten, String ngaysinh, String diaChi, String pic) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        DiaChi = diaChi;
        Pic = pic;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }
}
