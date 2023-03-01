package bai3;

public class Main {
    public static void main(String[] args) {
        vanBan vb = new vanBan("  xin chao Moi Nguoi minh la huy");
        System.out.println("so tu: "+vb.demSoTu());
        System.out.println("Chuoi duoc chuan hoa: "+vb.chuanHoaChuoi());
        System.out.println("Viet hoa chuoi: "+vb.vietHoaChuoi());
        System.out.println("Viet thuong chuoi: "+vb.vietThuong());
        System.out.println("Viet hoa chu cai dau: "+vb.vietHoaChuCaiDau());
    }
}
