/*
	22.	Thông qua khung nhìn V_NHANVIEN 
    thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
    đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
    */
    use case_study_db;
    update v_nhan_vien
    set dia_chi="lien chieu";
    
    select * from v_nhan_vien; 