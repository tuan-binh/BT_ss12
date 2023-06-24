package bt03;

import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> listProduct = new ArrayList<>();

    public ArrayList<Product> getAll() {
        return listProduct;
    }

    public void save(Product product) {
        if (findById(product.getId()) == null) {
            listProduct.add(product);
            System.out.println("===== Thêm Thành Công =====");
        } else {
            for (int i = 0; i < listProduct.size(); i++) {
                if (listProduct.get(i).getId() == product.getId()) {
                    listProduct.set(i, product);
                }
            }
            System.out.println("===== Sửa Thành Công =====");
        }
    }

    public void delete(int id) {
        if (findById(id) != null) {
            System.err.println("Không có để mà xóa");
        } else {
            for (int i = 0; i < listProduct.size(); i++) {
                if (listProduct.get(i).getId() == id) {
                    listProduct.remove(i);
                    break;
                }
            }
            System.out.println("===== Xóa Thành Công =====");
        }
    }

    public Product findById(int id) {
        for (Product p : listProduct) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int getNewId() {
        int idMax = 0;
        for (Product p : listProduct) {
            if (p.getId() > idMax) {
                idMax = p.getId();
            }
        }
        return idMax + 1;
    }

    public void sortPriceTang() {
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (listProduct.get(i).getId() > listProduct.get(j).getId()) {
                    Product temp = listProduct.get(i);
                    listProduct.set(i, listProduct.get(j));
                    listProduct.set(j, temp);
                }
            }
        }
    }

    public void sortPriceGiam() {
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (listProduct.get(i).getId() < listProduct.get(j).getId()) {
                    Product temp = listProduct.get(i);
                    listProduct.set(i, listProduct.get(j));
                    listProduct.set(j, temp);
                }
            }
        }
    }
}
