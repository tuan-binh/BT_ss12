package bt15;

import bt13.NodeTree;

import java.util.ArrayList;

public class PreOrder {
    public static void main(String[] args) {
        ArrayList<NodeTree<Integer>> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add(new NodeTree<>(i + 1));
        }

        list.get(0).setLeft(list.get(1));
        list.get(0).setRight(list.get(2));
        list.get(1).setLeft(list.get(3));
        list.get(1).setRight(list.get(4));

        list.get(0).postOrder(list.get(0));
    }
}
