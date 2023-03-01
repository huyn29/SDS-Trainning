package bai3;

public class vanBan {
    private String vanBan;

    public vanBan() {
    }

    public vanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    // Phương thức đếm số từ trong văn bản
    public int demSoTu() {
        String chuoiTu = vanBan.trim();
        if (chuoiTu.isEmpty()) {
            return 0;
        }
        else{
            return chuoiTu.split("\\s+").length; //regex
        }
    }

    public String chuanHoaChuoi() {
        String chuoiTu = vanBan.trim();
        return chuoiTu.replaceAll("\\s+", " ").toLowerCase(); //regex
    }

    public String vietHoaChuoi() {
        return vanBan.toUpperCase();
    }

    public String vietThuong() {
        return vanBan.toLowerCase();
    }
    public String vietHoaChuCaiDau() {
        String[] chuoiTu = vanBan.split("\\s+"); //regex
        StringBuilder ketQua = new StringBuilder(); 
        for (String tu : chuoiTu) {
            if (!tu.isEmpty()) { 
                char kiTuDau = Character.toUpperCase(tu.charAt(0));
                String kiTuConLai = tu.substring(1).toLowerCase(); 
                ketQua.append(kiTuDau).append(kiTuConLai).append(" "); 
            }
        }
        return ketQua.toString().trim();
    }
}
