mindmap
  root((Hệ thống Đấu giá<br>Trực tuyến))
    ::icon(fa fa-gavel)
    %% CÁC VAI TRÒ CHÍNH %%
    (Người dùng<br>User - Khách)
      ::icon(fa fa-user)
      {Tài khoản}
        [Đăng nhập / Đăng ký]
        [Quản lý Hồ sơ]
        [Đổi mật khẩu]
      {Xem thông tin}
        [Tìm kiếm Sản phẩm]
        [Xem Chi tiết Phiên]
        [Xem Bảng xếp hạng Giá]
    (Người bán<br>Seller)
      ::icon(fa fa-store)
      {Tạo & Quản lý}
        [Đăng Sản phẩm Mới]
        [Sửa Sản phẩm<br>chưa đấu giá]
        [Đặt Giá Khởi điểm &<br>Bước giá]
      {Giao dịch}
        [Xác nhận Giao dịch]
        [Theo dõi Giao hàng]
        [Xem Doanh thu]
    (Người mua<br>Bidder)
      ::icon(fa fa-hand-paper)
      {Tham gia}
        [Đặt giá Bid]
        [Cài Auto-Bidding]
        [Xem Lịch sử Bid]
      {Theo dõi}
        [Bắn tin Outbid]
        [Danh sách Yêu thích]
        [Theo dõi Phiên sắp kết thúc]
    (Kiểm soát viên<br>Mod)
      ::icon(fa fa-eye)
      {Kiểm duyệt}
        [Xét duyệt Sản phẩm mới]
        [Hủy Phiên vi phạm]
        [Khóa Tài khoản]
      {Giải quyết}
        [Xử lý Tranh chấp]
        [Báo cáo nội dung xấu]
    (Quản trị viên<br>Admin)
      ::icon(fa fa-user-shield)
      {Cài đặt Hệ thống}
        [Quản lý User & Mod]
        [Cấu hình Phiên]
        [Sao lưu Dữ liệu]
      {Báo cáo & Phân tích}
        [Xem Thống kê Doanh thu]
        [Báo cáo Người dùng]

    %% CÁC CHỨC NĂNG CORE & NÂNG CAO %%
    (Lõi Nghiệp vụ<br>Auction Core)
      ::icon(fa fa-heartbeat)
      {Xử lý Bid}
        [Đồng bộ hóa Concurrency]
        [Xác thực Giá hợp lệ]
        [Xử lý Auto-Bid]
      {Thời gian thực}
        [Cập nhật Giá tức thì]
        [Hiển thị Time-left]
        [Tự động Kết thúc Phiên]
      {Anti-sniping}
        [Gia hạn giờ chót]

    %% PHÂN LOẠI SẢN PHẨM %%
    (Danh mục Đồ<br>Item Categories)
      ::icon(fa fa-tag)
      {Sản phẩm cơ bản}
        [Quần áo / Thời trang]
        [Sách / Tài liệu]
      {Sản phẩm đặc thù}
        [Electronics]
        [Art]
        [Vehicle]