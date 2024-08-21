package btqueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Tao hang doi tai lieu
        Document document1 = new Document(1, "Chương trình học viện công nghệ BKACAD");
        Document document2 = new Document(2);
        document2.setContent("""
                Java (phiên âm Tiếng Việt: "Gia-va") là một ngôn ngữ lập trình hướng đối tượng, dựa trên lớp được thiết kế để có càng ít phụ thuộc thực thi càng tốt. 
                Nó là ngôn ngữ lập trình có mục đích chung cho phép các nhà phát triển ứng dụng viết một lần, chạy ở mọi nơi (WORA),
                [16] nghĩa là mã Java đã biên dịch có thể chạy trên tất cả các nền tảng hỗ trợ Java mà không cần biên dịch lại.
                [17] Các ứng dụng Java thường được biên dịch thành bytecode có thể chạy trên bất kỳ máy ảo Java (JVM) nào bất kể kiến trúc máy tính bên dưới. 
                Cú pháp của Java tương tự như C và C++, nhưng có ít cơ sở cấp thấp hơn các ngôn ngữ trên. Java runtime cung cấp các khả năng động (chẳng hạn như phản ánh và sửa đổi mã thời gian chạy) thường không có sẵn trong các ngôn ngữ biên dịch truyền thống. Tính đến năm 2019 Java là một trong những ngôn ngữ lập trình phổ biến nhất được sử dụng theo GitHub,[18][19] đặc biệt cho các ứng dụng web máy khách-máy chủ, với 9 triệu nhà phát triển đã được báo cáo.[20]
                """);

        Document document3 = new Document(3, "Xin chào các bạn!");

        // Thêm vào hàng đợi
        QueueDocument queueDocument = new QueueDocument(10);
        queueDocument.enqueue(document1);
        queueDocument.enqueue(document3);
        queueDocument.enqueue(document2);

        // Lấy ra tất các phần tử có trong hàng đợi.
        while (!queueDocument.isEmpty()) {
            Document document = queueDocument.dequeue();
            // Đang xử lý tài liệu
            System.out.println("Đang xử lý tài liệu mã: " + document.getCode());
            // Doc noi dung document => chuyen thanh viet hoa
            Thread.sleep(3000);
            String content = document.getContent().toUpperCase();
            System.out.println(content);
            System.out.println("Hoàn thành \n");
        }

    }
}
