package bai2;

public class kyThuat extends nhanVien{
    public String chuyenNganh;

    public kyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "nhanVien{" +
                "maNhanVien='" + super.getMaNhanVien() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", namSinh='" + super.getNamSinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
    @Override
    public String moTaCongViec() {
        return "Nhan vien ky thuat";
    }
}
