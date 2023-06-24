package bt03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ProductService productService = new ProductService();

    public static void main(String[] args) {
        int choose = 0;
        while (choose != 7) {
            System.out.println("==================== MENU ====================");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.println("==============================================");
            System.out.print("Nhập vào lựa chọn: ");
            choose = InputMethos.getInteger();
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
    }

    public static void addProduct() {
        Product newProduct = new Product();
        newProduct.setId(productService.getNewId());
        newProduct.inputData();
        productService.save(newProduct);
    }

    public static void editProduct() {
        System.out.print("Bạn muốn sửa sản phẩm có id là: ");
        int id = InputMethos.getInteger();
        Product product = productService.findById(id);
        if (product == null) {
            System.err.println("Không có sản phẩm này");
            return;
        }
        product.inputData();
        productService.save(product);
    }

    public static void deleteProduct() {
        System.out.print("Bạn muốn sửa sản phẩm có id là: ");
        int id = InputMethos.getInteger();
        productService.delete(id);
    }

    public static void showProduct() {
        for (Product p : productService.getAll()) {
            System.out.println(p);
        }
    }

    public static void searchProduct() {
        String text = InputMethos.getString();
        for (Product p : productService.getAll()) {
            if (p.getName().toLowerCase().equals(text.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public static void sortProduct() {
        System.out.println("Sắp Xếp Tăng");
        System.out.println("Sắp Xếp Giảm");
        int choose = InputMethos.getInteger();
        if (choose == 1) {
            productService.sortPriceTang();
            showProduct();
        }
        if (choose == 2) {
            productService.sortPriceGiam();
            showProduct();
        }
    }
}
