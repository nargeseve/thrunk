package com.jprogrammers.beans;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by User on 12/02/14.
 */
@ManagedBean
public class CategoriesTreeBean implements Serializable {

    private TreeNode root;

    public CategoriesTreeBean() {
        root = new DefaultTreeNode("root" , null);

        TreeNode node0 = new DefaultTreeNode("Core Java" , root);
        TreeNode node01 = new DefaultTreeNode("Annotations" , node0);
        TreeNode node02 = new DefaultTreeNode("Swing" , node0);

        TreeNode node1 = new DefaultTreeNode("Hibernate" , root);
        TreeNode node2 = new DefaultTreeNode("JSF" , root);
    }

    public TreeNode getRoot() {
        return root;
    }

}
