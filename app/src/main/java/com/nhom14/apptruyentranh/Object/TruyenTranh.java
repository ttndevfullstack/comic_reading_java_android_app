package com.nhom14.apptruyentranh.Object;

public class TruyenTranh {
    private String TenTruyen,TenTrap,LinkAnh;

    public TruyenTranh(){}

    public TruyenTranh(String tenTruyen, String tenTrap, String linkAnh) {
        TenTruyen = tenTruyen;
        TenTrap = tenTrap;
        LinkAnh = linkAnh;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        TenTruyen = tenTruyen;
    }

    public String getTenTrap() {
        return TenTrap;
    }

    public void setTenTrap(String tenTrap) {
        TenTrap = tenTrap;
    }

    public String getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        LinkAnh = linkAnh;
    }




}
