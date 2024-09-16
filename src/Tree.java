import java.util.ArrayList;
import java.util.List;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
    private Integer root;
    private List<Tree> subtrees;

    public Tree(int root, List<Tree> subtrees) {
        this.root = root;
        if (subtrees == null) {
            this.subtrees = new ArrayList<>();
        }
        else {
            this.subtrees = new ArrayList<>(subtrees);
        }
    }

    public boolean is_empty() {
        return this.root == null;
    }

    public int size() {
        if (this.is_empty()) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree subtree : this.subtrees) {
                size += subtree.size();
            }
            return size;
        }
    }

    public int count(int item) {
        if (this.is_empty()) {
            return 0;
        }
        else {
            int num = 0;
            if (this.root == item) {
                num += 1;
            }
            for (Tree subtree : this.subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }

    public String toString() {
        return this.str_indented(0);
    }

    private String str_indented(int depth) {
        if (this.is_empty()) {
            return "";
        }
        else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < depth; i += 1) {
                s.append("  ");
            }
        }
    }


}
