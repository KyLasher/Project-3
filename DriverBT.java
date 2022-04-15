public class DriverBT {
    public static void main(String[] args)
    {
        System.out.println("1st Testing Example:");
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);

        System.out.println("(binaryTree) post-order: ");
        aTree.postorderTraverse();

        System.out.println("(binaryNode) post-order: ");
        aTree.postorderTraverse_callBinaryNodeMethod();

        System.out.println();

        System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());

        System.out.println();

        System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());

        System.out.println("==========================================");
        System.out.println();

        System.out.println("2nd Testing Example:");
        BinaryTree<String> aTree2 = new BinaryTree<>();
        createTree2(aTree2);

        System.out.println("(binaryTree) post-order: ");
        aTree2.postorderTraverse();

        System.out.println("(binaryNode) post-order: ");
        aTree2.postorderTraverse_callBinaryNodeMethod();

        System.out.println();

        System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());

        System.out.println();

        System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());

        System.out.println("Done.");
    }  // end main

    public static void createTree1(BinaryTree<String> tree)
    {
        // Leaves
        BinaryTree<String> lTree = new BinaryTree<>("L");
        BinaryTree<String> mTree = new BinaryTree<>("M");
        BinaryTree<String> pTree = new BinaryTree<>("P");
        BinaryTree<String> qTree = new BinaryTree<>("Q");
        BinaryTree<String> rTree = new BinaryTree<>("R");
        BinaryTree<String> sTree = new BinaryTree<>("S");
        BinaryTree<String> tTree = new BinaryTree<>("T");
        BinaryTree<String> uTree = new BinaryTree<>("U");
        BinaryTree<String> vTree = new BinaryTree<>("V");
        BinaryTree<String> wTree = new BinaryTree<>("W");
        BinaryTree<String> xTree = new BinaryTree<>("X");
        BinaryTree<String> yTree = new BinaryTree<>("Y");
        BinaryTree<String> zTree = new BinaryTree<>("Z");


        // Subtrees:
        BinaryTree<String> hTree = new BinaryTree<>("H", pTree, qTree);
        BinaryTree<String> iTree = new BinaryTree<>("i", rTree, sTree);
        BinaryTree<String> jTree = new BinaryTree<>("j", tTree, uTree);
        BinaryTree<String> kTree = new BinaryTree<>("k", vTree, wTree);
        BinaryTree<String> nTree = new BinaryTree<>("n", xTree, yTree);
        BinaryTree<String> oTree = new BinaryTree<>("o", zTree, null);
        BinaryTree<String> dTree = new BinaryTree<>("d", hTree, iTree);
        BinaryTree<String> eTree = new BinaryTree<>("e", jTree, kTree);
        BinaryTree<String> fTree = new BinaryTree<>("f", lTree, mTree);
        BinaryTree<String> gTree = new BinaryTree<>("g", nTree, oTree);
        BinaryTree<String> bTree = new BinaryTree<>("b", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("c", fTree, gTree);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("                   A                    ");
        System.out.println("                 /    \\                ");
        System.out.println("           B                 C          ");
        System.out.println("       /      \\        /       \\      ");
        System.out.println("      D        E       F         G      ");
        System.out.println("     / \\     / \\    / \\      / \\    ");
        System.out.println("    H   I    J   K   L   M     N   O    ");
        System.out.println("   /\\ /\\  /\\ /\\  /\\ /\\  /\\ /\\   ");
        System.out.println("  P  Q R S T  U V W          X  Y Z     ");
        System.out.println();
    } // end createTree

    /**-------------------------------------------------------------------- */
    /**Task 4: Create a tree case as shown in assignment 3*/
    public static void createTree2(BinaryTree<String> tree)
        {
            // Leaves
            BinaryTree<String> hTree = new BinaryTree<>("H");
            BinaryTree<String> iTree = new BinaryTree<>("I");
            BinaryTree<String> jTree = new BinaryTree<>("J");
            BinaryTree<String> lTree = new BinaryTree<>("L");
            BinaryTree<String> nTree = new BinaryTree<>("N");
            BinaryTree<String> oTree = new BinaryTree<>("O");
            BinaryTree<String> qTree = new BinaryTree<>("Q");
            BinaryTree<String> rTree = new BinaryTree<>("R");
            BinaryTree<String> sTree = new BinaryTree<>("S");

    
            // Subtrees:
            BinaryTree<String> pTree = new BinaryTree<>("P", sTree, null);
            BinaryTree<String> kTree = new BinaryTree<>("K", pTree, null);
            BinaryTree<String> mTree = new BinaryTree<>("M", qTree, rTree);
            BinaryTree<String> dTree = new BinaryTree<>("D", hTree, iTree);
            BinaryTree<String> eTree = new BinaryTree<>("E", jTree, kTree);
            BinaryTree<String> fTree = new BinaryTree<>("F", lTree, mTree);
            BinaryTree<String> gTree = new BinaryTree<>("G", nTree, oTree);
            BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
            BinaryTree<String> cTree = new BinaryTree<>("C", fTree, gTree);
    
            tree.setTree("A", bTree, cTree);
    
            System.out.println("\nGiven Tree:\n");
            System.out.println("                A                   ");
            System.out.println("          /           \\            ");
            System.out.println("         B             C            ");
            System.out.println("      /    \\        /    \\        ");
            System.out.println("     D      E       F      G        ");
            System.out.println("    / \\   / \\    / \\   / \\      ");
            System.out.println("   H   I  J   K    L  M   N  O      ");
            System.out.println("             /       / \\           ");
            System.out.println("            P       Q   R           ");
            System.out.println("           /                        ");
            System.out.println("          S                         ");
            System.out.println();
        } // end createTree
    } // end createTree2
  // end DriverBT
